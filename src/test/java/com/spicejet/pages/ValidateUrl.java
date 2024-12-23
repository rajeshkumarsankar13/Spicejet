package com.spicejet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ValidateUrl extends BaseTest {

    public static void main(String[] args) {
        ChromeDriver driver= new ChromeDriver();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);
        }
    }
    private static void verifyLink(String url) {
        try {
            HttpURLConnection connection= (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            int status = connection.getResponseCode();
            String message = connection.getResponseMessage();

            if (status >=400) {
                System.out.println(url + " -broken " +" "+status+" "+message);
            } else {
                System.out.println(url + " -working " +" "+status+" "+message);
            }
        } catch (IOException e) {
            System.out.println("not working");
        }
    }
}

