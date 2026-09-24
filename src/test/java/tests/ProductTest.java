package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;
import utils.InvalidLoginException;

public class ProductTest extends BaseTest {

    @Test
    public void productTest() throws InvalidLoginException {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        ProductPage productPage = new ProductPage(driver);

        Assert.assertEquals(productPage.getPageTitle(), "Products");

        productPage.addBackpackToCart();
        productPage.openCart();

        Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
    }
}