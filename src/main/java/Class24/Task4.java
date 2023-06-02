package Class24;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
         */
        ArrayList<Integer> evenNums=new ArrayList<>();
        for (int i = 2; i <=500 ; i++) {
            evenNums.add(i);
        }
        System.out.println(evenNums);
        System.out.println();
        evenNums.removeIf(number-> number%5==0);
        System.out.println(evenNums);
    }
}
