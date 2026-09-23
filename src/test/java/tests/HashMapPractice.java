package tests;

import java.util.HashMap;
import org.testng.annotations.Test;

public class HashMapPractice {

    @Test
    public void hashMapExample() {

        HashMap<String, String> users = new HashMap<>();

        users.put("username", "standard_user");
        users.put("password", "secret_sauce");

        System.out.println(users);

        System.out.println(users.get("username"));
    }
}