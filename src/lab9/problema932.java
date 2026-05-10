package lab9;
import java.util.*;
import java.util.stream.Collectors;

public class problema932
{
    public static void main(String[] args)
    {
        String text = "Acesta este un program scris in java pentru expresii lambda";
        List<String> cuvinte = Arrays.asList(text.split(" "));

        List<String> cuvinteLungi = cuvinte.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());

        System.out.println("a) Cuvinte cu lungime >= 5: " + cuvinteLungi);
        System.out.println("   Numar total: " + cuvinteLungi.size());

        List<String> ordonate = cuvinteLungi.stream().sorted().collect(Collectors.toList());
        System.out.println("b) Lista ordonata: " + ordonate);

        cuvinte.stream()
                .filter(s -> s.startsWith("p")).findAny().ifPresent(p -> System.out.println("c) Element care incepe cu 'p': " + p));
    }
}
