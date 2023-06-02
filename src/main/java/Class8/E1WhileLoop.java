package Class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        // to print all the numbers from a starting point to and end point
        // ask the user for starting and ending number
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the starting, ending number and the step");
        int start= scan.nextInt();
        int end= scan.nextInt();
        int step=scan.nextInt();


        int num=start;
        while (num<=end){
            System.out.print(num+" ");
           // num+=3; we have decided the step by 3
            num+=step; // user decides the step
          //  num++; we have decided the step by 1
        }


        }

    }


