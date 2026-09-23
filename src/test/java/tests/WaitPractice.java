package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class WaitPractice extends BaseTest {

    @Test
    public void explicitWaitExample() {

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("login-button"))).click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("title")));
    }
}