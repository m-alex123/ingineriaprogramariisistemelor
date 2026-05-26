package Student;
import java.util.Arrays;
import java.util.List;

//LABORATOR 11
public class AplicatieCuDecorator
{
    public static void main(String[] args)
    {
        List<Student> studenti = Arrays.asList(
                new Student(1025, "Andrei", "Popa", "ISM141/2", 8.70),
                new Student(1024, "Ioan", "Mihalcea", "ISM141/1", 10),
                new Student(1026, "Anamaria", "Prodan", "TI131/1", 8.90),
                new Student(1029, "Bianca", "Popescu", "TI131/1", 10),
                new Student(1029, "Maria", "Pana", "TI131/2", 4.10),
                new Student(1029, "Gabriela", "Mohanu", "TI131/2", 7.33),
                new Student(1029, "Marius", "Nasta", "TI131/2", 3.20),
                new Student(1029, "Marius", "Nasta", "TI131/1", 5.12),
                new Student(1029, "Andrei", "Dobrescu", "TI131/2", 2.22)
        );

        Exporter exporter = new Exporter();

        System.out.println("=== RULARE COMPORTAMENT DECORAT (LABORATOR 11) ===");

        System.out.println("\n--- Export Consola ---");
        IStudentiExport exportConsola = new StudentiInConsola();
        IStudentiExport consolaDecorata = new TimerExportDecorator(exportConsola);
        exporter.startExport(consolaDecorata, studenti);

        System.out.println("\n--- Export Fișier Text ---");
        String fileNameTxt = "studentiDecoratorText.txt";
        IStudentiExport exportText = new StudentiInFisierText(fileNameTxt);
        IStudentiExport textDecorat = new TimerExportDecorator(exportText);
        exporter.startExport(textDecorat, studenti);

        System.out.println("\n--- Export Fișier Excel ---");
        String fileNameXlsx = "studentiDecoratorExcel.xlsx";
        IStudentiExport exportExcel = new StudentiInFisierXlsx(fileNameXlsx);
        IStudentiExport excelDecorat = new TimerExportDecorator(exportExcel);
        exporter.startExport(excelDecorat, studenti);
    }
}
