package Class17;

public class DogTester {
    // crate 5 objects of this dog class provide initial values and for each
    // object call the printInfo method.

    public static void main(String[] args) {
       /* Dog obj = new Dog();
        obj.name = "Coco";
        obj.color = "Brown";
        obj.breed = "German";
        obj.age = 5;
        obj.printInfo();

        Dog obj2 = new Dog();
        obj2.name = "Funny";
        obj2.color = "White";
        obj2.breed = "Bull dog";
        obj2.age = 6;
        obj2.printInfo();

        Dog obj3 = new Dog();
        obj3.name = "Snow";
        obj3.color = "Gray";
        obj3.breed = "Husky";
        obj3.age = 3;
        obj3.printInfo();

        Dog obj4 = new Dog();
        obj4.name = "Brownie";
        obj4.color = "White";
        obj4.breed = "poodle";
        obj4.age = 1;
        obj4.printInfo();

        Dog obj5 = new Dog();
        obj5.name = "Angry";
        obj5.color = "black";
        obj5.breed = "Siberian";
        obj5.age = 7;
        obj5.printInfo();

        */
        /*
        below code will create the object of Dog class
        new Dog("Jack","Black","Russian",12);
        new Dog();
                 */

        Dog dog1=new Dog("Jack","Black","Russian",12);
        dog1.printInfo();

        Dog dog2=new Dog("Shaggy","White","Husky",8);
        dog2.printInfo();

        Dog dog3=new Dog("Fluffy","Pink","British",7);
        dog3.printInfo();

        Dog dog4=new Dog("Papi","Brown","Asian",6);
        dog4.printInfo();

        Dog dog5=new Dog("Papi2","Brown Black Mix","Asian",6);
        dog5.printInfo();








    }
}
