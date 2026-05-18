package Student;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//LABORATOR 10

public class StudentiInFisierXlsx implements IStudentiExport
{
    private String fileName;

    public StudentiInFisierXlsx(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void doExport(List<Student> studenti)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName)))
        {
            writer.write("ID,Nume,Prenume,Grupa,Medie");
            writer.newLine();

            for (Student s : studenti)
            {
                writer.write(s.getId() + "," + s.getNume() + "," + s.getPrenume() + "," + s.getFormatieDeStudiu() + "," + s.getMedie());
                writer.newLine();
            }
            System.out.println("Fisierul Excel '" + fileName + "' a fost generat cu succes prin tehnica CSV!");
        } catch (IOException e)
        {
            System.err.println("Eroare la generarea fisierului Excel: " + e.getMessage());
        }
    }
}
