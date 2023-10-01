package Class28;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args) {
        //there are two types of exceptions checked vs unchecked. For check you must write a try catch block and for unchecked you don't need too.

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Halim\\OneDrive\\Desktop\\JavaClasses\\Files\\Emp.xlsx");
        }catch (FileNotFoundException e){
            System.out.println("Hey the file you are trying to read is not found on the address specified");
        }
        System.out.println("line 6");
        System.out.println(10/0);// this is unchecked
    }
}
