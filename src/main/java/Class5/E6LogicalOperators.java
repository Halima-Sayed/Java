package Class5;

public class E6LogicalOperators {
    public static void main(String[] args) {

       // System.out.println(true ||true||false);
        int age=17;

        // If we use the || operator as long as there is one condition that is true the final result will be true
        // It will be false all the conditions are false

        if(age<18 || age>60){
            System.out.println("You will get a discount");
        }

        // If the gender is F or age is >60 you will get a discount

        char gender='F';
        String name="Mary";
        if(gender=='F' || age>60 || name!="Mary");{
        System.out.println("You will get a discount");
        }
    }
}
