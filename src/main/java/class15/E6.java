package class15;

public class E6 {
    String name;

    static int age1=10;

    void print(){
        int age=10;
        System.out.println(age); // white color for local
        System.out.println(name); // purple for instance
        System.out.println(age1);

    }
    void printInfo(){
        System.out.println(name);

    }

    static void printName(){
       /* System.out.println(name);*/  // error because name on line 4 cannot be placed inside static method
        System.out.println(age1);


    }

    public static void main(String[] args) {
        System.out.println(Math.E);
    }
}
