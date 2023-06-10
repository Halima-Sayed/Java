package Class26;

import Utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E4ConfigFiles {
    public static void main(String[] args) throws IOException {
        //this tells you where your project is stored the path
        System.out.println(System.getProperty("user.dir"));
       // String path=System.getProperty("user.dir")+"\\"+"Files\\Config.properties";
        //Constants.ConfigReaderPath is the path above that we created in the constants class in utils package so we don't write the same line of code multiple times
        System.out.println(Constants.CONFIG_READER_PATH);
        //FileInputStream is a class, it will navigate to file. Java brings the file from the location into the memory.
        FileInputStream fis=new FileInputStream(Constants.CONFIG_READER_PATH);
        //Now we need a software that can understand how this file works. Software is present in a form of a class
        //that special class that knows how this file works
        Properties prop=new Properties();
        //we first need to import the data from fis into properties
        prop.load(fis);
        //get the userName
        System.out.println(prop.getProperty("userName"));

    }
}
