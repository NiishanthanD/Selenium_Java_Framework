package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.InvalidLoginException;

public class ParallelLoginTest extends BaseTest {

    @Test
    public void loginOne() throws InvalidLoginException {

        LoginPage login = new LoginPage(driver);

        login.login("standard_user", "secret_sauce");

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @Test
    public void loginTwo() throws InvalidLoginException {

        LoginPage login = new LoginPage(driver);

        login.login("problem_user", "secret_sauce");

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}