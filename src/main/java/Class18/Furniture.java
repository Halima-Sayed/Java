package Class18;

public class Furniture {
    //FIRST PRIORITY IS LOCAL THAN INSTANCE OF THE SAME CLASS THEN INSTANCE OF THE PARENT CLASS
    String color="Black";

}
class Chair extends Furniture{
    String color="White";

    void printColor(){

        String color="Blue";
        System.out.println(color);
       System.out.println(this.color);
        System.out.println(super.color);

    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor(); // we will get blue because local variables are always preferred and if we add this.
        // then white because white is preferred and then if we put super. we will get whatever the parent says
    }
}
