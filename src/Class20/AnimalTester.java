package Class20;

public class AnimalTester {
   public static void main(String[] args) {
       Cat cat = new Cat("Oreo", 1, "Black and White");

       Dog dog = new Dog("Brownie", 2, "Brown");

       Horse horse = new Horse("Spirit", 15, "White");

       dog.sleep();

       cat.speak();
       cat.eat();
       cat.sleep();

       dog.speak();
       dog.eat();
       dog.sleep();

       horse.speak();
       horse.eat();
       horse.sleep();
   }

}
