package Class12;

public class Car {
    //Define 5 properties and 3 methods

    String model;
    String make;
    int mileage;
    boolean isAutomatic;
    String color;

    void speeding(){
        System.out.println("Car is speeding");
    }
    void stopping(){
        System.out.println("Presses on break");
    }
    void startCar(){
        System.out.println("Starting "+model+"......");
    }
}
