package Student;
import java.util.Arrays;
import java.util.List;

//LABORATOR 10
public class AplicatieCuStrategy
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

        // a)
        IStudentiExport strategyConsole = new StudentiInConsola();
        exporter.startExport(strategyConsole, studenti);
        System.out.println();

        // b)
        String fileNameTxt = "studentiStrategyText.txt";
        StudentiInFisierText strategyFisierText = new StudentiInFisierText(fileNameTxt);
        exporter.startExport(strategyFisierText, studenti);
        System.out.println();

        // c)
        String fileNameXlsx = "studentiStrategyExcel.xlsx";
        StudentiInFisierXlsx strategyFisierExcel = new StudentiInFisierXlsx(fileNameXlsx);
        exporter.startExport(strategyFisierExcel, studenti);

        System.out.println("\n=========================================\n");

        // d)
        System.out.println("--- Rulare Strategie Citire (TXT) ---");
        IStudentiCitire citireTextStrategy = new StudentiDinFisierText(fileNameTxt);
        List<Student> studentiCititiDinTxt = citireTextStrategy.doCitire();
        System.out.println("Numar studenti incarcati din text: " + studentiCititiDinTxt.size());
        System.out.println();

        // e)
        System.out.println("--- Rulare Strategie Citire (XLSX) ---");
        IStudentiCitire citireXlsxStrategy = new StudentiDinFisierXlsx(fileNameXlsx);
        List<Student> studentiCititiDinXlsx = citireXlsxStrategy.doCitire();
        System.out.println("Numar studenti incarcati din Excel (Mock): " + studentiCititiDinXlsx.size());
    }
}