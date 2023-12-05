package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BagsPage extends Utility {
    By nameOvernightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By textOvernightDuffle = By.xpath("//span[@class='base']");
    By quantity = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    By textAddedDuffle = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By linkShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By textQuantity3 = By.xpath("//input[@id='qty']");
    By textProductPrice = By.xpath("//td[@class='col subtotal']//span[@class='price']");
    By changeQuantity5 = By.xpath("(//input[@class='input-text qty'])[1]");
    By updateShoppingCartButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By textProductPrice225 =  By.xpath("(//span[@class='cart-price']//span)[2]");

    public void clickOnOvernightDuffle() {
        clickOnElement(nameOvernightDuffle);
    }

    public String getTextOvernightDuffle() {
        return getTextFromElement(textOvernightDuffle);
    }

    public void changeQuantity() {
        sendTextToElement(quantity, Keys.DELETE + "3");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String gettextaddedDuffle() {
        return getTextFromElement(textAddedDuffle);
    }

    public void clickOnShoppingCartLink(){
        clickOnElement(linkShoppingCart);
    }
    public String getTextQuantity3() {

        return getAttributeValue(textQuantity3,"value");
    }

    public String getTextProductPrice(){
        return getTextFromElement(textProductPrice);
    }

    public void changeQuantityTo5(){
        sendTextToElement(changeQuantity5, Keys.DELETE+"5");
    }

    public void clickOnUpdateShoppingCartButton(){
        clickOnElement(updateShoppingCartButton);
    }

    public String getTextProductPrice225() {
        return getTextFromElement(textProductPrice225);
    }
}
