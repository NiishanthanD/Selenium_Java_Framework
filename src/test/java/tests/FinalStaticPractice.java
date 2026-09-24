package tests;

import org.testng.annotations.Test;

public class FinalStaticPractice {

    static String company = "OpenAI";

    final String project = "Selenium Framework";

    @Test
    public void finalStaticExample() {

        System.out.println(company);
        System.out.println(project);
    }
}