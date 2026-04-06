package lab5Adv;
import java.util.*;

public class Lab5Adv
{
    public static void main()
    {
        NewIntCalculator calculator = new NewIntCalculator(10);
        int result = (Integer) calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + result);
        DoubleCalculator fCalculator = new DoubleCalculator(10);
        double result2 = (Double) fCalculator.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("b) " + result2);
    }
}

