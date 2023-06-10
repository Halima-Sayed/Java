package Class25;

import java.util.HashMap;

public class E7Maps {
    public static void main(String[] args) {
        //in maps we can store two data
        HashMap<String,Double> grocery=new HashMap<>();
        //Maps are not part of framework tha is why we use the .put method instead of .add
        grocery.put("Apple",2.5);
        grocery.put("Soap",3.1);
        grocery.put("Eggs",3.5);
        grocery.put("Milk",2.5);
        //if we inset the data with same key again it will override
        grocery.put("Apple",4.5);
        System.out.println(grocery);
        //size will give you the number of elements
        System.out.println(grocery.size());
        //containsKey will give boolean
        System.out.println(grocery.containsKey("Banana"));
        System.out.println(grocery.containsKey("Eggs"));
        System.out.println(grocery.containsValue(3.5));
        //isEmpty will give you boolean
        System.out.println(grocery.isEmpty());

    }
}
