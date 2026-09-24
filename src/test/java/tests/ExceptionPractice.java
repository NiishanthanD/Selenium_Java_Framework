package tests;

import org.testng.annotations.Test;

public class ExceptionPractice {

    @Test
    public void exceptionExample() {

        try {
            int value = 10 / 0;
            System.out.println(value);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
    }
}