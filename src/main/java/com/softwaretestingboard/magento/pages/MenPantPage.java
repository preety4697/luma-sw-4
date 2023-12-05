package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPantPage extends Utility {
    By productName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("(//div[@class='swatch-option text'])[1]");
    By colourBlack = By.xpath("(//div[@class='swatch-option color'])[1]");
    By addToCartButton = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By addedPant = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By linkShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By textShoppingCart = By.xpath("//span[@class='base']");
    By textCronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By textSize32 = By.xpath("//dd[contains(text(),'32')]");
    By textBlack = By.xpath("//dd[contains(text(),'Black')]");

    public void hoverAndClickProduct() {
        mouseHoverToElement(productName);
        mouseHoverToElement(size32);
    }

    public void hoverAndClickProductColour() {
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(colourBlack);
    }

    public void hoverAndClickOnAddToCartButton() {
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getTextAddedPantToShoppingCart() {
        return getTextFromElement(addedPant);
    }

    public void clickOnShoppingCart() {
        clickOnElement(linkShoppingCart);
    }

    public String getTextShoppingCart() {
        return getTextFromElement(textShoppingCart);
    }

    public String getTextCronusYogaPant() {
        return getTextFromElement(textCronusYogaPant);
    }

    public String getTextSize32() {
        return getTextFromElement(textSize32);
    }

    public String getTextBlack() {
        return getTextFromElement(textBlack);
    }
}