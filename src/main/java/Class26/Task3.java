package Class26;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
         */
        Map<Long,String> bestBuy=new HashMap<>();
        bestBuy.put(2388946L,"Laptop");
        bestBuy.put(456765L,"Desktop");
        bestBuy.put(8998643L,"Printer");
        bestBuy.put(894375L,"TV");

       // Set<Map.Entry<Long,String>> entrySet=bestBuy.entrySet();
      //  var entrySet=bestBuy.entrySet(); <- same as above line of code just used var
        //above code is if we want to just write the variable in the enhanced loop
        for(Map.Entry<Long,String> b:bestBuy.entrySet()){
            System.out.println(b.getKey()+" "+b.getValue());
        }
    }
    String var = "Files/Config.properties";
}
