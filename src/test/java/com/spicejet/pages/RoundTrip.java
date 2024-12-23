package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class RoundTrip extends BaseTest {

    ChromeOptions options = new ChromeOptions();
    @FindBy(xpath="//div[text()='round trip']") WebElement trip;
    @FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']") WebElement from;
    @FindBy(xpath="//div[@class='css-76zvg2 r-1xedbs3 r-ubezar']") WebElement desg;
    @FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']") WebElement to;
    @FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']") WebElement date;
    @FindBy(xpath="//div[text()='Students']") WebElement type;
    @FindBy(xpath="//div[@data-testid='home-page-flight-cta']") WebElement search;

    public void RoundTripPortal(String fpoint) {
        // TODO Auto-generated method stub
        options.addArguments("disable-notifications");
        trip.click();
        from.sendKeys(fpoint);
        desg.click();
        to.click();
        date.click();
        type.click();
        search.click();
    }
}
