package Class21;


class Animal{
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
    void speak(){
        System.out.println("Animals speak");
    }
    void sleep(){
        System.out.println("Animals sleep 1 to 20 hours a day");
    }
    void eat(){
        System.out.println("Animals eat many different things");
    }
}
class Cat extends Animal{

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Meow meow......");
    }
    @Override
    void eat(){
        System.out.println("Cats like to eat fish");
    }
    @Override
    void sleep(){
        System.out.println("Cats like to sleep 15 hours on average");
    }
}
public class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("woof woof");
    }
    @Override
    void eat(){
        System.out.println("Dogs like to chew on bones");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleep 8 hours");
    }
    void run(){
        System.out.println("Dogs can run fast");
    }
}
class Horse extends Animal{

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Neigh neigh....");
    }
    @Override
    void eat(){
        System.out.println("Horses like to eat carrots");
    }
    void sleep(){
        System.out.println("Horses sleep ");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Shaggy","Black","German");
        dog.printInfo();
        //Parent class variables can store the objects of the child class
        Animal dog1=new Dog("Hi","Brown","German");
        dog1.printInfo();

        Animal [] animals={new Dog("Shaggy","Black","German"),new Cat("Tom","Blue","Persian")};
        for (Animal a: animals) {
            a.printInfo();
        }
        //type casting(widening)
        double d=10;
        Animal dog2=new Dog("Shaggy","Black","German");

        int g =(int)10.5;
       // Dog dog3=(Dog)new Animal("Shaggy","Black","German"); NOT ALLOWED
    }
}