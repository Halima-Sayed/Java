package Class23;

public interface MoveAble {
    // public static final int age; <- by default in Interface all the fields are and methods are public
    int age=12;
    void move();
}
interface WashAble{
    void wash();
}
class Dog implements MoveAble,WashAble{
    @Override
    public void move(){
        System.out.println("Moving......");
    }
    @Override
    public void wash(){
        System.out.println("You can wash me");
    }
}
class Cat implements MoveAble{
    @Override
    public void move() {
        System.out.println("Cats also move");
    }
}
class Horse implements MoveAble{

    @Override
    public void move() {
    }
}
