package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.InvalidLoginException;
import base.BaseTest;
import pages.LoginPage;


public class LoginDataTest extends BaseTest {

    @Test(dataProvider = "loginData",
            dataProviderClass = DataProviderTest.class)
    public void loginTest(String username, String password)
            throws InvalidLoginException {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}