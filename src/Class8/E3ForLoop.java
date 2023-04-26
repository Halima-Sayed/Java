package Class8;

public class E3ForLoop {
    public static void main(String[] args) {

        // Write a loop to add all the even number from 1 to 10

        int sum=0; // creating the variable to hold the sum

        for (int i = 1;  i <= 10; i++) {
            if (i % 2 == 0) { // checking if the number is even
                sum+=i;  //sum=sum+1; // adding all the even number to the sum variable one by one


            }
        }
        System.out.println(sum);
    }
}
