package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;

    public void setup(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com");

    }

    public void tearDown(){

        driver.quit();

    }

}