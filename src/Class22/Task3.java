package Class22;

public class Task3 {
    //create a method to get the average of numbers from an array

    static int getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = sum / arr.length;
        return average;
    }

    public static void main(String[] args) {


        int[] numbers = {5, 10, 15, 20, 25};
        int avg = getAverage(numbers);
        System.out.println("The average is: " + avg);
    }
    //another way
    public double averageFromArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        return sum / arr.length;
    }
    //no return way
    void avgNumber(int[] array) {
        int sum=0;
        for (int i : array) {sum+=i;}
        System.out.println(sum/array.length);
    }
}