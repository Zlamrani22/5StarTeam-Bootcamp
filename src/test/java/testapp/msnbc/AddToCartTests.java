package testapp.msnbc;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.AddToCartStorePage;
import pages.msnbc.HomePage;

public class AddToCartTests extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AddToCartTests.class);

    //@Test
    public void addItemsToCart(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage = new AddToCartStorePage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectStoreOptionFromMenu();
        addToCartStorePage.selectLogoMug();
        String text= "MSNBC Logo Mug | NBC Store";
        Assert.assertEquals(text,getPageTitle());
        addToCartStorePage.addToCartBtn();
        Assert.assertTrue(addToCartStorePage.checkoutPageLogoDisplayed());
        addToCartStorePage.checkoutBtn();
        waitFor(1);
        String pageTitle= "Information - NBC Store - Checkout";
        Assert.assertEquals(pageTitle,getPageTitle());
    }

    @Test
    public void addMultipleItemsToCart(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage = new AddToCartStorePage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectStoreOptionFromMenu();
        addToCartStorePage.selectLogoMug();
        String text= "MSNBC Logo Mug | NBC Store";
        Assert.assertEquals(text,getPageTitle());
        addToCartStorePage.addToCartBtn();
        Assert.assertTrue(addToCartStorePage.checkoutPageLogoDisplayed());
        navigateBack();
        addToCartStorePage.clickRachelMaddowLogoTee();
        navigateBack();
    }
}
