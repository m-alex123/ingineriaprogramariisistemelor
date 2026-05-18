package Student;
import java.util.List;

//LABORATOR 10

public class StudentiInConsola implements IStudentiExport
{
    @Override
    public void doExport(List<Student> studenti)
    {
        System.out.println("--- Export Studenti in Consola ---");
        for (Student s : studenti)
        {
            System.out.println(s);
        }
    }
}
