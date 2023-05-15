package Class21;

public class E1Poly {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Jack", "black", "German");
        animals[1] = new Cat("Tom", "blue", "Persian");
        animals[2] = new Horse("Spirit", "brown", "Arabian Horse");

        for (int i = 0; i < animals.length; i++) {
            animals[i].printInfo();
            animals[i].eat();
            animals[i].sleep();
            animals[i].speak();

            if (animals[i] instanceof Dog) {
                Dog dog2 = (Dog) animals[i];
                dog2.run();
            }
        }
        //Second way of writing code preferred to use enhanced loop
        Animal[] animals1={new Dog("Jack", "black", "German"),
                new Cat("Tom", "blue", "Persian"),
                new Horse("Spirit", "brown", "Arabian Horse")};
        for(Animal a: animals1) {
            a.printInfo();
            a.eat();
            a.sleep();
            a.speak();
        }
        Animal animal=new Dog("Jack", "black", "German");

        // we must type cast the animal back to a dog to call the run method
        //as this run method only exits in the Dof class.
        Dog d=(Dog) animal;
        d.run();
        //direct way without using a variable
        ((Dog)animal).run();

    }
}
