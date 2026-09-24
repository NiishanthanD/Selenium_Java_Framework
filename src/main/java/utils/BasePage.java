package utils;

import org.openqa.selenium.WebDriver;

public abstract class BasePage implements BrowserActions {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void open() {
        driver.get("https://www.saucedemo.com/");
    }

    @Override
    public void close() {
        driver.quit();
    }
}