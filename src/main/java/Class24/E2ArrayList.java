package Class24;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(100);
        numbers.add(200);
        System.out.println(numbers); // unlike arrays, we can just print the variable and all of them will print on the console [10, 20, 100, 200]
        for(Integer a:numbers){ // different way, preferred way
            System.out.println(a);
        }
        System.out.println("------------------------------");
        for (int i = 0; i <numbers.size() ; i++) { // another way
            System.out.println(numbers.get(i));
        }
        System.out.println("------------------------------");
        int i = 0; //another way
        while (i < numbers.size()) {
            System.out.println(numbers.get(i));
            i++;
        }
        System.out.println("------------------------------");
        int j=0;
        do {
            System.out.println(numbers.get(j));
            j++;
        }while(j< numbers.size());
    }
}
