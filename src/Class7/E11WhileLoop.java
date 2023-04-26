package Class7;

public class E11WhileLoop {
    public static void main(String[] args) {
        /*
        print numbers from 100 to 1
        print even number from 20 to 100
        print only odd numbers from 100 to 1
         */
        int num = 100;
        while (num > 0) { // same as writing num>=1
            System.out.print(num + " ");
            num--;
        }
        int num2=20;
        System.out.println();
        while (num2<=100){
            System.out.print(num2+" ");
            num2+=2;
        }
        int num3=100;
        System.out.println();
        while (num3>=1){
            // odd numbers when divided by 2 gives us 1 remainder
            if(num3%2==1){
                System.out.print(num3+" ");
            }
            num3--;

        }

    }

}

