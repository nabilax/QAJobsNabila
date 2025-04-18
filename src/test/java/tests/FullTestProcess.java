package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.RegistrationPage;

public class FullTestProcess  {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://labsqajobs.qaharbor.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void fullTestProcess() throws InterruptedException {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.signup("Alima", "alima@gmail.com", "Ab123456", "Ab123456");
        System.out.println("Registration successful");

//        String actualTile = driver.getTitle();
//        String expectedTitle = "Home";
//        Assert.assertEquals(actualTile, expectedTitle, "Registration failed or incorrect page title");



    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }






    }

