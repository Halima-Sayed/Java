package Class18;

public class Person {
    //Multilevel inheritance
    String name;

    void sleep(){
        System.out.println("ZZZZzzzzZZZ");
    }

}

class Employee extends Person{

}

class Tester extends Employee{

}

class PersonTester{
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.sleep();
        Tester tester=new Tester();
        tester.name="Sarah";
        System.out.println(tester.name);
        tester.sleep();
    }
}
