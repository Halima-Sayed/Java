package Class5;

import java.util.Scanner;

public class E4NestedIf {
    public static void main(String[] args) {

        /*
        create a variable store the value 20000 inside that variable
        write if-else if money is greater than 10000 program should check another
        condition for example it should check what day is today if the day is
        Sunday it should say lets go shopping
         */
        int money = 20000;
        String day = "Monday";
        if (money < 10000) {
            if (day.equals("Sunday")) {
                System.out.println("Lets go shopping");
            } else {
                System.out.println("Lets wait for Sunday");
            }
        } else {
            System.out.println("Lets save more");
        }

    }
}
