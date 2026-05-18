package Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//LABORATOR 10
public class StudentiDinFisierText implements IStudentiCitire
{
    private String fileName;

    public StudentiDinFisierText(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public List<Student> doCitire()
    {
        List<Student> listaStudenti = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String linie;
            while ((linie = reader.readLine()) != null)
            {
                String[] date = linie.split(",");
                if (date.length == 5)
                {
                    int id = Integer.parseInt(date[0]);
                    String nume = date[1];
                    String prenume = date[2];
                    String grupa = date[3];
                    double medie = Double.parseDouble(date[4]);

                    listaStudenti.add(new Student(id, nume, prenume, grupa, medie));
                }
            }
            System.out.println("Citirea din fisierul text s-a finalizat.");
        } catch (IOException | NumberFormatException e)
        {
            System.err.println("Eroare la citirea din fisier: " + e.getMessage());
        }
        return listaStudenti;
    }
}
