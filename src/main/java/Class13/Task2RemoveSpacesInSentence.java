package Class13;

public class Task2RemoveSpacesInSentence {
    public static void main(String[] args) {
        /*
        Create a String that will hold a sentence.
        Write a program to get a new String without any spaces.
         */
        String str="Did you attend the Eid party?";
        System.out.println(str.replaceAll(" ",""));

    }
}
