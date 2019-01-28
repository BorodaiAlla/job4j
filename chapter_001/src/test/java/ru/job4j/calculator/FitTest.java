package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FitTest {

    @Test
    public void manHeight() {
        Fit fit = new Fit();
        double weight = fit.manHeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    @Test
    public void womanHeight() {
        Fit fit = new Fit();
        double weight = fit.womanHeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}