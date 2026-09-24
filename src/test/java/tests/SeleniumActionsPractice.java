package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.InvalidLoginException;

public class SeleniumActionsPractice extends BaseTest {

    @Test
    public void seleniumActionsPractice() throws InvalidLoginException {

        // getAttribute
        String placeholder = driver.findElement(By.id("user-name"))
                .getAttribute("placeholder");

        System.out.println("Placeholder: " + placeholder);

        // isDisplayed & isEnabled
        Assert.assertTrue(driver.findElement(By.id("user-name")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("user-name")).isEnabled());

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // getText
        String title = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(title, "Products");

        // isSelected
        Select sort = new Select(
                driver.findElement(By.className("product_sort_container")));

        sort.selectByValue("lohi");

        WebElement selected = driver.findElement(
                By.cssSelector("option[value='lohi']"));

        Assert.assertTrue(selected.isSelected());
    }
}