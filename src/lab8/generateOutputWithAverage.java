package lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class generateOutputWithAverage
{
    public void generateOutputWithAverage(String inputName, String outputName)
    {
        try (FileInputStream fis = new FileInputStream(new File(inputName));
             Workbook workbook = new XSSFWorkbook(fis);
             FileOutputStream fos = new FileOutputStream(outputName))
        {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet)
            {
                int lastCellNum = row.getLastCellNum();
                Cell newCell = row.createCell(lastCellNum);
                if (row.getRowNum() == 0)
                {
                    newCell.setCellValue("Media (Valoare)");
                } else
                {
                    double sum = 0;
                    int count = 0;
                    for (int i = 3; i < 6; i++)
                    {
                        Cell cell = row.getCell(i);
                        if (cell != null && cell.getCellType() == CellType.NUMERIC) {
                            sum += cell.getNumericCellValue();
                            count++;
                        }
                    }
                    if (count > 0) {
                        newCell.setCellValue(sum / count);
                    }
                }
            }
            workbook.write(fos);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
