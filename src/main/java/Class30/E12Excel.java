package Class30;

import net.bytebuddy.dynamic.scaffold.MethodGraph;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E12Excel {
    public static void main(String[] args) {
        String path=System.getProperty("user.dir")+"\\Files\\Employees.xlsx";

        try {
            FileInputStream fileInputStream= new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=xssfWorkbook.getSheet("Sheet1");
            List<Map<String,String>> allExcelData=new ArrayList<>();
            Row row0=sheet.getRow(0);
            int noOfRows=sheet.getPhysicalNumberOfRows();
            for (int i = 1; i <noOfRows; i++) {
                Row row=sheet.getRow(i);
                int noOfCells=row.getPhysicalNumberOfCells();
                LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap<>();
                for (int j = 0; j <noOfCells ; j++) {
                    String key=row0.getCell(j).toString();
                    String value=row.getCell(j).toString();
                    linkedHashMap.put(key,value);
                }

                allExcelData.add(linkedHashMap);
            }
            System.out.println(allExcelData);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
