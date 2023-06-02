package class15;

public class Dog {

    String name;
    String color;
    int age;
    static int noLegs=4;

    static String planetName="Earth";

    static double weight;

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.color="green"; // instance variables cannot be shared that is why sout dog1.color will be null
        dog.weight=20;

        Dog dog1=new Dog();
        System.out.println(dog1.weight);
        System.out.println(dog1.color);
    }
}
