package Class22;

public class Task2 {
    //Create a method that will find a number from an array

    boolean findNum(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
    //another way
    public static int findIndexOfNumber(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target )
                return i;
        }
        return -1;
    }
}