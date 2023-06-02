package Class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
             // Below code us get any type of data from the console
              Scanner input= new Scanner(System.in);
              // down below print the text inside the console
        System.out.println("is it time for break true/false");
        /*
        boolean isBreak=> we are creating a variable of type boolean
        and calling it isBreak
        input=> is also a variable of type scanner
        nextBoolean()=> this is a method that helps us take a boolean type data
        from the keyboard
          = => equal to sign will store that value inside the isBreak variable
         */
        boolean isBreak=input.nextBoolean();
        /*
        if(isBreak)=>
         */
                if(isBreak){
                    System.out.println("Let's have a break");
                }else{
                    System.out.println("Lets continue the class");
                }
    }
}
