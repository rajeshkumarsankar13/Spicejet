package com.spicejet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NavigatePage extends BaseTest {
    public void navigate() throws InterruptedException {
        Actions action = new Actions(chromedriver);
        chromedriver.navigate().to("https://www.spicejet.com/");
        chromedriver.navigate().refresh();
        WebElement signup = chromedriver.findElement(By.xpath("//div[text()='Signup']"));
        action.moveToElement(signup).perform();
        WebElement login = chromedriver.findElement(By.xpath("//div[text()='Login']"));
        action.moveToElement(login).build().perform();
        Thread.sleep(2000);
        chromedriver.navigate().back();
        Thread.sleep(2000);
        chromedriver.navigate().back();
        Thread.sleep(2000);
        chromedriver.navigate().forward();
        Thread.sleep(2000);
        chromedriver.navigate().forward();
        Thread.sleep(2000);
        chromedriver.navigate().refresh();
        chromedriver.close();
    }

}
