package Class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {


        //ask the user to enter number if user enter any number
        // other than -1 print "Try again" and keep on asking the user for number
        // the moment user enters the number -1 the loop should stop

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scan.nextInt();

        while (number!=-1){
            System.out.println("Try again");
            number=scan.nextInt();
        }
    }

}



