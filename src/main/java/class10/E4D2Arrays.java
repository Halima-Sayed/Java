package class10;

public class E4D2Arrays {
    public static void main(String[] args) {
        /*
        when ever we repeat code we should replace it with a loop
         */
        int[][] matrix = {
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };
        for (int j = 0; j < matrix.length; j++) {
            // getting the complete 1D array from 2D array
        int[] arr1 = matrix[j];
        for (int i = 0; i < arr1.length; i++) {
            // going over all the elements from 1D array
            System.out.print(arr1[i] + " ");



            }
        // to print all rows on new line
            System.out.println();
        }
    }
}