package Class20;

public class Parent {
    //We cannot override constructors
    //We cannot be more restrictive with our access than the parent class we can increase but cannot decrease.

    void getMarry(){
        System.out.println("Marry to the girl of our choice");
    }
    private void accessBank(){
        System.out.println("Accessing bank");
    }
    static void printNumber(){
        System.out.println(10);
    }
}
class Axel extends Parent{


    @Override
    public void getMarry() {
        System.out.println("I want to marry Karol G"+"ctrl o fpr shortcut to create override method");
    }
}
class ParentTester{
    public static void main(String[] args) {
        Axel axel=new Axel();
        axel.getMarry();
        Axel.printNumber();
    }
}
