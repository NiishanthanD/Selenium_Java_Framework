package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void productTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        ProductPage productPage = new ProductPage(driver);

        Assert.assertEquals(
                productPage.getPageTitle(),
                "Products");

        productPage.addBackpackToCart();
        productPage.openCart();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("cart"));
    }
}