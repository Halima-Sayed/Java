package Class23;

import java.util.ArrayList;

public class E1Collections {
    public static void main(String[] args) {

        String name = "Vero";
        String name1 = "Rajbeer";
        String[] names={"Sarah","Lean"};
        int size=2;
        String[] names2=new String[size];
        names2[0]="Semir";
        //arrays are fixed in size we must tell the size before we can use it which
        // is not practical so it severally limits its practical use in real life
        //That is why Java created Array list

        ArrayList<String> arrayLists= new ArrayList<>(); //ArrayList is a class. <> are called diamond operators or angle brackets
        arrayLists.add("Pavel");
        arrayLists.add("Ramil");
        System.out.println(arrayLists);

    }
}