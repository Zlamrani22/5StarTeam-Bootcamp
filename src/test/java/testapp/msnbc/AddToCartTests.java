package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.HomePage;
import pages.msnbc.StorePage;

public class AddToCartTests extends CommonAPI {

    @Test
    public void addItemsToCart(){
        HomePage homePage= new HomePage(getDriver());
        StorePage storePage= new StorePage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectStoreOptionFromMenu();
        storePage.selectLogoMug();
        storePage.addToCartBtn();
        storePage.checkoutBtn();
        waitFor(1);
        String pageTitle= "Information - NBC Store - Checkout";
        Assert.assertEquals(pageTitle,getPageTitle());
    }
}
