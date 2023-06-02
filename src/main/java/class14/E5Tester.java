package class14;

public class E5Tester {
    public static void main(String[] args) {
        int[] arr={10,20,45};
        int number=20;
        E5ArrayUtils obj=new E5ArrayUtils();
       boolean result= obj.contains(arr,number);
        System.out.println(result);
        }
    }

