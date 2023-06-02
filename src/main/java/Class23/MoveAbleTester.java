package Class23;

import Class18.D;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble moveAble=new Cat();
        WashAble washAble=new Dog();
        MoveAble[] moveAbles={new Cat(),new Dog()};
        for (MoveAble a : moveAbles) {
            a.move();

        }
    }
}
