package Class12;

public class E8StringClassDemo {
    public static void main(String[] args) {

        String sentence="      JAVA is very very easy";
        //Below line 8 is called method chaining calling multiple methods on the same line
        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence);
        System.out.println(sentence.startsWith("java"));// It will print out False if we have space before Java or lower/upper case

    }
}
