package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class SeleniumActionsPractice extends BaseTest {

    @Test
    public void seleniumActionsPractice() {

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        String placeholder = driver.findElement(By.id("user-name"))
                .getAttribute("placeholder");

        System.out.println("Placeholder: " + placeholder);

        Assert.assertTrue(
                driver.findElement(By.id("user-name")).isDisplayed());

        Assert.assertTrue(
                driver.findElement(By.id("user-name")).isEnabled());

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        String title = driver.findElement(By.className("title"))
                .getText();

        System.out.println("Page title: " + title);

        Assert.assertEquals(title, "Products");

        Select sortDropdown = new Select(
                driver.findElement(By.className("product_sort_container")));

        sortDropdown.selectByValue("lohi");

        WebElement selectedOption = driver.findElement(
                By.cssSelector(
                        "select.product_sort_container option[value='lohi']"));

        Assert.assertTrue(selectedOption.isSelected());
    }
}