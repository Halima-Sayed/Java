package class14;

public class E6 {
    // Create a method which returns true or false and takes an int
    // number as a parameter if number is
    // even it returns true otherwise returns false

    boolean isEqual(int a){
     /*   boolean found=false;
       if(a%2==0){
           found=true;
       }
        return found;
      */
        // easy way because % gives us boolean value true or false so need for above code.
        return a%2==0;
    }

    public static void main(String[] args) {
     //  int num=2;
        E6 obj=new E6();
        System.out.println(obj.isEqual(2));
       /* boolean result=obj.isEqual(num);
        System.out.println(result);

        */
    }
}
