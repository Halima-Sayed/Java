package Class20;

public class Animals {
    /*
    Below we have fields/properties/attributes/instance variables
     */
    String name;
    int age;
    String color;

    Animals(String name, int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    void speak(){
        System.out.println("sounds cute");
    }
    void eat(){
        System.out.println("Eats cute");
    }
    void sleep(){
        System.out.println("Sleeps cute");
    }
}
class Cat extends Animals{

    Cat(String name, int age,String color) {
        super(name, age,color);
    }
}
class Dog extends Animals{
    Dog(String name, int age, String color) {
        super(name, age, color);
    }
    @Override
    void sleep(){
        System.out.println("I like to sleep for 10.6 hours a day");
    }
}
class Horse extends Animals{
    Horse(String name, int age, String color){
        super(name,age,color);
    }


}