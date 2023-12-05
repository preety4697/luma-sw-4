package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPantPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends TestBase {
    HomePage homePage = new HomePage();
    MenPantPage menPantPage = new MenPantPage();

    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart(){
        //Mouse Hover on Men Menu
        homePage.mouseHoverOnMenMenu();
        // Mouse Hover on Bottoms
        homePage.mouseHoverOnMenBottomTab();
        //Click on Pants
        homePage.clickOnMenPantsTab();
        //Mouse Hover on product name
        //‘Cronus Yoga Pant’ and click on size 32
        menPantPage.hoverAndClickProduct();
        //Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
        menPantPage.hoverAndClickProductColour();
       // Mouse Hover on product name‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        menPantPage.hoverAndClickOnAddToCartButton();
        //Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(menPantPage.getTextAddedPantToShoppingCart(),"You added Cronus Yoga Pant to your shopping cart.","Error");
        //Click on ‘shopping cart’ Link into message
        menPantPage.clickOnShoppingCart();
        //Verify the text ‘Shopping Cart.’
        Assert.assertEquals(menPantPage.getTextShoppingCart(),"Shopping Cart","Error");
        //Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(menPantPage.getTextCronusYogaPant(),"Cronus Yoga Pant","Error");
        //Verify the product size ‘32’
        Assert.assertEquals(menPantPage.getTextSize32(),"32","Error");
        //Verify the product colour ‘Black’
        Assert.assertEquals(menPantPage.getTextBlack(),"Black","Error");                         //* Verify the product colour
    }



}
