package Class24;

import java.util.ArrayList;
import java.util.Iterator;

public class E8ArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Perfect");
        words.add("create");
        words.add("Divisible");
        words.add("Cool");
        words.removeIf(a -> a.endsWith("e"));
       /* Iterator<String> iterator=words.iterator();
        while(iterator.hasNext()){
            String word=iterator.next();
            if(word.endsWith("e")){
                iterator.remove();
            }
        }

        */
        System.out.println(words);
    }
}
