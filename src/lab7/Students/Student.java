package lab7.Students;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Student
{
    private final String name;
    private final String formatieStudiu;

    public Student(String name, String formatieStudiu)
    {
        this.name = name;
        this.formatieStudiu = formatieStudiu;
    }

    public String getName() { return name; }
    public String getFormatieStudiu() { return formatieStudiu; }

    public static Student schimbaFormatia(Student st, String nouaFormatieDeStudiu)
    {
        return new Student(st.getName(), nouaFormatieDeStudiu);
    }

    @Override
    public String toString()
    {
        return name + " (" + formatieStudiu + ")";
    }
}

class StudentHelper {
    public static Set<Student> imparteInDouaFormatii(Set<Student> studenti, String f1, String f2)
    {
        Set<Student> rezultat = new HashSet<>();
        List<Student> lista = new ArrayList<>(studenti);
        int mid = (lista.size() + 1) / 2;

        for (int i = 0; i < lista.size(); i++)
        {
            String nouaFormatie = (i < mid) ? f1 : f2;
            rezultat.add(Student.schimbaFormatia(lista.get(i), nouaFormatie));
        }
        return rezultat;
    }
}
