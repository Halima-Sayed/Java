package Class24;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class E1ArrayList {
    public static void main(String[] args) {
     /* ArrayList arrayList=new ArrayList();// When we do not specify no diamond operator then Object is created
      Object obj=new Scanner(System.in);//This is the GodFather class , all objects even array implement this class. It can handle anything
      ALLOWING EVERYTHING TO BE STORED IT IS BAD
      */
        ArrayList<Integer> arrayList=new ArrayList<>(); //primitive data types do not work with collection framework,are not supported with generics
        // Generics only allow classes
        // Java created classes called wrapper
        //For each primitive data type they created a class. Anything you can do with a primitive data type you can do with these classes
        //These classes also have methods static and non-static. int does not have methods.
        //Integer integer=new Integer(10);
        /*
        byte-> Byte
        short-> Short
        int->Integer
        long->Long
        float->Float
        double->Double
        boolean->Boolean
        char->Character
         */
        Integer integer=10;
        Integer integer1=20;
        String str="no";
        System.out.println(Integer.MAX_VALUE);
        int num=10;

        System.out.println(integer+integer1);
    }
}
