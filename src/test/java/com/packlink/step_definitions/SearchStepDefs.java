package com.packlink.step_definitions;

import com.packlink.pages.SearchPage;
import com.packlink.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchStepDefs {
    @When("user performs a search with the following information: Madrid -> Madrid. One parcel, {int} kg, {int} cm x {int} cm x {int} cm.")
    public void user_performs_a_search_with_the_following_information_Madrid_Madrid_One_parcel_kg_cm_x_cm_x_cm(int kg, int length, int width, int height) throws InterruptedException {
        SearchPage searchPage = new SearchPage();
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.elementToBeClickable(searchPage.addShipment));
        searchPage.addShipment.click();
        searchPage.selectCityFrom.sendKeys("04810 - Madrid");
        Thread.sleep(1000);
        searchPage.selectFirstOption.click();
        searchPage.selectCityTo.sendKeys("04810 - Madrid");
        searchPage.selectFirstOption1.click();
        searchPage.packageWeight.sendKeys("1");
        searchPage.length.sendKeys("10");
        searchPage.width.sendKeys("10");
        searchPage.height.sendKeys("10");
        searchPage.obtainPrice.click();
    }

    @Then("user selects the first service of the list")
    public void user_selects_the_first_service_of_the_list() throws InterruptedException {
        SearchPage searchPage = new SearchPage();
        searchPage.selectFirstPrice.click();
        Thread.sleep(1000);


    }

}
