package tests;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"}};
    }
}