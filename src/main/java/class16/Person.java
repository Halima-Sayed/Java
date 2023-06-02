package class16;

public class Person {

    public String name="Vlad";
    String SSN="1234567899"; // can only access in same package DEFAULT
   private String password; // restricts the access to the same class only.
   private static double bankBalance=12000;

   private void printPassword(){
       System.out.println(password);
   }
   private static void printBalance(){
       System.out.println(bankBalance);
   }

    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";
        farwa.printPassword();
        System.out.println(Person.bankBalance);

        System.out.println(farwa.SSN);
        System.out.println(farwa.name);
    }
}

