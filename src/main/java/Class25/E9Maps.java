package Class25;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class E9Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipstick",100.0);
        makeup.put("Blush",68.0);
        makeup.put("EyeLiner",80.0);
        makeup.put("Foundation",120.0);
        makeup.put("Base",25.0);

        //we can use collection instead of set
       Set<String> keys=makeup.keySet();
        System.out.println(keys);

        //collection is an interface
        //if things get complicated we can use var.
        Collection<Double> value=makeup.values();
        System.out.println(value);

    }
}
