package Class22;

public abstract class Task1 {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    And fields like name and size.
    Edit and close are implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile,
    PdfFile that will provide specific implementation of open behaviour:
     Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc.
     */
   private String name;
    private int size;

    public Task1(String name, int size) {
        this.name = name;
        this.size = size;
    }
    abstract void open();
    void edit(){
        System.out.println("Editing");
    }
   final void close(){
        System.out.println("save all work before closing");
    }
    void printInfo(){
        System.out.println(name+" "+size);
    }
}
class JavaFile extends Task1{

    public JavaFile(String name, int size) {
        super(name, size);
    }
    @Override
    void open() {
        System.out.println("Open java file");
    }
    @Override
    void edit() {
        System.out.println("Editing Java files are complicated");
    }
}
class WordFile extends Task1{

    public WordFile(String name, int size) {
        super(name, size);
    }
    @Override
    void open() {
        System.out.println("Open word file");
    }
    @Override
    void edit() {
        System.out.println("Editing word files are great");
    }
}
class PdfFile extends Task1{

    public PdfFile(String name, int size) {
        super(name, size);
    }
    @Override
    void open() {
        System.out.println("Open pdf file");
    }
    @Override
    void edit() {
        super.edit();
    }
}
class Task1Tester{
    public static void main(String[] args) {
        Task1[] task={new JavaFile("Classes",10),new WordFile("Essay 1",25),new PdfFile("Book",40)};
        for (Task1 a : task) {
            a.printInfo();
            a.close();
            a.edit();
            a.open();
        }
    }
}