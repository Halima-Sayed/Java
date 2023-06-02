package Class24;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an arrayList of words. Remove every word that ends with “e”.
         */
        ArrayList<String> words = new ArrayList<>();
        words.add("Perfect");
        words.add("create");
        words.add("Divisible");
        words.add("Cool");

       /* for (String word : words) {
            if (word.endsWith("e")){
                words.remove(word);
                //ConcurrentModificationException ERROR
            }
        }
        */

        for (int i = 0; i < words.size(); i++) {
            String a = words.get(i);
            if (a.endsWith("e")) {
                words.remove(i);
                i--; //decremented i to avoid skipping elements, because if I don't use it it skip one word with ending e

            }
        }
        System.out.println(words);

        }
    }

