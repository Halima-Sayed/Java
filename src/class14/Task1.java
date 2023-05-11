package class14;

public class Task1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger
    // Print-> means void
    void printLargest(int a, int b){

        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

    }
    public static void main(String[] args) {
        Task1 obj=new Task1();
        obj.printLargest(10,20);
    }
}
