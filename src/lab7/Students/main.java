package lab7.Students;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main
{
    public static void main(String[] args) {
        Set<Student> studentiInitiali = new HashSet<>();
        studentiInitiali.add(new Student("Popescu Ion", "TEMP"));
        studentiInitiali.add(new Student("Ionescu Maria", "TEMP"));
        studentiInitiali.add(new Student("Georgescu Dan", "TEMP"));
        studentiInitiali.add(new Student("Vasilescu Ana", "TEMP"));
        studentiInitiali.add(new Student("Dumitru Elena", "TEMP"));

        System.out.println("Lista inițială:");
        studentiInitiali.forEach(System.out::println);

        Set<Student> studentiRepartizati = imparteInDouaFormatii(studentiInitiali, "TI 211_1", "TI 211_2");

        System.out.println("\nNoua listă după repartizare:");
        studentiRepartizati.forEach(System.out::println);
    }

    static Set<Student> imparteInDouaFormatii(Set<Student> studenti, String formatia1, String formatia2)
    {
        Set<Student> rezultat = new HashSet<>();
        List<Student> lista = new ArrayList<>(studenti);

        int mijloc = (lista.size() + 1) / 2;

        for (int i = 0; i < lista.size(); i++)
        {
            String numeFormatieNoua = (i < mijloc) ? formatia1 : formatia2;
            rezultat.add(schimbaFormatia(lista.get(i), numeFormatieNoua));
        }
        return rezultat;
    }
    //
    static Student schimbaFormatia(Student st, String nouaFormatieDeStudiu)
    {
        return new Student(st.getName(), nouaFormatieDeStudiu);
    }
}
