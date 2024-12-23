package com.spicejet.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle extends BaseTest{
    public static void main(String[] args) {
        ChromeDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://www.spicejet.com/");
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String parent = chromedriver.getWindowHandle();
        Set<String> s = chromedriver.getWindowHandles();

        for (String child_window : s) {
            if (!parent.equals(child_window)) {
                chromedriver.switchTo().window(child_window);
                System.out.println(chromedriver.switchTo().window(child_window).getTitle());
                chromedriver.close();
            }

        }
        chromedriver.switchTo().window(parent);
    }

}
