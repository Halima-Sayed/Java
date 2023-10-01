package Class28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E10Finally {

    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        try {
            webDriver.get("https://google.com");
            webDriver.findElement(By.xpath("dbfhvf"));
        }finally {
            webDriver.close(); //if there was no finally block then it would not have closed the browser because line above it gives an exception
        }

    }
}
