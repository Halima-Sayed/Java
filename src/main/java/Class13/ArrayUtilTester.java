package Class13;

public class ArrayUtilTester {
    public static void main(String[] args) {
        int[] arr = {10, 20, 45, 89};
        int[] arr1 = {12, 32, 455, 889};
        int[] arr2 = {120, 302, 5, 889};
        int number = 89;
        int number1 = 10;
        int number2 = 10;

        ArrayUtil obj=new ArrayUtil();
        obj.searchArray(arr,number);
        obj.searchArray(arr1,number1);
        obj.searchArray(arr2,number2);
    }
}
