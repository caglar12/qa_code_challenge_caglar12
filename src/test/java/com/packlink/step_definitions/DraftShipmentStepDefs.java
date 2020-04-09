package com.packlink.step_definitions;

import com.packlink.pages.DraftShipmentPage;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class DraftShipmentStepDefs {

    @And("user clicks save button")
    public void user_clicks_save_button() {
        DraftShipmentPage draftShipmentPage = new DraftShipmentPage();
        draftShipmentPage.saveButton.click();
    }

    @Then("it will appear in the shipment list")
    public void it_will_appear_in_the_shipment_list() {
        DraftShipmentPage draftShipmentPage = new DraftShipmentPage();
        String expectedDestination = "Madrid 04810 ES";
        String expectedPackageInfo ="1 kg 10 x 10 x 10 cm\n" + "Contenido no definido";
        String expectedPrice = "€2.81";
        String expectedUndonePart = "INCOMPLETO";
        assertTrue(draftShipmentPage.destination.getText().contains(expectedDestination));
        assertTrue(draftShipmentPage.packageInfo.getText().contains(expectedPackageInfo));
        assertTrue(draftShipmentPage.price.getText().contains(expectedPrice));
        assertTrue(draftShipmentPage.incomplete.getText().contains(expectedUndonePart));



    }
}
