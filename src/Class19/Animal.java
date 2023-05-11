package Class19;
// create 3 classes like Dog Cat Horse define 5 properties in each class(use default access level).
//You can use inheritance to avoid duplication
// Create printInfo method that will print the values of these variables.
// create constructors as well in each child class to initialize those
// properties create one object of each class and call the printInfo method

public class Animal {
    private String name;
    private String color;
    private int age;
    private double price;
    private String breed;
    public Animal(String name, String color, int age, double price, String breed) {

        this.name = name;
        this.color = color;
        this.age = age;
        this.price = price;
        this.breed = breed;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+price+" "+breed);
    }
}
class Dog extends Animal {
    double weight;
    public Dog(String name, String color, int age, double price, String breed,double weight) {
        super(name, color, age, price, breed);
        this.weight=weight;
    }
    void printInfo(){
        super.printInfo(); // reusing the printInfo from the parent class by using super keyword
        System.out.println(weight);
    }
}
class Cat extends Animal{
    public Cat(String name, String color, int age, double price, String breed){
        super(name, color, age, price, breed);
    }
}
class Horse extends Animal{
    public Horse(String name, String color, int age, double price, String breed) {
        super(name, color, age, price, breed);
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Tom","Black",10,200.1,"German",20);
        dog.printInfo();

    }
}