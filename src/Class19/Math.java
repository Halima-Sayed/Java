package Class19;

public class Math {
    //We don't have to come up with different method names if the operation we are performing is the same
    //Method overloading is when a class has multiple methods with the same name but different parameters.
    // This allows the methods to perform slightly different tasks while still having the same name.
    // This is useful for making your code easier to read and use.
    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    static void add(int num1, double num2) {
        System.out.println(num1 + num2);
    }
    static void add(double num1,int num2){
        System.out.println(num1+num2);
    }
    static void add(long num1, long num2) {
        System.out.println(num1 + num2);
    }
    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }
    //The name + the parameters combined are called the signatures of a method
    static void add(double num1,double num2, int num3){
        System.out.println(num1+num2+num3);
    }
// we must have different 1) number of parameters 2)data types of parameters 3) sequence of data types

    public static void main(String[] args) {
        add(10,10);
        add(10,20.5);
        add(2.5,2.5);
        add(2222222L,222222L);
        add(2.5,5);
    }
}
