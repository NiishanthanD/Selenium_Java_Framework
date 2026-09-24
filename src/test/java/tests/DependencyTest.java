package tests;

import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void login() {
        System.out.println("Login Successful");
    }

    @Test(dependsOnMethods = "login")
    public void addToCart() {
        System.out.println("Product Added");
    }

    @Test(dependsOnMethods = "addToCart")
    public void checkout() {
        System.out.println("Checkout Completed");
    }
}