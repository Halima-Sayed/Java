package Class25;

import java.util.LinkedHashSet;


public class Task3 {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
         */
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Makkah");
        cities.add("Madinah");
        cities.add("Dubai");
        cities.add("New York");
        cities.add("Atlantis");

        cities.removeIf(x ->x.startsWith("A"));
        System.out.println(cities);

    }
}
