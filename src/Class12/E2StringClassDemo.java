package Class12;

public class E2StringClassDemo {
    public static void main(String[] args) {
        String userName="Admin";
        String password="pass123";
        // Write code to get the username and password if the username OR
        // password are less then 8 characters this msg "Signup successful"
        // Otherwise you have to print "username and password can't be more than 8 characters"

        if (userName.length()>8 || password.length()>8){
            System.out.println("username and password can't be more than 8 characters");
        }else{
            System.out.println("Signup successful");
        }
    }
}
