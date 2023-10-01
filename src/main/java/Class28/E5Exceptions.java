package Class28;

public class E5Exceptions {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        try {
           // System.out.println(10 / 0);
           // int [] arr=new int[-5];
            "".charAt(10);
            //if we always use Exception then we will never know what is actually wrong. It's not a good practice we should provide specific solution to specific problems
        }catch (ArithmeticException e){
            System.out.println("Someone is trying to divide by zero");
        }catch (NegativeArraySizeException e){
            System.out.println("Someone is trying to create an array of negative size");
            //if java cannot find the exact type of error then it will use Exception the parent class of the errors
        }catch (Exception e){
            System.out.println("Something gone wrong executing backup code");
        }
        System.out.println("4");
    }
}
