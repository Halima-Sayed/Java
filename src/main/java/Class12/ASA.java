package Class12;
import java.util.ArrayList;
import java.util.List;
public class ASA {


    public static void main(String[] args) {
            // Create an array to hold lists
            List<String>[] arrayOfLists = new ArrayList[3];


            for (int i = 0; i < 3; i++) {
                arrayOfLists[i] = new ArrayList<>();
                arrayOfLists[i].add("I");
                arrayOfLists[i].add("miss");
                arrayOfLists[i].add("you");
            }


            for (int i = 0; i < 3; i++) {
                List<String> currentList = arrayOfLists[i];
                System.out.print("List " + (i + 1) + ": ");
                for (String word : currentList) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
        }
    }
