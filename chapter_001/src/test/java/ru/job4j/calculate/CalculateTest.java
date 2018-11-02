    package ru.job4j.calculate;

    import org.junit.Test;
    import static org.hamcrest.core.Is.is;
    import static org.junit.Assert.assertThat;

    /**
     *Test.
     *
     * @author Alla Borodai (boroday12@gmail.com)
     * @version $Id$
     * @since 0.1
     */
    public class CalculateTest {
        /**
         *Test echo.
         */
        @Test
        public void whenTakeNameThenTreeEchoPlusName() {
            String input = "Alla Borodai";
            String expect = "Echo, echo, echo : Alla Borodai";
            Calculate calc = new Calculate();
            String result = calc.echo(input);
            assertThat(result, is(expect));
    }

}