package Class12;

public class E12StringClassDemo {
    public static void main(String[] args) {

        // subString is used to get a part of a complete String
        String sentence = "Yup we have another class";
        System.out.println(sentence.substring(4));
        System.out.println(sentence.substring(4, 11));
        System.out.println(sentence.substring(12, 19));

        int startindex=sentence.length()-4;
        System.out.println(sentence.substring(startindex));
    }
}
