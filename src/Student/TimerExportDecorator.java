package Student;
import java.util.List;

//LABORATOR 11
public class TimerExportDecorator extends ExportDecorator
{
    public TimerExportDecorator(IStudentiExport decoratedExport)
    {
        super(decoratedExport);
    }

    @Override
    public void doExport(List<Student> studenti)
    {
        // 1. Salvăm timpul de start
        long startTime = System.currentTimeMillis();

        // 2. Apelăm metoda doExport din clasa părinte (ExportDecorator)
        super.doExport(studenti);

        // 3. Salvăm timpul de final și calculăm diferența
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // 4. Afișăm rezultatul în consolă
        System.out.println("[TIMER DECORATOR] Timp de execuție: " + executionTime + " ms");
    }
}
