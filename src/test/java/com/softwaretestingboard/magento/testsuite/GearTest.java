package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends TestBase {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart(){
        //Mouse Hover on Gear Menu
        homePage.mouseHoverOnGearMenu();
        //Click on Bags
        homePage.clickOnBagsTab();
        //Click on Product Name ‘Overnight Duffle'
        bagsPage.clickOnOvernightDuffle();
        // Verify the text ‘Overnight Duffle’
        Assert.assertEquals(bagsPage.getTextOvernightDuffle(),"Overnight Duffle", "Error");
        // Change Qty 3
        bagsPage.changeQuantity();
        // Click on ‘Add to Cart’ Button.
        bagsPage.clickOnAddToCartButton();
        // Verify the text‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(bagsPage.gettextaddedDuffle(),"You added Overnight Duffle to your shopping cart","Error");
        // Click on ‘shopping cart’ Link into message
        bagsPage.clickOnShoppingCartLink();
        // Verify the Qty is ‘3’
        Assert.assertEquals(bagsPage.getTextQuantity3(),"3","Error");
        // Verify the product price ‘$135.00’
        Assert.assertEquals(bagsPage.getTextProductPrice(),"$135.00","Error");
        // Change Qty to ‘5’
        bagsPage.changeQuantityTo5();
        // Click on ‘Update Shopping Cart’ button
        bagsPage.clickOnUpdateShoppingCartButton();
        // Verify the product price ‘$225.00
        Assert.assertEquals(bagsPage.getTextProductPrice225(),"$225.00","Error");
    }
}
