package Class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special call which knows how to read the data from excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int rowSize=sheet.getPhysicalNumberOfRows();
        for (int rows = 0; rows < rowSize; rows++) {
            Row row=sheet.getRow(rows);
            int colSize=row.getPhysicalNumberOfCells();
            for (int col = 0; col <colSize; col++) {
                System.out.print(row.getCell(col)+"\t");
            }
            System.out.println();
        }

     /*   System.out.print(row.getCell(0)+" ");
        System.out.print(row.getCell(1)+" ");
        System.out.print(row.getCell(2)+" ");
        System.out.print(row.getCell(3)+" ");
        System.out.print(row.getCell(4)+" ");

      */
    }
}
