package tests;

import org.testng.annotations.Test;

public class GroupsTest {

    @Test(groups = "smoke")
    public void loginSmoke() {
        System.out.println("Smoke Test");
    }

    @Test(groups = "regression")
    public void productRegression() {
        System.out.println("Regression Test");
    }
}