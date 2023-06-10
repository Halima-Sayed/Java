package Class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
       // System.getProperty("user.dir");-> gives you the path till your project
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        //brings the data from the file in the form of bytes(ones and zeros)
        FileInputStream fis=new FileInputStream(path);
        //converts the data in the form of key value pairs
        Properties prop=new Properties();
        //this will load the data from the fis file to properties
        prop.load(fis);
        System.out.println(prop.getProperty("userName"));
        System.out.println(prop.containsKey("userName"));

    }
}
