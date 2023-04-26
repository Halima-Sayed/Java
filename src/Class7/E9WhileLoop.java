package Class7;

import java.util.IllegalFormatCodePointException;

public class E9WhileLoop {
    public static void main(String[] args) {

        // print 25 20  10 5 using while loop HINT USE IF CONDITION
        // don't print 15 10 use if and !

        int counter=25;
        while (counter>=5){
            if(counter!=15 && counter!=10){
                System.out.print(counter+" ");
            }

            counter-=5; // when we put this inside the if {} then it will stop with !15 so it will not decrement fruther
            // we wont be able to see 10 5 just 25 and 20

        }
    }
}
