package lab9;
import java.util.*;
import java.util.stream.Collectors;

public class problema931
{
    public static void main(String[] args)
    {
        Random random = new Random();
        List<Integer> numere = random.ints(10, 5, 26).boxed().collect(Collectors.toList());
        System.out.println("Lista initiala: " + numere);

        int suma = numere.stream().reduce(0, Integer::sum);
        System.out.println("a) Suma elementelor: " + suma);

        numere.stream().max(Comparator.naturalOrder()).ifPresent(max -> System.out.println("b) Maximul: " + max));

        numere.stream().min(Comparator.naturalOrder()).ifPresent(min -> System.out.println("b) Minimul: " + min));

        List<Integer> filtrate = numere.stream().filter(n -> n >= 10 && n <= 20).collect(Collectors.toList());
        System.out.println("c) Elemente in [10..20]: " + filtrate);

        List<Double> doubleList = numere.stream().map(n -> n.doubleValue()).collect(Collectors.toList());
        System.out.println("d) Lista Double: " + doubleList);

        boolean gasit12 = numere.stream().anyMatch(n -> n == 12);
        System.out.println("e) Se gaseste valoarea 12? " + (gasit12 ? "Da" : "Nu"));
    }
}
