package Class25;

import java.util.LinkedHashSet;

public class E4Sets {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Apple");
        //will not print duplicate because it is a set, but it will remember the order
        System.out.println(fruit);

    }
}
