package tests;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class LambdaPractice {

    @Test
    public void lambdaExample() {

        List<String> names = Arrays.asList("Java", "Selenium", "TestNG");

        names.forEach(name -> System.out.println(name));
    }
}