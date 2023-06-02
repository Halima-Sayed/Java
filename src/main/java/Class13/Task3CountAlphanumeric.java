package Class13;

public class Task3CountAlphanumeric {
    public static void main(String[] args) {

        String str="jnsfhur1362ASDHJF!@#$%&*";
      /*  String str1=str.replaceAll("[^a-zA-z]","");
        System.out.println(str1);
        System.out.println(str1.length());
       */
        System.out.println(str.replaceAll("[^a-zA-Z]","").length());

    }
}
