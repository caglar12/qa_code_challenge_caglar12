package com.packlink.pages;

import com.packlink.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DraftShipmentPage {

    public DraftShipmentPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//button[@class='btn--primary btn btn--block btn--small'])[2]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[.='Madrid 04810 ES']")
    public WebElement destination;

    @FindBy(xpath = "(//p[@class='eb-shipments-row__subtitle'])[2]")
    public WebElement packageInfo;

    @FindBy(xpath = "//p[@class='eb-shipments-row__meta eb-shipments-row__meta--price']")
    public WebElement price;

    @FindBy(xpath = "//p[@class='eb-shipments-row__status eb-shipments-row__status--awaiting-completion']")
    public WebElement incomplete;





}
