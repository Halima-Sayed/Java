package Class30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E10Maps {
    public static void main(String[] args) {
        Map<String,String> info=new HashMap<>();
        info.put("Moncef","Morocco");

        Map<String, List<String>> moreInfo=new HashMap<>();
        List<String> moncefCities=new ArrayList<>();
        moncefCities.add("Rabat");
        moncefCities.add("Chefchaoun");
        moncefCities.add("Al Hoceima");
        moncefCities.add("Marakech");

        List<String> halimaCities=new ArrayList<>();
        halimaCities.add("Framkfurt");
        halimaCities.add("Dubai");
        halimaCities.add("Makkah");

        moreInfo.put("Halima",halimaCities);
        moreInfo.put("Moncef",moncefCities);
        System.out.println(moreInfo);

        }

    }

