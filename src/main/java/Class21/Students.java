package Class21;

public class Students {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define 3 common behavior within parent class and override some of the methods in child classes
            Define some methods specific to child classes
            Write example of achieving run time polymorphism

     */
    //Methods represent an action a piece of code that will do something
    void study() {
        System.out.println("Students are studying hard");
    }

    void talk() {
        System.out.println("Students talk out of topic");
    }

    void Homework() {
        System.out.println("Students submit homework in time");
    }

}

class SyntaxStudent extends Students {
    @Override
    void study() {
        super.study();
    }

    @Override
    void talk() {
        super.talk();
    }

    @Override
    void Homework() {
        super.Homework();
    }

    void appreciateProfessors() {
        System.out.println("Syntax Students appreciate their Professors");
    }
}

class CollegeStudent extends Students {
    @Override
    void study() {
        System.out.println("College Students are not studying well enough");
    }

    @Override
    void talk() {
        super.talk();
    }

    @Override
    void Homework() {
        super.Homework();
    }

    void scholorship() {
        System.out.println("40% of our college students are on scholarship programs");
    }
}

class SchoolStudent extends Students {
    @Override
    void study() {
        super.study();
    }

    @Override
    void talk() {
        super.talk();
    }

    @Override
    void Homework() {
        System.out.println("School Students do not submit homework on time");
    }

    void skipSchool() {
        System.out.println("Some school students skip school and get detention");
    }
}
