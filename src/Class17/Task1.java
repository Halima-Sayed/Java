package Class17;

public class Task1 {
    //Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.
    int age;

    Task1(int ageNum){
        age=ageNum;
    }

    Task1(){
        System.out.println("0 constructor");
    }

    void printInfo(){
        System.out.println(age);
    }
}
