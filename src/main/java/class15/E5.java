package class15;

public class E5 {
    String name="Jimmi"; // instance variable

    void print(){
        int number=10; //local variable
        System.out.println(number);
    }

    public static void main(String[] args) {
        E5 obj=new E5();
        obj.print();

        // We can use same name variable if it is in a different block of code
        if (true){
            int sum=10;
        }
        switch ("Java"){
            case "a":
                int sum=0;
        }
        for (int i = 0; i < 10; i++) {
            int sum=0;
            for (int j = 0; j < 5; j++) {

                System.out.println(sum);
                
            }

        }
    }
}
