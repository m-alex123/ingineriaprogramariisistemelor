package Student;
import java.util.ArrayList;
import java.util.List;

//LABORATOR 10

public class StudentiDinFisierXlsx implements IStudentiCitire
{
    private String fileName;

    public StudentiDinFisierXlsx(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public List<Student> doCitire()
    {
        System.out.println("[Excel Engine] Se deschide Workbook-ul si se citeste Sheet-ul principal din '" + fileName + "'...");
        List<Student> listaSimulata = new ArrayList<>();
        listaSimulata.add(new Student(9999, "MockNume", "MockPrenume", "MOCK101", 10.0));
        return listaSimulata;
    }
}
