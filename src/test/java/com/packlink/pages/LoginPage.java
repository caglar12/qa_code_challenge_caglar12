package com.packlink.pages;

import com.packlink.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "email")
    public WebElement emailToBeUsed;

    @FindBy(name = "password")
    public WebElement passwordToBeUsed;

    @FindBy(xpath = "//button[@class='btn--primary btn']")
    public WebElement loginButton;

}
