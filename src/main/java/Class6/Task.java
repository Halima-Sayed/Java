package Class6;

import java.io.InputStream;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        /*
        Prompt the user to enter person heights in inches.
        Person should be classified as one of the following:
        short (under 60 inch)
        medium (between 60-72 inch)
        tall (over 72 inch)
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your height inches");
        int height=input.nextInt();
        if(height<60){
            System.out.println("Short");
        }else if(height>=60&&height<=72){
            System.out.println("Medium");
        }else{
            System.out.println("Tall");
        }




    }
}
