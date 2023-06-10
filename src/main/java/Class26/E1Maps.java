package Class26;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E1Maps {
    public static void main(String[] args) {
        Map<String,Double> drinks=new HashMap<>();
        //store the prizes and names of the items if ->  use Map
        //Store the names of the students in java-> use ArrayList instead of LinkedList because if we are planning to store the data once and most of the time
        //we want to access the data by the get method

        drinks.put("Coke",2.0);
        drinks.put("Milk",5.0);
        drinks.put("Mango Juice",2.5);
        drinks.put("Coffee",3.0);
        drinks.put("Tea",3.5);
        //we need keyset method first in order to use removeif method with map because removeif method is only a part of collections framework
        drinks.keySet().removeIf(x->x.contains("i"));
        System.out.println(drinks);
    }
}
