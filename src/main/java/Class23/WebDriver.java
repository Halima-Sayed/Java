package Class23;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
   public void openBrowser(){
        System.out.println("Opening Chrome");
    }
    public void closeBrowser(){
        System.out.println("Closing Chrome");
    }
    public void maximizeWindow(){
        System.out.println("Maximize Chrome");
    }
    public void findElement(){
        System.out.println("Finding element in Chrome");
    }

}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Firfox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Firefox");

    }

    @Override
    public void findElement() {
        System.out.println("Finding element in Firefox");

    }
}
class WebDriverTester{
    public static void main(String[] args) {

        WebDriver[] driver = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver a : driver) {
            a.openBrowser();
            a.closeBrowser();
            a.findElement();
            a.maximizeWindow();
        }
    }
}
