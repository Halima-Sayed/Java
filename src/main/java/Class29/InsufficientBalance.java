package Class29;

/***
 * This exception is thrown when there is not enough balance in the users account
 * and he tries to withdraw more money
 */
public class InsufficientBalance extends RuntimeException{
    //our own exception
    public InsufficientBalance(String errorMsg){
        super(errorMsg);
    }
}
