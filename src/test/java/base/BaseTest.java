package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import driver.DriverFactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void startBrowser() {
        driver = DriverFactory.createDriver();
    }

    @BeforeMethod
    public void openApplication() {
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}