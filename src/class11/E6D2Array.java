package class11;

public class E6D2Array {
    public static void main(String[] args) {
        int[][] arr2D = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}

        };
        //  with the help of loop add all the elements for each row and print their sum

        for (int[] ints : arr2D) {
            int sum=0;
            for (int anInt : ints) {
                sum+=anInt;

            }
            System.out.print(sum+" ");
        }
    }
}
