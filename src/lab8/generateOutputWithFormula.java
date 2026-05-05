package lab8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class generateOutputWithFormula
{
    public void generateOutputWithFormula(String inputName, String outputName)
    {
        try (FileInputStream fis = new FileInputStream(new File(inputName));
             Workbook workbook = new XSSFWorkbook(fis);
            FileOutputStream fos = new FileOutputStream(outputName))
        {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet)
            {
                int rowIdx = row.getRowNum() + 1;
                Cell formulaCell = row.createCell(row.getLastCellNum());
                if (row.getRowNum() == 0)
                {
                    formulaCell.setCellValue("Medie");
                } else
                {
                    formulaCell.setCellFormula("AVERAGE(D" + rowIdx + ":F" + rowIdx + ")"); //
                }
            }
            workbook.write(fos);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
