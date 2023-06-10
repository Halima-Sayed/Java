package Class26;

import java.util.*;

public class E3Maps {
    public static void main(String[] args) {
        Map<String,Double> drinks=new HashMap<>();

        drinks.put("Coke",2.0);
        drinks.put("Milk",5.0);
        drinks.put("Mango Juice",2.5);
        drinks.put("Coffee",3.0);
        drinks.put("Tea",3.5);

        //remove only those which contains letter i and their prize is less 3

        Set<Map.Entry<String, Double>> entrySet=drinks.entrySet();
     /*   for(Map.Entry<String, Double> e:entrySet){
            System.out.println(e.getKey()+" "+e.getValue());
        }

      */
        //remove all of the entries for which key contains the letter i and value is greater than 2
        entrySet.removeIf(x->x.getKey().contains("i")&&x.getValue()>2);



        //We have an interface entry and it has to compartments  one stores key the other stores the value.
        // so this method we are calling it will give us all the entries from the map in the form of set.


    }
}
