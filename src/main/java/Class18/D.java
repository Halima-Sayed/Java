package Class18;

public class D {
    //Write program to inherit class D that has method printF which is static and call or reuse that method into class E
    static void printF(){
        System.out.println("FUnny");
    }
}
class E extends D {

}
class A2Tester{
    public static void main(String[] args) {

        E.printF();

    }
}
