package Class3;

public class E11ShotHandOperators {
    public static void main(String[] args) {

        int number=100;
        // number=number+1;
        number++; // ++ means increase the value by one and only one ++ is the shorthand method for above
        double num=15.5;
        num++;
        System.out.println(number);
        System.out.println(num);

        float f=11F; // float can store decimal
        f/=2;
        System.out.println(f);
        int m=11; // int cannot store decimal
                m/=2;
        System.out.println(m);
    }
}
