package Student;
import java.util.List;

//LABORATOR 10
public class Exporter
{
    public void startExport(IStudentiExport strategyInstance, List<Student> studenti)
    {
        strategyInstance.doExport(studenti);
    }
}
