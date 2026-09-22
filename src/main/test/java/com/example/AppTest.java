package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testApplication() {

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("http://localhost:8080");

            String heading =
                    driver.findElement(By.tagName("h1")).getText();

            assertEquals(
                    "Welcome to DevOps Pipeline",
                    heading);

        } finally {

            driver.quit();
        }
    }
}