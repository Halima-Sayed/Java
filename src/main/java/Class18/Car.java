package Class18;

public class Car {
    String make;
    String model;
    String color;
    int year;
    int engineCC;

    Car(String make,String model,String color){
        this.make=make;
        this.model=model;
        this.color=color;
    }
    Car(String make,String model,String color,int year){
        /*
        this(make,model,color);-> this should be the first line in a constructor we
        will get an error
         */
        this(make,model,color);
        this.year=year;
    }

}
