package Class8;

public class E13NestedLoops {
    public static void main(String[] args) {
        /*
        2 2 2 2 2
        3 3 3 3 3
        4 4 4 4 4
         */

        for (int i = 2; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
        System.out.println();
        /*
        1 2 3 4 5
        2 3 4 5 6
        3 4 5 6 7
         */

        for (int i = 0; i < 3; i++) { // j<3 because I want to print 3 rows
            for (int j = 1; j<= 5; j++) {
                System.out.print(i +j+ " ");

            }
            System.out.println();
        }
     /*   for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + 2 + " ");

      */
        }
    }

