package Class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    /*
    Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
     */
    public static void main(String[] args) {


        Map<Integer, String> building = new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Amazon");
        building.put(3,"Tesla");
        building.put(4,"Samsung");
        building.put(4,"Samsung");
        building.put(5,"Apple");
        building.put(6,"Microsoft");
        building.put(7,"Facebook");


        System.out.println(building.size());
        building.replace(4,"Jeep");
        building.remove(7);
        System.out.println(building);


    }
}