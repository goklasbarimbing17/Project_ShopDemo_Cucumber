package com.juaracoding.shopdemo.stepdefinitions;

import com.juaracoding.shopdemo.drivers.pages.CheckoutProductPage;
import com.juaracoding.shopdemo.drivers.pages.LoginPage;
import com.juaracoding.shopdemo.hooks.Hooks;
import com.juaracoding.shopdemo.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCheckoutProduct {
    public static WebDriver driver;
    public static CheckoutProductPage checkoutProductPage = new CheckoutProductPage();
    public static LoginPage loginPage = new LoginPage();
    public TestCheckoutProduct(){
        driver = Hooks.driver;
    }

    @Given("User login into web shop demo")
    public void user_login_into_web_shop_demo() {
        loginPage.loginUser("bimosakti",    "BimoSakti123$");
    }

    @When("User click feature Cart")
    public void user_click_feature_cart() {
        checkoutProductPage.clickBtnCart();
    }

    @When("User click button proceed to checkout")
    public void user_click_button_proceed_to_checkout() {
        checkoutProductPage.clickBtnCheckout();
    }

    @When("User enter firstname as {string} and lastname as {string}")
    public void user_enter_firstname_as_and_lastname_as(String firstName, String lastName) {
        checkoutProductPage.setFullName(firstName, lastName);
    }

    @When("User enter company name as {string}")
    public void user_enter_company_name_as(String companyName) {
        checkoutProductPage.setCompanyName(companyName);
    }

    @When("User select country or region as {string}")
    public void user_select_country_or_region_as(String country) {
        checkoutProductPage.setCountry(country);
        Hooks.delay(3);
    }

    @When("User enter Street address as {string} and {string}")
    public void user_enter_street_address_as_and(String address1, String address2) {
        checkoutProductPage.setAddress(address1,address2);
        Hooks.delay(3);
    }

    @When("User enter city as {string}")
    public void user_enter_city_as(String city) {
        checkoutProductPage.setCity(city);
        Hooks.delay(3);
    }

    @When("User select and enter province as {string}")
    public void user_select_and_enter_province_as(String province) {
        checkoutProductPage.setProvince(province);
        Hooks.delay(3);
    }

    @When("User enter post code as {string}")
    public void user_enter_post_code_as(String postCode) {
        checkoutProductPage.setPostCode(postCode);
        Hooks.delay(3);
    }

    @When("User enter phone number as {string}")
    public void user_enter_phone_number_as(String phone) {
        checkoutProductPage.setPhone(phone);
        Hooks.delay(3);
    }

    @When("User enter order notes as {string}")
    public void user_enter_order_notes_as(String notes) {
        checkoutProductPage.sertOrderNotes(notes);
        Hooks.delay(3);
    }

    @When("User agree to the website terms and conditions")
    public void user_agree_to_the_website_terms_and_conditions() {
        checkoutProductPage.clickCbTerms();
        Hooks.delay(3);
    }

    @When("User click button place order")
    public void user_click_button_place_order() {
        checkoutProductPage.clickBtnPlaceOrder();
    }

    @Then("User can view messages success checkout product {string}")
    public void user_can_view_messages_success_checkout_product(String msgSuccessCheckout) {
        Assert.assertEquals(checkoutProductPage.getMsgSuccessCheckout(),msgSuccessCheckout);
    }
}
