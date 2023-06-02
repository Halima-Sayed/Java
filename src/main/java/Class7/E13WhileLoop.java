package Class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        // ask the use for a number then print all the numbers from 1 till that number

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number greater than 1");
        int lastNumber= scan.nextInt();

        int counter=1;
        while (counter<=lastNumber){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
