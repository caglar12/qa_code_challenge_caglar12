package com.packlink.step_definitions;

import com.packlink.pages.LoginPage;
import com.packlink.pages.RegistrationPage;
import com.packlink.utilities.ConfigurationReader;
import com.packlink.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RegisterStepDefs {

    String mail = ConfigurationReader.get("mail");
    String password = ConfigurationReader.get("password");


    @Given("user opens registration page")
    public void user_opens_registration_page() {
       String url= ConfigurationReader.get("registrationPage");
       Driver.get().get(url);
    }

    @When("user is in registration page")
    public void user_is_in_registration_page() {
        String expectedTitle = "Packlink Pro Registro";
        String actualTitle = Driver.get().getTitle();
        assertEquals(expectedTitle,actualTitle);
    }

    @Then("user should be able to see the registration form with required fields")
    public void user_should_be_able_to_see_the_registration_form_with_required_fields() {
        RegistrationPage registrationPage = new RegistrationPage();
        assertNotNull(registrationPage.registerButton);
    }
    @Then("user fills the form")
    public void user_fills_the_form() throws InterruptedException {

        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.emailToBeUsed.sendKeys(mail);
        registrationPage.passwordToBeUsed.sendKeys(password);
        Actions action = new Actions(Driver.get());
        action.sendKeys(registrationPage.numberOfShipmentsPerMonth,"1 - 10"+ Keys.ENTER).build().perform();
        action.sendKeys(registrationPage.platformName,"WooCommerce"+Keys.ENTER).build().perform();
        action.sendKeys(registrationPage.onlineShop,"ebay"+Keys.ENTER).build().perform();
        registrationPage.phoneNumber.sendKeys("123456789");
        registrationPage.acceptTermsAndConditions.click();
        registrationPage.authorizePacklink.click();
        registrationPage.registerButton.click();
    }

    @Given("user opens login page")
    public void user_opens_login_page() {
       String url = ConfigurationReader.get("loginPage");
       Driver.get().get(url);
    }

    @When("user enter email and password")
    public void user_enter_email_and_password() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.emailToBeUsed.sendKeys(mail);
        loginPage.passwordToBeUsed.sendKeys(password);
        loginPage.loginButton.click();
        Thread.sleep(3000);
    }

    @Then("user should be in dashboard page")
    public void user_should_be_in_dashboard_page() throws InterruptedException {
        String expectedTitle = "Packlink PRO";
        String actualTitle = Driver.get().getTitle();
        assertEquals(expectedTitle,actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);


    }

}
