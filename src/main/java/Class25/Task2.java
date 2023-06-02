package Class25;

import java.util.ArrayList;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a Set in which you need to add names of the countries.
         In this set we want all objects to be sorted in alphabetical order.
         Using 2 different ways retrieve all elements from set.
         */
        TreeSet<String> countries=new TreeSet<>();
        countries.add("Belgium");
        countries.add("Palestine");
        countries.add("Dubai");
        countries.add("USA");
        System.out.println(countries);
        System.out.println("--------------------------------");

        for (String country : countries) {
            System.out.println(country);

        }
    }
}
