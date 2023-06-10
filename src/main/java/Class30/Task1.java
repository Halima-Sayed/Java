package Class30;

public class Task1 {
    public static void main(String[] args) {
        /*
        create a method that will take an array of ints and will return the sum
        of the elements of the array method should be accessible throughout the project
        and method should be callable by just writing the name of the class.
         */
        int [] a={10,10,10,40};
        System.out.println(sum(a));

    }
  public static int sum(int [] arr){
        int sum=0;
      for (int i : arr) {
          sum+=i;
      }
      return sum;
  }
}
