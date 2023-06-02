package class14;

public class E5ArrayUtils {
    /*
    create a method, call it contains. It should take an array of int and an int number
    in the method body. It should search the array for that number.
    If number is present in the array method should return true otherwise method
    should return false. In a separate class call the method and test it for below input.
    {10,20,45} number 20
     */
    /*
    name of the method-> contains
    parameters-> int [] arr, int num
    body{
    int num=20;
       for (int i = 0; i <arr.length; i++)
     */
    boolean contains(int[] arr, int num) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}
