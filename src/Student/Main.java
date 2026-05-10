package Student;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        //LABORATOR 9
        System.out.println("\nLABORATOR 9");

        List<Student> studentiCuNote = Arrays.asList(
                new Student(1025, "Andrei", "Popa", "ISM141/2", 8.70),
                new Student(1024, "Ioan", "Mihalcea", "ISM141/1", 10),
                new Student(1026, "Anamaria", "Prodan", "TI131/1", 8.90),
                new Student(1029, "Bianca", "Popescu", "TI131/1", 10),
                new Student(1029, "Maria", "Pana", "TI131/2", 4.10),
                new Student(1029, "Gabriela", "Mohanu", "TI131/2", 7.33),
                new Student(1029, "Marius", "Nasta", "TI131/2", 3.20),
                new Student(1029, "Marius", "Nasta", "TI131/1", 5.12),
                new Student(1029, "Andrei", "Dobrescu", "TI131/2", 2.22)
        );

        System.out.println("\n--- Studenți cu nota 10 ---");
        studentiCuNote.stream().filter(s -> s.getMedie() == 10).forEach(System.out::println);

        System.out.println("\n--- Studenți cu nota sub 5 ---");
        studentiCuNote.stream().filter(s -> s.getMedie() < 5).forEach(System.out::println);

        List<Student> studentiCorectati = studentiCuNote.stream().map(s ->
                {
                    if (s.getMedie() < 4)
                    {
                        return new Student(s.numărMatricol, s.getPrenume(), s.getNume(), s.getFormatieDeStudiu(), 4.0);
                    }
                    return s;
                }).collect(java.util.stream.Collectors.toList());

        System.out.println("\n--- Lista studenți (după maparea notelor < 4 la 4) ---");
        studentiCorectati.forEach(System.out::println);

        double sumaNote = studentiCuNote.stream().map(Student::getMedie).reduce(0.0, (a, b) -> a + b);

        System.out.println("\nSuma notelor tuturor studenților: " + sumaNote);

        if (!studentiCuNote.isEmpty())
        {
            double mediaGenerala = sumaNote / studentiCuNote.size();
            System.out.println("Media generală a grupului: " + mediaGenerala);
        }
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