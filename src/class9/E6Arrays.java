package class9;

public class E6Arrays {
    public static void main(String[] args) {
        /*
        create an array store 1,50,60,45,100 then print elements which
        are present on odd indexes
        expected 50,45
         */

        int [] num={1,50,60,45,100};
        // If starting point is 0 and, you add i+=2 u will get all even numbers
        //If starting point is 1 and, you add i+=2 you will get all odd numbers

        for (int i = 0; i < num.length; i++) {
            if (i%2==1){ // (i%2!=0)
                System.out.println(num[i]);
            }

        }
    }
}
