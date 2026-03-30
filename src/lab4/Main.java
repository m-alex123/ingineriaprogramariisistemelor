package lab4;
import java.util.*;

public class Main
{
    public static float gasesteNota(String prenume, String nume, Map<Integer, Student> tineri)
    {
        Map<String, Student> mapCautare = new HashMap<>();
        for (Student s : tineri.values())
        {
            String cheie = s.getPrenume() + "-" + s.getNume();
            mapCautare.put(cheie, s);
        }
        String cheieCautata = prenume + "-" + nume;
        Student studentGasit = mapCautare.get(cheieCautata);

        return (studentGasit != null) ? studentGasit.getNota() : 0.0f;
    }

    public static void main()
    {
        Map<Integer, Student> tineri = new HashMap<>();

        Student s1 = new Student(1029, "Bianca", "Popescu", "TI131/1");
        s1.setNota(9.10f);
        tineri.put(1029, s1);

        float notaM = gasesteNota("Bianca", "Popescu", tineri);
        float notaN = gasesteNota("Ioan", "Popa", tineri);

        System.out.println("Rezultat Bianca Popescu: " + notaM);
        System.out.println("Rezultat Ioan Popa: " + notaN);
    }
}
