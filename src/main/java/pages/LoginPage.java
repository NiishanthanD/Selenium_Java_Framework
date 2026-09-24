package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BasePage;
import utils.InvalidLoginException;

public class LoginPage extends BasePage {

    private WebDriverWait wait;

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void login(String user, String pass) throws InvalidLoginException {

        wait.until(ExpectedConditions.visibilityOfElementLocated(username))
                .sendKeys(user);

        wait.until(ExpectedConditions.visibilityOfElementLocated(password))
                .sendKeys(pass);

        wait.until(ExpectedConditions.elementToBeClickable(loginButton))
                .click();

        wait.until(ExpectedConditions.or(
                ExpectedConditions.urlContains("inventory"),
                ExpectedConditions.visibilityOfElementLocated(errorMessage)));

        if (driver.findElements(errorMessage).size() > 0) {
            throw new InvalidLoginException("Invalid username or password");
        }
    }
}