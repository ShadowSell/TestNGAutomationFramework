package com.automation.tests;

import com.automation.pages.*;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

  public abstract class BaseTest{
      LoginPage loginPage;
      HomePage homePage;
      ProductDetailsPage productDetailsPage;
      CartPage cartPage;
      ReviewPage reviewPage;
      OrderConfirmationPage orderConfirmationPage;
      CheckoutPage checkoutPage;

      @BeforeMethod
      public void setUp(){
          DriverUtils.createDriver();
          loginPage = new LoginPage();
          homePage = new HomePage();
          productDetailsPage = new ProductDetailsPage();
          cartPage = new CartPage();
          reviewPage = new ReviewPage();
          orderConfirmationPage = new OrderConfirmationPage();
          checkoutPage = new CheckoutPage();
      }

      @AfterMethod
      public void cleanUp(){DriverUtils.getDriver().quit();
      }

  }