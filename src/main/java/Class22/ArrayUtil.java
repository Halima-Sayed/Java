package Class22;

public interface ArrayUtil {
    //Search the array for the number if found return true
    public boolean searchArr(int [] array,int number);
    double getAvg(double [] arr);

    int getCount(double[] arr, double number);

    int add(int num1,int num2);
}
class Main22 implements ArrayUtil{

    @Override
    public boolean searchArr(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==number){
                return true;
            }
        }
        return false;
    }

    @Override
    public double getAvg(double []arr) {
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }

        return sum;
    }

    @Override
    public int getCount(double[] arr, double number) {
        int count = 0;
        for (double v : arr) {
            if (v == number) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

}