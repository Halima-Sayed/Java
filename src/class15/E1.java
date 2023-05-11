package class15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class E1 {
    // create a method that takes number call it size.
    // In the method body create an array of that size.
    // fill the array with some numbers let say 10 call and return the array.
    // call the method createArray.
    // createArray(5)-> {10,10,10,10,10}
    // createArray(3)->{10,10,10}
    /*
    /*
   The createArray(size) method takes an integer parameter size and
   creates an array of that size. It then fills the array with the number
   10 using a for loop, and finally returns the array.
    */
    // createArray(5) => {10,10,10,10,10}
    // createArray(3) => {10,10,10}
    int [] createArray(int size){
    int [] arr=new int[size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=10;
        }
    return  arr;
    }

    public static void main(String[] args) {
        E1 obj=new E1();
      int[] array=  obj.createArray(5);
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
     //   for (int i : array) {
       //     System.out.println(i);
        //}
     //   System.out.println(Arrays.toString(array));
    }
}
