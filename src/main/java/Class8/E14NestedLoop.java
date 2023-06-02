package Class8;

public class E14NestedLoop {
    public static void main(String[] args) {

        /*
        1 1
        1 2
        1 3
        2 1
        2 2
        2 3
         */
     /*   for (int i = 1; i < 4; i++) {
            System.out.println("1 " + i);
        }
        for (int i = 1; i < 4; i++) {
            System.out.println("2 " + i);

      */
        for (int j = 1; j<3 ; j++) {
            for (int i = 1; i < 4; i++) {
                System.out.println(j+" "+i);

            }

        }
        }

    }
