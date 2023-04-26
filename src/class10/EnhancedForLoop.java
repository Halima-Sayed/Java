package class10;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int [] numbers={10,20,50,40,30};
        /*
        Create a variable to store the largest assumed number
        to go through all the numbers from the array one by one
        compare the assumed largest number with all the numbers in the array
        once we are done looping through all the numbers print the results
         */
        int largest=numbers[0];
        for (int num : numbers) {
            if (num>largest){
                largest=num;
            }


        }
        System.out.println(largest);

        }
    }

