package lab5;
import java.util.*;

public class Main
{
    public static void main()
    {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).substract(3).multiply(2).result();
        System.out.println("a) " + result);

        AdvancedCalculator advCalc = new AdvancedCalculator(10);
        int finalResult = advCalc.add(10).divide(2).power(2).root(2).result();
        System.out.println("b) " + finalResult);
    }
}
