package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By pageTitle = By.className("title");
    private By backpack = By.id("add-to-cart-sauce-labs-backpack");
    private By cart = By.className("shopping_cart_link");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getPageTitle() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }

    public void addBackpackToCart() {
        wait.until(
                ExpectedConditions.elementToBeClickable(backpack)).click();
    }

    public void openCart() {
        wait.until(
                ExpectedConditions.elementToBeClickable(cart)).click();
    }
}