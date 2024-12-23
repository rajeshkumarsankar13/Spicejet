package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class ManageBookingPage extends BaseTest {
    ChromeOptions options = new ChromeOptions();
    @FindBy(xpath="//div[text()='manage booking']") WebElement manage;
    @FindBy(xpath="//input[@placeholder='e.g. W3X3H8']") WebElement pnr;
    @FindBy(xpath="//input[@placeholder='john.doe@spicejet.com / Doe']") WebElement user;
    @FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']") WebElement search;
    public void ManageBookingPortal(String pnrnum, String email) {
        // TODO Auto-generated method stub
        options.addArguments("disable-notifications");
        manage.click();
        pnr.sendKeys(pnrnum);
        user.sendKeys(email);
        search.click();
    }
}
