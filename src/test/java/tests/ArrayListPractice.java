package tests;

import java.util.ArrayList;
import org.testng.annotations.Test;

public class ArrayListPractice {

    @Test
    public void arrayListExample() {

        ArrayList<String> names = new ArrayList<>();

        names.add("Java");
        names.add("Selenium");
        names.add("TestNG");

        System.out.println(names);

        System.out.println(names.get(1));

        names.remove("Java");

        System.out.println(names);
    }
}