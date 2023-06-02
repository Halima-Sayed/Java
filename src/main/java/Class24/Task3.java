package Class24;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        //Create an arrayList of drinks.
        // If any drink has letter “a” or “e” replace it with water.
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("smoothie");
        drinks.add("ginger ale");
        drinks.add("chai");
        drinks.add("milk");
       drinks.replaceAll(a -> a.contains("a") || a.contains("e")? "water" :a);
        System.out.println(drinks);
    }
}
