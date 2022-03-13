package com.automation.tests;

import org.testng.annotations.Test;

public class ShoppingCartTests extends BaseTest{

    @Test
    public void verify2ItemsDisplayedInCart(){
        loginPage.doLogin();
        homePage.clickOnItem();
        productDetailsPage.verifyPage();
        productDetailsPage.clickOnAddToCartBtn();
        productDetailsPage.clickOnCartIcon();
        cartPage.verifyPage();
        cartPage.clickOnContinueShoppingBtn();
        cartPage.clickOnSecondItem();
        productDetailsPage.clickOnAddToCartBtn();
        productDetailsPage.clickOnCartIcon();
        cartPage.checkNumberOfItems();
    }

}
