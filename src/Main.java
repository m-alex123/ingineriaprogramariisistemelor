import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main()
    {
        Student s1 = new Student(12345, "Ion", "Popescu", "ISM");
        Student s2 = new Student(112, "Maria", "Popa", "TI21/1");
        Student s3 = new Student(150, "Andrei", "Vasile", "TI21/2");

        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(s1);
        listaStudenti.add(s2);
        listaStudenti.add(s3);

        System.out.println("--- Lista de studenti ---");
        for (Student s : listaStudenti)
        {
            System.out.println(s);
            System.out.println();
        }
        System.out.println("-------------------------\n");

        Student cautat1 = new Student(120, "Alis", "Popa", "TI21/2");
        System.out.println("b) Este Alis Popa in lista? " + existaStudent(listaStudenti, cautat1));

        Student cautat2 = new Student(112, "Maria", "Popa", "TI21/1");
        System.out.println("c) Este Maria Popa in lista? " + existaStudent(listaStudenti, cautat2));
    }

    public static boolean existaStudent(List<Student> lista, Student deCautat)
    {
        for (Student s : lista)
        {
            if (s.nume.equals(deCautat.nume) && s.prenume.equals(deCautat.prenume) && s.formațieDeStudiu.equals(deCautat.formațieDeStudiu))
            {
                return true;
            }
        }
        return false;
    }
}
