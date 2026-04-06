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
    public static void main()
    {
        Student s1 = new Student(12345, "Ion", "Popescu", "ISM",9.5);
        Student s2 = new Student(112, "Maria", "Popa", "TI21/1",3.4);

        Set<Student> setStudenti = new HashSet<>();
        setStudenti.add(s1);
        setStudenti.add(s2);
        System.out.println("--- Lista (Set) de studenti ---");

        for (Student s : setStudenti)
        {
            System.out.println(s);
            System.out.println();
        }

        Student cautat1 = new Student(120, "Cosmin", "Alexandru", "TI21/2",5.6);
        Student cautat2 = new Student(112, "Maria", "Popa", "TI21/1",3.4);

        System.out.println("\nb) Prezent Cosmin Alexandru? " + setStudenti.contains(cautat1));
        System.out.println("c) Prezent Maria Popa? " + setStudenti.contains(cautat2));

        List<StudentBursier> bursieri = new ArrayList<>();

        bursieri.add(new StudentBursier(1025, "Andrei", "Popa", "ISM14/2", 8.70, 725.50));
        bursieri.add(new StudentBursier(1024, "Ioan", "Mihalcea", "ISM14/1", 9.80, 801.10));
        bursieri.add(new StudentBursier(1026, "Anamaria", "Prodan", "TI31/1", 8.90, 745.50));
        bursieri.add(new StudentBursier(1029, "Bianca", "Popescu", "TI11/1", 9.10, 780.80));

        writeToFile("bursieri_out.txt", bursieri);

        System.out.println("\nSalvarea datelor pentru bursieri a fost finalizată.");
    }
    public static void writeToFile(String filename, Collection<? extends Student> lista)
    {
        try (java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(filename)))
        {
            for (Student s : lista)
            {
                pw.println(s.toString());
            }
        } catch (java.io.IOException e)
        {
            System.err.println("Eroare la scrierea în fișier: " + e.getMessage());
        }
    }
}