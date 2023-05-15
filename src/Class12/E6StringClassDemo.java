package Class12;

public class E6StringClassDemo {
    public static void main(String[] args) {

        String name="Justin";
        System.out.println(name.equals("Axel"));
        System.out.println(name.equals("Justin"));
        System.out.println(name.equalsIgnoreCase("JUSTIN")); // It will ignore the case sensitivity
        System.out.println(!name.equalsIgnoreCase("JUSTIN"));
    }
}
