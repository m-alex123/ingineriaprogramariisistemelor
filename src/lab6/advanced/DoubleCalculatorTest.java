package lab6.advanced;
import lab6.advanced.DoubleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoubleCalculatorTest
{
    private DoubleCalculator calculator;

    @BeforeEach
    void setUp()
    {
        calculator = new DoubleCalculator().init();
    }

    @Test
    void testSubtractNegatives()
    {
        calculator.add(-5.0).subtract(-2.0);
        Assertions.assertEquals(-3.0, calculator.result());
    }

    @Test
    void testDivideBy0()
    {
        calculator.add(10.0).divide(0.0);
        Assertions.assertTrue(Double.isInfinite(calculator.result()));
    }
}
