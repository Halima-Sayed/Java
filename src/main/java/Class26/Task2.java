package Class26;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a map of countries(5 )with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop.
Print all values from a country map using for each loop and iterator.
         */
        Map<String,String> countries=new TreeMap();
        countries.put("UAE","Abu Dhabi");
        countries.put("USA","Washington DC");
        countries.put("UK","London");
        countries.put("Turkey","Istanbul");
        countries.put("Canada","Ottawa");

        for (String c : countries.keySet()) {
            System.out.println(c);
        }
        System.out.println("------");
        for(String v:countries.values()){
            System.out.println(v);
        }
        System.out.println("-------------");
        //var is shorter for big complicated data types below instead of typing Map.Entry<String,String> we just use var
        for(var e:countries.entrySet()){
           // System.out.println(e);
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
