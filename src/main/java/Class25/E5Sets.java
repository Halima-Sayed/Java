package Class25;

import java.util.TreeSet;

public class E5Sets {
    public static void main(String[] args) {
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Banana");
        //No duplicates and TreeSet sorts alphabetically A,B,C and 1,2,3
        //TreeSet is slowest of all 3 sets
        System.out.println(fruit);
    }
}
