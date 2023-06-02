package Class8;

public class E11NestedLoop {
    public static void main(String[] args) {

        /*
         2 4 6 8 10
         2 4 6 8 10
         2 4 6 8 10
         2 4 6 8 10

         */

        System.out.println();
        int counter=0;
        while (counter<4){
            for (int i = 2; i <=10; i+=2) {
                System.out.print(i+" ");
            }
            System.out.println();
            counter++;

        }

        }


}