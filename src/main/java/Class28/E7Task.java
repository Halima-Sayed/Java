package Class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E7Task {
    public static void main(String[] args) {
        //How would handle InputMismatchException?
        // Input Mismatch Exception when user enters mismatch value then programmer expected
        Scanner scan=new Scanner(System.in);
       try{
           scan.nextInt();
       }catch (InputMismatchException e){
           System.out.println("You have entered something other than numbers");
       }

    }
}
