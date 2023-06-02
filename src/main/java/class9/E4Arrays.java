package class9;

public class E4Arrays {
    public static void main(String[] args) {
        /*
            Create an array of String store 5 names in that array
            print all of the names from that array with the help of for loop
            try printing with the help of while loop

         */

        String [] names={"Cinderella", "Bella", "Ariel", "Snow", "Jazmin"};
        System.out.println(names.length);

        for (int j=0; j<=4; j++){
            System.out.print(names[j]+" ");
        }
        System.out.println();
        int counter=0;
        while (counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;

        }


    }
}
