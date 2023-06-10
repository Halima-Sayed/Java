package Class27;




import Utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigReader {
  public static void main(String[] args) throws IOException {
      FileInputStream fis=new FileInputStream(Constants.CONFIG_READER_PATH);
      Properties prop=new Properties();
      prop.load(fis);

       WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
                driver.manage().window().maximize();

        WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("#txtPassword"));
        password.sendKeys("Hum@nhrm123");

    }
    public static String getProperty(String key) throws IOException {
        FileInputStream fis=new FileInputStream(Constants.CONFIG_READER_PATH);
        Properties prop=new Properties();
        prop.load(fis);
        return prop.getProperty(key);

    }
}
