package Class13;

public class E4StringClassDemo {
    public static void main(String[] args) {

        String str="Today is Sunday. we have java class? we like java";
        String[] strArr=str.split("[.!?]");
        System.out.println(strArr.length); // 3
        System.out.println(strArr[2].trim());
    }
}
