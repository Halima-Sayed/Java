package Class18;

public class A {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
    String color;

}
class B extends A{

}
class C extends B{

}
class TesterABC{
    public static void main(String[] args) {
        B b=new B();

        C c=new C();
    }
}