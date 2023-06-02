package class15;

public class E3 {
    //Create a method that takes an array as input.
    //It adds all the numbers from the array and returns the sum.
    //Name of the method should be sumArr.
    int sumArr(int [] a){

        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];

        return sum;
    }


    public static void main(String[] args) {
        E3 obj=new E3();
        int[] arr={1,2,2,4};
        System.out.println(obj.sumArr(arr));
    }
}
