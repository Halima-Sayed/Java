package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

   public static Properties getProperties(String path) throws IOException {
       FileInputStream fis=new FileInputStream(path);
       Properties properties=new Properties();
       properties.load(fis);
       return properties;
   }

    public static String getProperty(String key) throws IOException {

       Properties properties=getProperties(Constants.CONFIG_READER_PATH);
       String value=properties.getProperty(key);
       return value;
    }
}


