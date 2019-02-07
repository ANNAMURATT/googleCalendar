package com.anna.pages;

import com.anna.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginInPage {
    public LoginInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[*='365 Portal']//span")
    public WebElement portal;

    @FindBy(css = "#loginHeader")
    public WebElement signInTitle;
}
