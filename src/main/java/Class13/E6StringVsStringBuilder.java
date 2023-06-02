package Class13;

public class E6StringVsStringBuilder {
    public static void main(String[] args) {

        String str="Wife";
        str.toLowerCase();
        System.out.println(str);

        StringBuilder str2=new StringBuilder("Husband");
        str2.reverse();
        System.out.println(str2);
    }
}
