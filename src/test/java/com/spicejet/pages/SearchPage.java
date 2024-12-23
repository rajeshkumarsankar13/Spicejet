package com.spicejet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage  {
    WebDriver driver;
    //constructor
    public SearchPage(WebDriver lDriver)
    {
        this.driver=lDriver;

        PageFactory.initElements(driver,this);
    }

    @FindBy(name="st")
    WebElement searchInput;

    @FindBy(xpath="//span[@class='header-search-icon']") WebElement serachbtn;


    public void serachProduct(String productName)
    {
        searchInput.sendKeys(productName);

        serachbtn.click();
    }
}
