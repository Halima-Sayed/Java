package Class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog= new Dog();
        actualDog.name="Jacky";
        actualDog.age=50;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;
        actualDog.isFat=true;

        actualDog.bark();

        Dog brownieobj=new Dog();
        brownieobj.name="Brownie";
        brownieobj.age=6;
        brownieobj.breed="Japanese";
        brownieobj.color="Brown";
        brownieobj.weight=40;
        brownieobj.isFat=false;

        actualDog.sleep();
    }
}
