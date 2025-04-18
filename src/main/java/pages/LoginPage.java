package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By loginBttn = By.linkText("Log In");
    By emailField = By.id("email");
    By passwordField = By.id("password");
    By signinBttn = By.linkText("Login");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void hitLoginBttn() throws InterruptedException {
        driver.findElement(loginBttn).click();
        Thread.sleep(5000);

    }

    public void setEmailField(String email) throws InterruptedException {
        driver.findElement(emailField).sendKeys(email);
        Thread.sleep(5000);
    }

    public void setPasswordField(String password) throws InterruptedException {
        driver.findElement(passwordField).sendKeys(password);
        Thread.sleep(5000);

    }

    public void clickSigninBttn() throws InterruptedException {
        driver.findElement(signinBttn).click();
        Thread.sleep(5000);
    }

    public void login(String email, String password) throws InterruptedException {
        hitLoginBttn();
        setEmailField(email);
        setPasswordField(password);
        clickSigninBttn();

    }
}
