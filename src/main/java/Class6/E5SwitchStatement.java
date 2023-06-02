package Class6;

public class E5SwitchStatement {
    public static void main(String[] args) {
        // boolean, double, float, long will not work with switch

        char gender='G';

        switch(gender){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case 'O':
                    System.out.println("Others");
            default:
                System.out.println("Char not supported");
        }
    }
}
