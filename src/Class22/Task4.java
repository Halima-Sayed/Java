package Class22;

public class Task4 {
    //create a method count how many times the number is appearing in an array
    public static int getCount(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {


        int[] a = {1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 5};
        int b = 2;
        int end= getCount(a,b);
        System.out.println("The number "+b+" appears "+end+" time");
    }
}