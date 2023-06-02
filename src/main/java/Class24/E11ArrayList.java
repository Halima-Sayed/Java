package Class24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E11ArrayList {
    public static void main(String[] args) {


        long start=System.currentTimeMillis();
        List<Integer> numbers=new LinkedList<>(); // ArrayList will take longer time
        for (int i = 0; i <1000000 ; i++) {
            numbers.add(0,i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end - start);
    }
}
