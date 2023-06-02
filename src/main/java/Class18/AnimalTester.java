package Class18;



public class AnimalTester {
    /*
    create 5 classes of different animals cat,dog,zebra,camel,horse
    in each class create 5 fields and 3 methods
     */
    public static void main(String[] args) {
        Panda panda=new Panda();
        panda.sleep();
        panda.color="White and black";
        System.out.println(panda.color);

        Cat cat=new Cat();
        cat.name="Mano";
        cat.speak();

    }
}
