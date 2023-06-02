package Class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class E6CollectionsFramework {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Orange");
        System.out.println(fruit);
        System.out.println("-------------------------------------");

        HashSet<String> hashSet=new HashSet<>(fruit);
        System.out.println(hashSet);
        System.out.println("-----------------------------");


        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>(hashSet);
        System.out.println(linkedHashSet);


        //sets are all part of the collectionsFramework and you can convert them.



    }
}
