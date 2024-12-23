package com.spicejet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class LoginPage extends BaseTest {
    WebDriver driver;
    //constructor
    public LoginPage(WebDriver lDriver)
    {
        this.driver=lDriver;
        PageFactory.initElements(driver,this);
        driver.navigate().to("//div[@class='css-76zvg2 r-jwli3a r-ubezar']");
    }
    @FindBy(xpath = "//div[text()='Email']") WebElement email;
    @FindBy(xpath="//input[@data-testid='user-mobileno-input-box']") WebElement uname;
    @FindBy(xpath="//input[@data-testid='password-input-box-cta']") WebElement pass;
    @FindBy(xpath="//div[text()='LOGIN']") WebElement loginButton;

    public void loginToPortal(String username, String password) {
        // TODO Auto-generated method stub
        email.click();
        uname.sendKeys(username);
        pass.sendKeys(password);
        loginButton.click();
    }

    public void dashboardportal(String dash) throws IOException
    {
        String actualdash= driver.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).getText();
        System.out.println(actualdash);

        if(actualdash.equals(dash))
        {
            System.out.println("Test Passed");

        }
        else
        {
            captureScreenShot(driver,"fetchDashboardText");
        }
        assertEquals(dash, actualdash);


    }

    public void captureScreenShot(WebDriver driver, String fetchDashboardText) {
    }

    private void assertEquals(String dash, String actualdash) {
    }
}
