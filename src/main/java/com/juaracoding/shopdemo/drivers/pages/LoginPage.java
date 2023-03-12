package com.juaracoding.shopdemo.drivers.pages;

import com.google.j2objc.annotations.Weak;
import com.juaracoding.shopdemo.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement txtUsername;
    @FindBy(xpath = "//input[@id='password']")
    WebElement txtPassword;
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement btnLogin;
    @FindBy(xpath = "//div[@id='primary']//li[1]")
    WebElement msgInvalidCredentials;
    @FindBy(xpath = "//p[contains(text(),'Hello')]")
    WebElement msgDashboard;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement btnLogout;
    @FindBy(xpath = "//h2[normalize-space()='Login']")
    WebElement txtLoginPage;

    public void setTxtUsername(String username){
        this.txtUsername.clear();
        this.txtUsername.sendKeys(username);
    }
    public void setTxtPassword(String password){
        this.txtPassword.sendKeys(password);
    }
    public void clickBtnLogin(){
        this.btnLogin.click();
    }
    public void clickBtnLogout(){
        this.btnLogout.click();
    }
    public String getMsgInvalidCredentials(){
        return msgInvalidCredentials.getText();
    }
    public String getMsgDashboard(){
        return msgDashboard.getText();
    }
    public String getTxtLoginPage(){
        return txtLoginPage.getText();
    }
    public void loginUser(String username, String password){
        this.txtUsername.sendKeys(username);
        this.txtPassword.sendKeys(password);
        this.btnLogin.click();
    }
}
