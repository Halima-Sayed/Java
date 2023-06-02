package class15;

public class E4 {

 static /*only instance can be static and it cannot be inside a method */ int age;// instance variable
    String color="Blue";//instance
    public static void main(String[] args) {
        double weight=30;//local
         if (10>20){
             int sum=10; // local to if conditions

         }
        //System.out.println(sum); // this will give us error because it is outside the local variable of if
        String breed; //Local because it is inside the main method
    }
    String name; // instance variables outside the methods

    static String year; //static variable
}
