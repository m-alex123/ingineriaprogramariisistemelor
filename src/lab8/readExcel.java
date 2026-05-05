package lab8;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readExcel
{
    public void readExcel(String fileName)
    {
        try (FileInputStream fis = new FileInputStream(new File(fileName));
             Workbook workbook = new XSSFWorkbook(fis))
        {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet)
            {
                for (Cell cell : row)
                {
                    switch (cell.getCellType())
                    {
                        case STRING -> System.out.print(cell.getStringCellValue() + "\t");
                        case NUMERIC -> System.out.print(cell.getNumericCellValue() + "\t");
                    }
                }
                System.out.println();
            }
        } catch (IOException e)
         {
            e.printStackTrace();
        }
    }
}