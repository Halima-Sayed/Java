package Class26;

import java.util.HashSet;
import java.util.Set;

public class EntrySetTester {
    public static void main(String[] args) {
        Set<Entry> entrySet=new HashSet<>();
        entrySet.add(new Entry("Coke",2.0));
        entrySet.add(new Entry("Milk",5.0));
        entrySet.add(new Entry("Mango Juice",2.5));

      /*  for(Entry e:entrySet){
            //.getKey() will only print the names
          //  System.out.println(e.getKey());
            //.getValue() will only print the prize
           // System.out.println(e.getValue());
            if(e.getKey().contains("i")&& e.getValue()>2){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

       */
        entrySet.removeIf(x->x.getKey().contains("i")&&x.getValue()>2);
        System.out.println(entrySet);
}
}