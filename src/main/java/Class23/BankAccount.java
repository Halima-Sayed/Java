package Class23;

public class BankAccount {
    //in encapsulation first you need to create a class for everything
    //second all your fields need to be private
    // making something private it restricts something completely neither can you assign nor you can access.
    //creating private fields are great
    // If you are in another class you cannot even see the private if it is present.
    //We want to give access in a control managed way and we decide the rules condition
    // We use the get methods and then we write our logic (getters and setters methods) <- public
    private String firstName;
    private String userName;
    private String password;
    private double accountBalance = 120;

    BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    String getFirstName(){
        return firstName;
    }

    public double getAccountBalance(String password) { // we created a getter method to access the account balance
        if (password.equals(this.password)) {
            return accountBalance;
        } else {
            return 0;
        }
    }
    public void setAccountBalance(double balance){ // setter methods help us change value
        accountBalance=balance;
    }
    void setPassword(String password){
        this.password=password;
    }
}

class BankTester {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("User123", "password");
        System.out.println(bankAccount.getAccountBalance("password"));
        bankAccount.setAccountBalance(100000);
        System.out.println(bankAccount.getAccountBalance("password"));
    }
}
