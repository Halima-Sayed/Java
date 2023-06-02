package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Halima");
        names.add("Halima");
        System.out.println(names.get(0));

        HashSet<String> uniqueNames=new HashSet<>();
        //HashSet is the best in term of memory and speed.
        //HashSet is mostly used
        //Sets do not allow duplicate data. Duplicate data will be discarded.
        //HashSets does not remember the order in which you have inserted the data. Prints out in random order.
        uniqueNames.add("Yellow");
        uniqueNames.add("Yellow");
        uniqueNames.add("green");
        //we don't have the get method. The data is not stored based on indexes. Which means we cannot use loops except enhanced loop
        System.out.println(uniqueNames);
        for (String name : uniqueNames) {
            System.out.println(name);

        }
    }
}
