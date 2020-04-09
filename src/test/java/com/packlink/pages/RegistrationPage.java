package com.packlink.pages;

import com.packlink.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public RegistrationPage() {
        PageFactory.initElements(Driver.get(), this);
    }

        @FindBy(xpath = "//button[@class='btn--primary btn']")
        public WebElement registerButton;

        @FindBy(name = "email")
        public WebElement emailToBeUsed;

        @FindBy(name = "password")
        public WebElement passwordToBeUsed;

        @FindBy(xpath = "(//div[@class='field__select__value-container css-1hwfws3'])[1]")
        public WebElement numberOfShipmentsPerMonth;

        @FindBy(xpath = "(//div[@class='field__select__value-container css-1hwfws3'])[1]")
        public WebElement platformName;

        @FindBy(xpath = "(//div[@class='field__select__value-container css-1hwfws3'])[1]")
        public WebElement onlineShop;

        @FindBy(name = "phone")
        public WebElement phoneNumber;

        @FindBy(xpath = "(//span[@class='field__checkmark'])[1]")
        public WebElement acceptTermsAndConditions;

        @FindBy(xpath = "(//span[@class='field__checkmark'])[2]")
        public WebElement authorizePacklink;

}
