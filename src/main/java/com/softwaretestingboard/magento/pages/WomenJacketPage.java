package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenJacketPage extends Utility {
    By filterProduct = By.id("sorter");
    By productSize = By.xpath("//img[starts-with(@class,'product-image-photo')]");
    By finalPrice = By.cssSelector("span[data-price-type='finalPrice']");
    By elementListDisplay = By.cssSelector(".products .product-item-info .product-item-name");
    public void selectFilterProductName(){
        selectByVisibleTextFromDropDown(filterProduct,"name");
    }
    public void selectFilterProductPrice(){
        selectByVisibleTextFromDropDown(filterProduct, "price");
    }
    public void verifyProductSize(){
        verifyProductSize(productSize);
    }
    public void verifyProductsNameInAlphabeticalOrder(){
        elementFilter(elementListDisplay);
    }
    public void verifyProductPriceLowToHigh(){
        verifyFinalPrice(finalPrice);
    }




}
