package Class12;

public class E4StringClassDemo {
    public static void main(String[] args) {

        String firstName="Ana";
        String lastName=null;

        String fullName=firstName+lastName;// Most widely used approach
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));
    }
}
