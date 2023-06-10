package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E2ExcelFile {
    public static void main(String[] args) throws IOException {
        //relative path is going to search the path within your project

        String path="Files/Employees.xlsx";
        //FileInputStream-> bcz we do not want to lose the existing data and then we can append more data instead of overriding
        FileInputStream  fis=new FileInputStream(path);
        XSSFWorkbook xssfWb=new XSSFWorkbook(fis);
        Sheet sheet=xssfWb.getSheet("Sheet1");
        Row row=sheet.createRow(5);
        row.createCell(0).setCellValue("Moncef");
        row.createCell(1).setCellValue("M");
        row.createCell(2).setCellValue("Beglas");
        //creates an empty File
        FileOutputStream fos=new FileOutputStream(path);
        //data is written to that file
        xssfWb.write(fos);


    }
}
