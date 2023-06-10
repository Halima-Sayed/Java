package Class30;

public class E1Methods {
    /*
    Write code to print hello world 3 times
    Hello java 3 times
    Hello Batch16 3 times
     */
    public static void main(String[] args) {
    printWord("hello world");
    printWord("hello java");
    printWord("hello batch16");

    }

    static void printWord(String word) {
        for (int i = 0; i < 3; i++) {
            System.out.println(word);
        }
    }
}
