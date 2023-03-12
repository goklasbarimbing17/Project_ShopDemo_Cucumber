package com.juaracoding.shopdemo.drivers.pages;

import com.juaracoding.shopdemo.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutProductPage {
    WebDriver driver;

    public CheckoutProductPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//i[@class='icon_bag_alt']")
    WebElement btnCart;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward wp-element-button']")
    WebElement btnCheckout;
    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='billing_company']")
    WebElement companyName;
    @FindBy(xpath = "//span[@id='select2-billing_country-container']")
    WebElement dropDownCountry;
    @FindBy(xpath = "//input[@role='combobox']")
    WebElement txtCountry;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    WebElement address1;
    @FindBy(xpath = "//input[@id='billing_address_2']")
    WebElement address2;
    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement city;
    @FindBy(xpath = "//span[@id='select2-billing_state-container']")
    WebElement dropDownprovince;
    @FindBy(xpath = "//input[@role='combobox']")
    WebElement txtProvince;
    @FindBy(xpath = "//input[@id='billing_postcode']")
    WebElement postCode;
    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement phone;
    @FindBy(xpath = "//textarea[@id='order_comments']")
    WebElement notesOrder;
    @FindBy(xpath = "//*[@id=\"terms\"]")
    WebElement cbTerms;
    @FindBy(xpath = "//button[@id='place_order']")
    WebElement btnPlaceOrder;
    @FindBy(xpath = "//p[@class='woocommerce-thankyou-order-received']")
    WebElement msgSuccessCheckout;

    public void setFullName(String firstName, String lastName){
        this.firstName.clear();
        this.firstName.sendKeys(firstName);
        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }
    public void clickBtnCart(){
        this.btnCart.click();
    }
    public void clickBtnCheckout(){
        this.btnCheckout.click();
    }
    public void setCompanyName(String companyName){
        this.companyName.clear();
        this.companyName.sendKeys(companyName);
    }
    public void setCountry(String country){
        this.dropDownCountry.click();
        this.txtCountry.clear();
        this.txtCountry.sendKeys(country, Keys.ENTER);
    }
    public void setAddress(String address1, String address2){
        this.address1.clear();
        this.address1.sendKeys(address1);
        this.address2.clear();
        this.address2.sendKeys(address2);
    }
    public void setCity(String city){
        this.city.clear();
        this.city.sendKeys(city);
    }
    public void setProvince(String province){
        this.dropDownprovince.click();
        this.txtProvince.clear();
        this.txtProvince.sendKeys(province, Keys.ENTER);
    }
    public void setPostCode(String postCode){
        this.postCode.clear();
        this.postCode.sendKeys(postCode);
    }
    public void setPhone(String phone){
        this.phone.clear();
        this.phone.sendKeys(phone);
    }
    public void sertOrderNotes(String notesOrder){
        this.notesOrder.clear();
        this.notesOrder.sendKeys(notesOrder);
    }
    public void clickCbTerms(){
        this.cbTerms.click();
    }
    public void clickBtnPlaceOrder(){
        this.btnPlaceOrder.click();
    }
    public String getMsgSuccessCheckout(){
        return this.msgSuccessCheckout.getText();
    }

}
