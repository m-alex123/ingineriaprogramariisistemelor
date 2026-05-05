package lab7.Students;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main
{
    public static void main(String[] args) {
        Set<Student> studentiInitiali = new HashSet<>();
        studentiInitiali.add(new Student("Popescu Ion", "TEMP"));
        studentiInitiali.add(new Student("Ionescu Maria", "TEMP"));
        studentiInitiali.add(new Student("Georgescu Dan", "TEMP"));
        studentiInitiali.add(new Student("Vasilescu Ana", "TEMP"));
        studentiInitiali.add(new Student("Dumitru Elena", "TEMP"));

        System.out.println("Lista inițială:");
        studentiInitiali.forEach(System.out::println);

        Set<Student> studentiRepartizati = imparteInDouaFormatii(studentiInitiali, "TI 211_1", "TI 211_2");

        System.out.println("\nNoua listă după repartizare:");
        studentiRepartizati.forEach(System.out::println);

        // Problema 8.5.4
        String xlsFileName = "laborator8_students.xlsx";
        writeToXls(studentiRepartizati, xlsFileName);
        System.out.println("\nStudentii au fost exportati in " + xlsFileName);

        // Problema 8.5.4
        List<Student> studentsFromXls = readFromXls(xlsFileName);
        System.out.println("\nStudenti cititi din fisierul Excel:");
        studentsFromXls.forEach(System.out::println);
    }

    public static void writeToXls(Set<Student> studenti, String fileName)
    {
        try (Workbook workbook = new XSSFWorkbook();
             FileOutputStream out = new FileOutputStream(fileName))
        {

            Sheet sheet = workbook.createSheet("Studenti");
            int rowNum = 0;

            for (Student st : studenti)
            {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(st.getName());
                row.createCell(1).setCellValue(st.getFormatieStudiu());
            }
            workbook.write(out);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static List<Student> readFromXls(String fileName)
    {
        List<Student> lista = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(new File(fileName));
             Workbook workbook = new XSSFWorkbook(fis))
        {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet)
            {
                String nume = row.getCell(0).getStringCellValue();
                String formatie = row.getCell(1).getStringCellValue();
                lista.add(new Student(nume, formatie));
            }
        } catch (IOException e)
        {
            System.err.println("Eroare la citirea fisierului: " + e.getMessage());
        }
        return lista;
    }

    static Set<Student> imparteInDouaFormatii(Set<Student> studenti, String formatia1, String formatia2)
    {
        Set<Student> rezultat = new HashSet<>();
        List<Student> lista = new ArrayList<>(studenti);

        int mijloc = (lista.size() + 1) / 2;

        for (int i = 0; i < lista.size(); i++)
        {
            String numeFormatieNoua = (i < mijloc) ? formatia1 : formatia2;
            rezultat.add(schimbaFormatia(lista.get(i), numeFormatieNoua));
        }
        return rezultat;
    }
    //
    static Student schimbaFormatia(Student st, String nouaFormatieDeStudiu)
    {
        return new Student(st.getName(), nouaFormatieDeStudiu);
    }
}
