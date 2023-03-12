package com.juaracoding.shopdemo.stepdefinitions;

import com.juaracoding.shopdemo.drivers.pages.LoginPage;
import com.juaracoding.shopdemo.hooks.Hooks;
import com.juaracoding.shopdemo.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    public static WebDriver driver;
    public static LoginPage loginPage = new LoginPage();
    public TestLogin(){
        driver = Hooks.driver;
    }

    @Given("User open browser and url shop demo")
    public void user_open_browser_and_url_shop_demo() {
        driver.get(Constants.URL);
    }

    @When("User enter username as {string}")
    public void user_enter_username_as(String username) {
        loginPage.setTxtUsername(username);
    }

    @When("User enter password as {string}")
    public void user_enter_password_as(String password) {
        loginPage.setTxtPassword(password);
    }

    @When("User click button login")
    public void user_click_button_login() {
        loginPage.clickBtnLogin();
    }

    @When("User click button logout")
    public void user_click_button_logout() {
        loginPage.clickBtnLogout();
    }

    @Then("User go to page Dashboard {string}")
    public void user_go_to_page_dashboard(String txtDashboard) {
        Assert.assertTrue(loginPage.getMsgDashboard().contains(txtDashboard));
    }

    @Then("User can view title login page {string}")
    public void user_can_view_title_login_page(String txtLoginPage) {
        Assert.assertEquals(loginPage.getTxtLoginPage(),txtLoginPage);
    }

    @Then("User can view messages error {string}")
    public void user_can_view_messages_error(String msgInvalidCredentials) {
        Assert.assertEquals(loginPage.getMsgInvalidCredentials(),msgInvalidCredentials);
    }

}
