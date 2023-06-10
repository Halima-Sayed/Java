package Class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class E11Excel {
    public static void main(String[] args) throws FileNotFoundException {
        String path=System.getProperty("user.dir")+"\\Files\\Employees.xlsx";
        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
            Sheet sheet=xssfWorkbook.getSheet("Sheet1");

            int noOfRows=sheet.getPhysicalNumberOfRows();
            for (int i = 0; i <noOfRows; i++) {
                Row row=sheet.getRow(i);
                int noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j <noOfCells; j++) {
                    System.out.print(row.getCell(j)+"\t");
                }
                System.out.println();
            }

        }catch (IOException fnfe){
            fnfe.printStackTrace();
        }
    }
}
