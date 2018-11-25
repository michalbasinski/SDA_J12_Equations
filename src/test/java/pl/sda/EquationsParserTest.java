package pl.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EquationsParserTest {
    private EquationsParser equationsParser;

    @Before
    public void setUp() {
        equationsParser = new EquationsParser();
    }

    @Test
    public void shouldParseEquation5x6Eq100() {
        //given
        final String equation = "5x+6=100";
        final Equation expectedEquation = new Equation(5, 6, 100);

        //when
        Equation result = equationsParser.parse(equation);
        
        //then
        Assert.assertEquals(expectedEquation, result);
    }
}
