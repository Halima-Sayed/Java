package Class8;

public class E8NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            System.out.print("* ");
        }


        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
            //  THIS WILL GIVE US ANOTHER ROW OF STARS BECAUSE WE COPIED AND PASTED

        }
    }
}