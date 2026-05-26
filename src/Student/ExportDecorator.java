package Student;
import java.util.List;

//LABORATOR 11
public abstract class ExportDecorator implements IStudentiExport
{
    protected IStudentiExport decoratedExport;

    public ExportDecorator(IStudentiExport decoratedExport)
    {
        this.decoratedExport = decoratedExport;
    }
    @Override
    public void doExport(List<Student> studenti)
    {
        // Redirecționează apelul către componenta decorată
        this.decoratedExport.doExport(studenti);
    }
}
