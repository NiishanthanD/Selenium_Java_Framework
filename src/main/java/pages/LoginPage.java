package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    By username = By.xpath("//input[@id='user-name']");
    By password = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id='login-button']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10));
    }

    public void enterUsername(String usernameValue) {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(usernameValue);
    }

    public void enterPassword(String passwordValue) {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(passwordValue);
    }

    public void clickLogin() {
        wait.until(
                ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}