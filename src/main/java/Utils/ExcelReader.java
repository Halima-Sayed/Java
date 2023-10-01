package Utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    //this method is going to read the data from an excel and it is going to retun the data in form of list of maps
    public static List<Map<String, String>> read(String sheetName,String path) {
        FileInputStream fis=null;
        List<Map<String,String>> excelData = new ArrayList<>();
        try {
          fis= new FileInputStream(path);
            // that special call which knows how to read the data from excel files
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
            Sheet sheet = xssfWorkbook.getSheet(sheetName);

            Row headerRow = sheet.getRow(0);
            for (int rows = 1; rows < sheet.getPhysicalNumberOfRows(); rows++) {
                Row row = sheet.getRow(rows);

                Map<String, String> rowMap = new LinkedHashMap<>();
                for (int col = 0; col < row.getPhysicalNumberOfCells(); col++) {
                    String key = headerRow.getCell(col).toString();
                    String value = row.getCell(col).toString();
                    rowMap.put(key, value);
                }
                excelData.add(rowMap);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return excelData;
    }
}
