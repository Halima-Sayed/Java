package Class24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E10ArrayList {
    public static void main(String[] args) {
        //List is an interface not a class
        List<Integer> nums=new ArrayList<>();
      nums.add(10); //0
      nums.add(20); //1
      nums.add(44); //2
      nums.add(50); //3
      nums.add(100); //4
        System.out.println(nums);
        nums.add(1,500); //it will shift the index 1 and that will become index 2
        System.out.println(nums);
        nums.remove(2);
        System.out.println(nums);
    }
}
