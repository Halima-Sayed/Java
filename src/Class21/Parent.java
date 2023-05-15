package Class21;

public class Parent {
    //final methods we cannot override
    //final can be used anywhere
    final int noOfMonthsInYear=12;
   final void getMarry(){
        System.out.println(" Marry Shakira");

    }
    void study(){
        System.out.println("Study medicine");
    }
}
class Axel extends Parent{
    @Override
    void study(){
        System.out.println("No I want to study SDET");
    }
}
