package Class13;

public class E3StringClassDemo {
    public static void main(String[] args) {

        String str="knfsdjfDDAHSUIH    12193857@#^%*!";
        System.out.println(str.replaceAll("[^a-z]","")); // ^ this is the symbol for NOT here
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[Dn3]",""));
        System.out.println(str.replaceAll("[A-Z]","\\$"));
        System.out.println(str.replaceAll(" ","\\$"));

    }
}
