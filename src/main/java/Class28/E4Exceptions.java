package Class28;

public class E4Exceptions {
    public static void main(String[] args) {
        //all the errors we get before we click on the play button that is called a compile time error also called as syntax errors
        //logical issues are when the code compiles fine it runs fine but it does not produce the right output

        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        //java has encountered a situation for which it does not know what to do
        // it will stop the complete program from that line downwards to avoid further damage
       // System.out.println(10/0);
      //  int[] arr=new int[-5]; //<- cannot create an array of -5
        System.out.println("line 5");
       try{
           "name".charAt(5);
       }catch (Exception e){
           System.out.println("Plan b");
       }
        System.out.println("line 6");

    }
}
