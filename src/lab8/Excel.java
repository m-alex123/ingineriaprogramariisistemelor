package lab8;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel
{
    public static void main(String[] args)
    {
        String fisierInput = "laborator8_input.xlsx";
        String fisierOutput2 = "laborator8_output2.xlsx";
        String fisierOutput3 = "laborator8_output3.xlsx";

        System.out.println("=== Incepere Procesare Laborator 8 ===\n");

        // 8.5.1 Citire date din Excel
        System.out.println("--- Problema 8.5.1: Continut fisier input ---");
        readExcel cititor = new readExcel();
        cititor.readExcel(fisierInput);

        // 8.5.2 Generare fisier cu Media calculata manual (in Java)
        System.out.println("\n--- Problema 8.5.2: Generare medie (valori) ---");
        generateOutputWithAverage taskMedieValori = new generateOutputWithAverage();
        taskMedieValori.generateOutputWithAverage(fisierInput, fisierOutput2);
        System.out.println("Fisierul " + fisierOutput2 + " a fost generat.");

        // 8.5.3 Generare fisier cu Media folosind Formula Excel
        System.out.println("\n--- Problema 8.5.3: Generare medie (formula) ---");
        generateOutputWithFormula taskMedieFormula = new generateOutputWithFormula();
        taskMedieFormula.generateOutputWithFormula(fisierInput, fisierOutput3);
        System.out.println("Fisierul " + fisierOutput3 + " a fost generat.");

        System.out.println("\n=== Procesare finalizata cu succes! ===");
    }

}
