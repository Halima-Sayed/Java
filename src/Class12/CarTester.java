package Class12;

public class CarTester {
    public static void main(String[] args) {

        // Below code will create an object of car class

        Car car= new Car();

        car.make="Toyota";
        car.model="Camry";
        car.mileage=0;
        car.color="While";
        car.isAutomatic=true;

        car.startCar();
        car.stopping();
        car.speeding();

        System.out.println("-----------------------------");

        Car car1= new Car();
        car1.make="Tesla";
        car1.model="s";
        car1.mileage=15000;
        car1.isAutomatic=true;
        car1.startCar();
        car1.stopping();
    }
}
