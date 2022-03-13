package com.automation.tests;

import org.testng.annotations.Test;

public class NavigationTest extends BaseTest{

    @Test
    public void verifyEachProductLinkNavigatesToProductDetailPage(){

        loginPage.doLogin();
        homePage.verifyPage();



    }
}
