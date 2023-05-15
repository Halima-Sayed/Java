package Class22;

public abstract class Animal {
    /*
 Create 3 animals like Dog Cat and Horse
 Define 3 common methods in each class like speak eat and sleep
 Create the object of all the classes and call the methods
  */
    private String name; //enhance the security we use private
   private String color;
    private String breed;

    Animal(String name,String color, String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;

    }
    //Abstraction is a process of hiding the implementation details and showing only functionality (method header) to the user.
    //Abstraction lets you focus on what the object does instead of how it does it.
   abstract void speak();
    abstract void eat();
    abstract void sleep();
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
}
class Dog extends Animal{
    Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Dogs go woof woof");
    }
    @Override
    void eat() {
        System.out.println("My dogs will eat your bones");
    }
    @Override
    void sleep() {
        System.out.println("Dogs sleep during the day");
    }
}
class Cat extends Animal{
    Cat(String name,String color,String breed){
        super(name,color,breed);
    }
    @Override
    void speak() {
        System.out.println("MEOW");
    }
    @Override
    void eat() {
        System.out.println("Cats eat fish");
    }
    @Override
    void sleep() {
        System.out.println("Cats sleep in cuteness");
    }
}
class Horse extends Animal{
    Horse(String name,String color,String breed){
        super(name,color,breed);
    }
    @Override
    void speak() {
        System.out.println("Horses go neigh neigh");
    }
    @Override
    void eat() {
        System.out.println("Horses eat carrots");
    }
    @Override
    void sleep() {
        System.out.println("Horses sleep in cuteness");
    }
}
class AnimalTester22{
    public static void main(String[] args) {
        //Animal abc=new Animal(); can't create object because the class Animal is abstract
        Animal[] animal={new Dog("Jacky","Black","Unknown"),new Cat("Tom","Blue","Siberian"),
                new Horse("Spirit","Brown","Wild")};
        for (Animal a : animal) {
            a.printInfo();
            a.eat();
            a.speak();
            a.sleep();
        }
    }
}

