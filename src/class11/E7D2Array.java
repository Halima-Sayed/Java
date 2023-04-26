package class11;

public class E7D2Array {
    public static void main(String[] args) {
        boolean[][] arr2D = {{true, false,true,true,false},
                {true,false,false,false,false}
        };
        //  count how many times we have true in the above 2D array


        int count=0;
        for (boolean[] booleans : arr2D) {

            for (boolean aBoolean : booleans) {
                if (aBoolean)
                 count++;

            }
        }
        System.out.println("count = " + count);

    }
}
