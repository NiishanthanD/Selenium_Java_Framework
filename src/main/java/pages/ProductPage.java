package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    By pageTitle = By.className("title");
    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By cart = By.className("shopping_cart_link");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public void addBackpackToCart() {
        driver.findElement(backpack).click();
    }

    public void openCart() {
        driver.findElement(cart).click();
    }
}