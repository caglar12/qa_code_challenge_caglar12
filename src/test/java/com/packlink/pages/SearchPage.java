package com.packlink.pages;

import com.packlink.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[.=' Añadir envío ']")
    public WebElement addShipment;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement selectCityFrom;

    @FindBy(xpath = "(//li[@class='eb-selector__item is-selected'])[2]")
    public WebElement selectFirstOption;

    @FindBy(xpath = "(//input[@type='text'])[9]")
    public WebElement selectCityTo;

    @FindBy(xpath = "(//li[@class='eb-selector__item is-selected'])[4]")
    public WebElement selectFirstOption1;

    @FindBy(id = "weight-0")
    public WebElement packageWeight;

    @FindBy(id = "length-0")
    public WebElement length;

    @FindBy(id = "width-0")
    public WebElement width;

    @FindBy(id = "height-0")
    public WebElement height;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement obtainPrice;

    @FindBy(xpath = "//span[@class='eb-quote__price eb-quote__price--app']")
    public WebElement selectFirstPrice;




}
