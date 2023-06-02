package class9;

public class E2Arrays {
    public static void main(String[] args) {


        /*
        Create an array of int and store number from 30, 40,50, 90 inside it
        and access only number 50
         */

        int [] num={30, -5, 40,50,90};
        /*
        When we try to access an element using an index which does not exist
        Negative indexes will not work in Java but it will in Python -5 ->wrong
         */
        System.out.println(num[1]);

    }
}
