package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

   public static Properties getProperties(String path){
       FileInputStream fis=null;
       Properties properties=null;
       try {
           fis = new FileInputStream(path);
           properties = new Properties();
           properties.load(fis);
       }catch (IOException e){
           System.out.println("Please check the file at the path if it is available "+path);
       }finally {
           try {
               if (fis != null) {
                   fis.close();
               }
           } catch (IOException e) {
               System.out.println("Something bad happened with the file");
           }
       }
       return properties;
   }

    public static String getProperty(String key){

       Properties properties=getProperties(Constants.CONFIG_READER_PATH);
       String value=properties.getProperty(key);
       return value;
    }
}


