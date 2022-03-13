package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CartPage extends BasePage{

    @FindBy(id="remove-sauce-labs-backpack")
    WebElement removeBtn;

    @FindBy(id="checkout")
    WebElement checkoutBtn;

    @FindBy(id="continue-shopping")
    WebElement continueShoppingButton;

    @FindBy(xpath="//div[@class='inventory_item_name']")
    WebElement itemName;

    @FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
    WebElement secondItem;

    @FindBy(xpath = "//div[@class ='cart_item']")
    List<WebElement> cartItemsAdded;

    public void verifyPage() {
        Assert.assertTrue(removeBtn.isDisplayed(), "Remove button is missing from cart page");
        Assert.assertTrue(itemName.isDisplayed(), "Item name is missing from cart page page");
        Assert.assertEquals(checkoutBtn.isDisplayed(), true, "Checkout button is missing from cart page page");
    }

    public void clickOnCheckoutBtn() {
        checkoutBtn.click();
    }
    public void clickOnContinueShoppingBtn(){
        continueShoppingButton.click();
    }
    public void clickOnSecondItem(){
        secondItem.click();
    }
    public void checkNumberOfItems(){
        List<WebElement> list = cartItemsAdded;
        int amount = list.size();
        Assert.assertEquals(list.size(), 2, "Numbers of items in the cart is "+ amount + "per requirements should be two.");

    }
}
