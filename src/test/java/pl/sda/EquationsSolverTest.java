package pl.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EquationsSolverTest {

    private EquationsSolver equationsSolver;

    @Before
    public void setUp() {
        equationsSolver = new EquationsSolver();
    }

    @Test
    public void shouldReturn1IfEquationIsXPlus3Eq4() {
        //given
        final double a = 1;
        final double b = 3;
        final double c = 4;
        final double expectedResult = 1;

        //when
        double result = equationsSolver.solve(a, b, c);

        //then
        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void shouldReturnMinus1IfEquationIs3XPlus3Eq0() {
        //given
        final double a = 3;
        final double b = 3;
        final double c = 0;
        final double expectedResult = -1;

        //when
        double result = equationsSolver.solve(a, b, c);

        //then
        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void shouldThrowExceptionWhenEquationIsIncorrect() {
        //given
        final double a = 0;
        final double b = 0;
        final double c = 4;

        //when
        try {
            equationsSolver.solve(a, b, c);
            Assert.fail("Wyjatek nie zostal rzucony!");
        } catch (IncorrectEquationException e) {
            //then
            Assert.assertTrue(e instanceof IncorrectEquationException);
        }
    }
}
