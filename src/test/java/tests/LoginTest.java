package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    WebDriver driver;

    @Test
    public void LoginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("nabila@yopmail.com", "Abc123456");
        String actualTile = driver.getTitle();
        String expectedTitle = "Home";
        Assert.assertEquals(actualTile, expectedTitle, "Login failed or incorrect page title");

    }


}
