import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{
    public static float gasesteNota(String prenume, String nume, Map<Integer, Student> tineri)
    {
        Map<String, Student> mapCautare = new HashMap<>();
        for (Student s : tineri.values())
        {
            String cheie = s.prenume + "-" + s.nume;
            mapCautare.put(cheie, s);
        }

        String cheieCautata = prenume + "-" + nume;
        if (mapCautare.containsKey(cheieCautata))
        {
            return mapCautare.get(cheieCautata).getNota();
        }

        return 0.0f;
    }
    public static void main()
    {
        Student s1 = new Student(12345, "Ion", "Popescu", "ISM");
        Student s2 = new Student(112, "Maria", "Popa", "TI21/1");

        Set<Student> setStudenti = new HashSet<>();
        setStudenti.add(s1);
        setStudenti.add(s2);

        System.out.println("--- Lista (Set) de studenti ---");
        for (Student s : setStudenti)
        {
            System.out.println(s);
            System.out.println();
        }

        Student cautat1 = new Student(120, "Cosmin", "Alexandru", "TI21/2");
        Student cautat2 = new Student(112, "Maria", "Popa", "TI21/1");

        System.out.println("\nb) Prezent Cosmin Alexandru? " + setStudenti.contains(cautat1));
        System.out.println("c) Prezent Maria Popa? " + setStudenti.contains(cautat2));
        System.out.println();

        //LABORATOR 4

        Map<Integer, Student> tineri = new HashMap<>();
        Student s3 = new Student(1029, "Bianca", "Popescu", "TI131/1");
        s3.setNota(9.10f);
        Student s4 = new Student(1024, "Ioan", "Mihalcea", "ISM141/1");
        s4.setNota(9.80f);

        tineri.put(s3.numărMatricol, s3);
        tineri.put(s4.numărMatricol, s4);

        float notaM = gasesteNota("Bianca", "Popescu", tineri);
        float notaN = gasesteNota("Ioan", "Popa", tineri);

        System.out.println("Nota Bianca Popescu: " + notaM);
        System.out.println("Nota Ioan Popa: " + notaN);

    }
}





