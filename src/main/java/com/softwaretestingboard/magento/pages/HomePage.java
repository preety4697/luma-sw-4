package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenTab = By.xpath("//span[normalize-space()='Women']");
    By topsInWomenTab = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacketInTopTab = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By menTab = By.xpath("//span[normalize-space()='Men']");
    By bottomInMenTab = By.xpath("//a[@id='ui-id-18']");
    By pantsInBottomTab = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearTab = By.xpath("//span[normalize-space()='Gear']");
    By bagsInGearTab = By.xpath("//span[normalize-space()='Bags']");

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenTab);
    }

    public void mouseHoverOnWomenTopTab() {
        mouseHoverToElement(topsInWomenTab);
    }

    public void clickOnWomenJacketTab() {
        clickOnElement(jacketInTopTab);
    }

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menTab);
    }

    public void mouseHoverOnMenBottomTab() {
        mouseHoverToElement(bottomInMenTab);
    }

    public void clickOnMenPantsTab() {
        clickOnElement(pantsInBottomTab);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearTab);
    }

    public void clickOnBagsTab() {
        clickOnElement(bagsInGearTab);
    }
}




