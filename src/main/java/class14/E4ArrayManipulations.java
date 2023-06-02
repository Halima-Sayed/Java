package class14;

public class E4ArrayManipulations {

    /*
    Create a method to add two int numbers, and it should return the results
    back when called name of the method should be add
     */
    /*
    return type->
    name of the method-> add
    parameters-> (int a,int b)
    body of the method -> {
    int sum=a+b;
    return sum;
     */
    int add(int addition, int addition2){
        int sum=addition+addition2;
        return sum;
    }

    public static void main(String[] args) {
        E4ArrayManipulations obj=new E4ArrayManipulations();
        int a=1;
        int b=2;
        int result=obj.add(a,b);
        /*
        We are calling the "Add" method on "obj" objects passing two arguments one
        is 10 other is 20 and storing the results from method call into the sum variable
         */
        int result2=obj.add(10,20);
        System.out.println(result);
        System.out.println(obj.add(a,b));
        System.out.println(result2);
        System.out.println(obj.add(10,20));
    }
}
