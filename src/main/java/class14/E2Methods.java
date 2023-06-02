package class14;

public class E2Methods {
    /*
  Create a method that takes an int array call it sumArr
  and return the sum of all elements from that array
  create an object of the class and call the method
   */
    /*
    return type int
    name of the method->sumArr
    parameters-> (int[] arr)
    body->
    {
    go through all the elements of the array and add them and return results 
    }
     */
     int sumArr(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
         E2Methods obj=new E2Methods();
         int[]array={10,20,30};
        int result=obj.sumArr(array);
        System.out.println(result);
    }
}
