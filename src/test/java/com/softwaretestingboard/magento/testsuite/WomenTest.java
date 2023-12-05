package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenJacketPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

public class WomenTest extends TestBase {
    HomePage homePage = new HomePage();
    WomenJacketPage womenJacketPage = new WomenJacketPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
        homePage.mouseHoverOnMenMenu(); //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenTopTab();//Mouse Hover on Tops
        homePage.clickOnWomenJacketTab();//Click on Jackets
        womenJacketPage.selectFilterProductName(); // Select Sort by filter product name
        womenJacketPage.verifyProductSize();
        womenJacketPage.verifyProductsNameInAlphabeticalOrder();//Verify the products name display
    }
    @Test
    public void verifyTheSortByPriceFilter(){
        homePage.mouseHoverOnMenMenu(); //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenTopTab();//Mouse Hover on Tops
        homePage.clickOnWomenJacketTab();//Click on Jackets
        womenJacketPage.selectFilterProductPrice(); // Select Sort by filter product price
        womenJacketPage.verifyProductPriceLowToHigh();
    }
}
