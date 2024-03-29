package com.automation.pages;

import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class LoginPage {
    @FindBy(id = "user-name")
    WebElement userNameEle;

    @FindBy(id = "password")
    WebElement passwordEle;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    public void doLogin(){
        userNameEle.sendKeys(PropertyReader.getProperty("login.username"));
        passwordEle.sendKeys(PropertyReader.getProperty("login.password"));
        loginBtn.click();
    }

    public void verifyPage(){
        Assert.assertTrue(userNameEle.isDisplayed(), "Username input is missing from login page");
        Assert.assertTrue(passwordEle.isDisplayed(), "Password input is missing from login page");
    }
}


