package com.spicejet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomePageBottomLinks extends BaseTest{
    public static void main(String[] args) {
        ChromeDriver chromedriver = new ChromeDriver();
        WebElement foot = chromedriver.findElement(By.id("footer"));
        List<WebElement> links = chromedriver.findElements(By.tagName("a"));
        int count = links.size();
        System.out.println("The Number of Links in Footer is " +count);
    }
}
