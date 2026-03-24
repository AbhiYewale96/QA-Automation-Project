package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void validLogin() throws Exception {

        setup();

        // 📸 1. Screenshot BEFORE login (login page)
        File loginSrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File loginDest = new File("screenshots/login.png");
        FileHandler.copy(loginSrc, loginDest);

        LoginPage login = new LoginPage(driver);

        login.login("standard_user","secret_sauce");

        // ⏳ Wait for successful login page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("inventory_list")
        ));

        // 📸 2. Screenshot AFTER login (success page)
        File successSrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File successDest = new File("screenshots/success.png");
        FileHandler.copy(successSrc, successDest);

        tearDown();
    }
}