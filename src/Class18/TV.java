package Class18;

public class TV {
    private int size;
    protected String make; // only child of this class can access protected
    String model;

}
class SamsungTV extends TV {

  /*  public static void main(String[] args) {
        TV tv=new TV();
        //cannot access size because it is PRIVATE

   */

    }
    class TVTester{
        public static void main(String[] args) {
            SamsungTV smT=new SamsungTV();
            // Still cannot access size in inherited classes because PRIVATE
            //DEFAULT can be accessed in the same class but not different package
        }

}
