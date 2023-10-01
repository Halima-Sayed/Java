package Class28;

public class E9Finally {
    public static void main(String[] args) {

        System.out.println("1");
        try{
            System.out.println("2");
            System.out.println(10/0);
            System.out.println("3");
        }catch (Exception e){
            System.out.println("4");
            System.out.println(10/0);
        }finally {
           // System.out.println(10/0); <- it will not execute if something goes wrong within the block
            System.out.println("Will always execute"); //finally block is a block in which whatever code you put it will always get executed no matter what Java takes the responsibility.
            // If you have some important lines of code that we always want to execute we write those lines of code inside the finally block
        }
        System.out.println("5");
    }
}
