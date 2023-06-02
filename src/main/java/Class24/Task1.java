package Class24;


import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
         */
        ArrayList<String> names=new ArrayList<>();
        names.add("Barney");
        names.add("Ted");
        names.add("Marshal");
        names.add("Lily");
        names.add("Robin");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Ted"));
        System.out.println(names.size());
        for (String name : names) {
            System.out.println(name);
        }
    }
}
