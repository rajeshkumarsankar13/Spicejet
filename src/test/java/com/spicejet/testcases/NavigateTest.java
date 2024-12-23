package com.spicejet.testcases;

import com.spicejet.pages.BaseTest;
import org.testng.annotations.Test;

public class NavigateTest extends BaseTest {
    @Test
    public void test1()
    {
        chromedriver.navigate().to("https://www.spicejet.com/");
        chromedriver.navigate().refresh();
    }
    @Test
    public void test2()
    {
        String title = chromedriver.getTitle();
        System.out.println("Page Title is " + title);
    }
    @Test
    public void test3()
    {
        String url = chromedriver.getCurrentUrl();
        System.out.println("URL : " + url);
    }
}
