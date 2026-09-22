package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class XPathPractice extends BaseTest {

    @Test
    public void xpathPractice() {

        // Level 1 - Basic XPath
        driver.findElement(By.xpath("//input"));
        driver.findElement(By.xpath("//input[@id='user-name']"));
        driver.findElement(By.xpath("//input[@name='user-name']"));
        driver.findElement(By.xpath("//input[@type='text']"));

        // Level 2 - Multiple attributes
        driver.findElement(By.xpath(
                "//input[@type='text' and @id='user-name']"));

        // Level 3 - contains()
        driver.findElement(By.xpath(
                "//input[contains(@id,'user')]"));

        driver.findElement(By.xpath(
                "//input[contains(@placeholder,'Username')]"));

        // Level 4 - starts-with()
        driver.findElement(By.xpath(
                "//input[starts-with(@id,'user')]"));

        // Level 5 - text()
        driver.findElement(By.xpath(
                "//div[text()='Swag Labs']"));

        // Level 6 - Parent / Child
        driver.findElement(By.xpath(
                "//input[@id='user-name']/parent::div" ));

        driver.findElement(By.xpath(
                "//form/descendant::input[@id='user-name']"));

        // Level 7 - XPath Axes

        // preceding
        driver.findElement(By.xpath(
                "//input[@id='password']/preceding::input[@id='user-name']"));

        // following
        driver.findElement(By.xpath(
                "//input[@id='user-name']/following::input[@id='password']"));

        // ancestor
        driver.findElement(By.xpath(
                "//input[@id='password']/ancestor::form"));

        // descendant
        driver.findElement(By.xpath(
                "//form/descendant::input"));
    }
}