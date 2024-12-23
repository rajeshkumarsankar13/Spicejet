package com.spicejet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BaseTest {
    WebDriver driver;
    //constructor
    public SignUpPage(WebDriver lDriver)
    {
        this.driver=lDriver;
        PageFactory.initElements(driver,this);
        driver.navigate().to("https://spiceclub.spicejet.com/signup");
    }

    @FindBy Select title = new Select(chromedriver.findElement(By.xpath("//Select[@class='form-control form-select ']")));
    @FindBy(id="first_name") WebElement fname;
    @FindBy(id="last_name") WebElement lname;
    @FindBy(xpath="//img[@class='d-inline-block datepicker']") WebElement date;
    @FindBy Select month = new Select(chromedriver.findElement(By.xpath("//Select[@class='react-datepicker__month-select']")));
    @FindBy Select year = new Select(chromedriver.findElement(By.xpath("//Select[@class='react-datepicker__year-select']")));
    @FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--013']") WebElement day;
    @FindBy(xpath="//input[@class=' form-control']") WebElement mob;
    @FindBy(id="email_id") WebElement email;
    @FindBy(id="new-password") WebElement pass;
    @FindBy(id="c-password") WebElement conpass;
    @FindBy(id="defaultCheck1") WebElement check;
    @FindBy(xpath="//button[text()='Submit']") WebElement account;

    public void SignUpToPortal(String first_name, String last_name, String mon, String yr, String mobile, String Email, String password, String cpassword) {
        // TODO Auto-generated method stub
        title.selectByVisibleText(title.toString());
        fname.sendKeys(first_name);
        lname.sendKeys(last_name);
        date.click();
        month.selectByValue(String.valueOf(month));
        year.selectByValue(year.toString());
        day.click();
        mob.sendKeys(mobile);
        email.sendKeys(Email);
        pass.sendKeys(password);
        conpass.sendKeys(cpassword);
        check.click();
        account.click();
    }
}
