package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class FlightStatusPage extends BaseTest{
    ChromeOptions options = new ChromeOptions();
    @FindBy(xpath="//div[text()='flight status']") WebElement fstatus;
    @FindBy(xpath="//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']") WebElement date;
    @FindBy(xpath="//div[text()='Tomorrow']") WebElement day;
    @FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']") WebElement from;
    @FindBy(xpath="//div[@class='css-76zvg2 r-1xedbs3 r-ubezar']") WebElement dest;
    @FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']") WebElement to;
    @FindBy(xpath="//input[@value='SG - ']") WebElement fnum;
    @FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-13qz1uu']") WebElement search;
    public void FlightStatusPortal(String placefrom, String f_num) {
        // TODO Auto-generated method stub
        options.addArguments("disable-notifications");
        fstatus.click();
        date.click();
        day.click();
        from.sendKeys(placefrom);
        dest.click();
        to.click();
        fnum.sendKeys(f_num);
        search.click();
    }
}
