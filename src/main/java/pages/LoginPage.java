package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username = By.xpath("//input[@id='user-name']");
    By password = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id='login-button']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String usernameValue) {
        driver.findElement(username).sendKeys(usernameValue);
    }

    public void enterPassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}