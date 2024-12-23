package com.spicejet.pages;

import com.spicejet.utility.BrowserFactory;
import com.spicejet.utility.ConfigDataProviders;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;


public class BaseTest {
    public static WebDriver driver;
    public ConfigDataProviders config;
    public ChromeDriver chromedriver;
    ChromeOptions options = new ChromeOptions();

    @BeforeSuite
    public void setUpSuite()
    {

        config=new ConfigDataProviders();
    }
    @BeforeClass
    public void setUp()
    {

        driver= BrowserFactory.startApplication(driver,config.getBrowser(),config.getStagingUrl());
    }

    @AfterClass
    public void tearDown()
    {

        BrowserFactory.quitBrowser(driver);
    }
    public void captureScreenShot(WebDriver driver,String testName) throws IOException
    {
        // Convert webdriver object to TakesScreenshot interface
        TakesScreenshot screenshot= ((TakesScreenshot)driver);

        // Step 2 :call getScreenshotAs method to capture image file

        File src= screenshot.getScreenshotAs(OutputType.FILE);
        File srcpath=new File("."+"//Screenshots//"+ testName + ".png");

        // Step 3 : copy image file to destination
        FileUtils.copyFile(src, srcpath);

    }


}

