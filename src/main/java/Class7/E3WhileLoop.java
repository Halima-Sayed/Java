package Class7;

public class E3WhileLoop {
    public static void main(String[] args) {

        // We want to print "Hello World" 5 times on the console
        int counter=1;
        // This condition will return true 5 times
        while(counter<=5){
            System.out.println("Hello World");
            // In every iteration the value of the counter variable will increase
              counter++;
             //  counter++; if we write another counter++; then it will take two steps forward, so it will only be left to take 3 steps
             // counter++; same now we have taken3 out of 5 steps now we are only left with 2

        }
        // If we put the counter++; it will loop on forever
    }
}
