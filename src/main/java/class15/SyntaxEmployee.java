package class15;

public class SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */
    String eId; // instance because each employee has a different id
    int salary; // each employee has different salary
    static String ceo="Sumair"; // static because ceo for everyone is the same



    public static void main(String[] args) {
        SyntaxEmployee asghar=new SyntaxEmployee();
        asghar.eId="12A34";
        asghar.salary=90_000;
        System.out.println(asghar.ceo); // not the preferred way
        System.out.println(SyntaxEmployee.ceo); //99.99 this is how they are used

        SyntaxEmployee sohail=new SyntaxEmployee();
        sohail.eId="12B34";
        sohail.salary=92_000;
        System.out.println(sohail.eId);
        System.out.println(asghar.eId);
    }
}
