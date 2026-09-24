package tests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class StreamPractice {

    @Test
    public void streamExample() {

        List<String> names = Arrays.asList("Java", "Selenium", "TestNG", "Maven");

        List<String> result = names.stream().filter(name -> name.length() > 5).collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}