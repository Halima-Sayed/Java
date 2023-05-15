package Class12;

public class E10StringClassDemo {
    public static void main(String[] args) {

        String name = "LEANDROR";
        int count = 0;
        //  System.out.println(name.charAt(1));
        // Count how many times the letter R has appeared
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'R'){
                count++;
            }
        }
        System.out.println(count);
    }
}
