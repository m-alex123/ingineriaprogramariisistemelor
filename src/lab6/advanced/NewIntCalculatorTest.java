package lab6.advanced;
import lab6.advanced.NewIntCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NewIntCalculatorTest
{
    private NewIntCalculator calculator;

    @BeforeEach
    void setUp()
    {
        calculator = new NewIntCalculator().init();
    }

    @Test
    void testAddPositive()
    {
        calculator.add(10);
        Assertions.assertEquals(10, calculator.result());
    }

    @Test
    void testDivideBy0()
    {
        Assertions.assertThrows(ArithmeticException.class, () ->
        {
            calculator.divide(0);
        });
    }
    @Test
    void testMultiplyBy0()
    {
        calculator.add(5).multiply(0);
        Assertions.assertEquals(0, calculator.result());
    }

}
