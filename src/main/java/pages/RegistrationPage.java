package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver;

    By signupBttn = By.linkText("Sign Up");
    By candidateBttn = By.linkText("Candidate");
    By usernameField = By.id("username");
    By emailField = By.id("email");
    By passwordField = By.id("password");
    By conpassField = By.id("conf-pass");
    By regisBttn = By.linkText("REGISTER NOW");

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSignupBttn() throws InterruptedException {
        driver.findElement(signupBttn).click();
        Thread.sleep(5000);
    }

    public void clickCandidateBttn() throws InterruptedException {
        driver.findElement(candidateBttn).click();
        Thread.sleep(5000);
    }

    public void setUsernameField(String username) throws InterruptedException {
        driver.findElement(usernameField).sendKeys(username);
        Thread.sleep(2000);

    }

    public void setEmailField(String email) throws InterruptedException {
        driver.findElement(emailField).sendKeys(email);
        Thread.sleep(2000);
    }

    public void setPasswordField(String password) throws InterruptedException {
        driver.findElement(passwordField).sendKeys(password);
        Thread.sleep(2000);

    }

    public void setConpassField(String cpassword) throws InterruptedException {
        driver.findElement(conpassField).sendKeys(cpassword);
        Thread.sleep(2000);
    }

    public void clickRegistrationBttn() throws InterruptedException {
       driver.findElement(regisBttn).click();
        Thread.sleep(2000);

    }

public void signup(String username, String email, String password, String cpassword) throws InterruptedException {
       clickSignupBttn();
       clickCandidateBttn();
       setUsernameField(username);
       setEmailField(email);
       setPasswordField(password);
       setConpassField(cpassword);
       clickRegistrationBttn();
}


}
