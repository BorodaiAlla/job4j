package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FitTest {

    @Test
    public void manHeight() {
        Fit fit = new Fit();
        double height = fit.manHeight(180);
        assertThat(height, closeTo(92.0, 0.1));
    }

    @Test
    public void womanHeight() {
        Fit fit = new Fit();
        double height = fit.womanHeight(170);
        assertThat(height, closeTo(69.0, 0.1));
    }
}