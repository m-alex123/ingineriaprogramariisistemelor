import java.util.*;

public class Main
{
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

        Student cautat1 = new Student(120, "Alis", "Popa", "TI21/2");
        Student cautat2 = new Student(112, "Maria", "Popa", "TI21/1");

        System.out.println("\nb) Prezent Alis Popa? " + setStudenti.contains(cautat1));
        System.out.println("c) Prezent Maria Popa? " + setStudenti.contains(cautat2));
    }
}





