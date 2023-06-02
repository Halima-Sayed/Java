package class11;

public class E1D2Array {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        // print only odd numbers from this 2D array
        //arr[i] -> gives me the array at specified index by i
        // int [] innerArray=arr[i]; -> innerArray.length
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // int elements=arr[i][j];
                //  if (elements%2!=0) %2==1
                if (arr[i][j] % 2 == 1) {  // %2!=0
                    System.out.print(arr[i][j] + " ");
                }

            }

        }

    }
}

