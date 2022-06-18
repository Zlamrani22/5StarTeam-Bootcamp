package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AutomationHomePage;
import pages.automationpractice.PrestaShopPage;
import pages.automationpractice.ShoppingCartPage;
import pages.automationpractice.WomensCoatsAndJacketsPage;

import java.util.Iterator;
import java.util.Set;

public class TestShoppingCart extends CommonAPI {

    @Test(enabled = true) //check1
    public void testAddItemsToCartProceedToCheckOut() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickCartButton();
        shoppingCartPage.hoverOverDressesButton();
        shoppingCartPage.clickCasualDressesButton();
        shoppingCartPage.clickGirlyStyleCheckBox();
        shoppingCartPage.clickPrintedDressGirlySytle();
        shoppingCartPage.clickAddToCartButton();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        shoppingCartPage.clickProceedToCheckout();
        Assert.assertEquals("Order - My Store", getPageTitle());
    }
    @Test(enabled = true)//check2
    public void testContactPrestaShopSupport() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        WomensCoatsAndJacketsPage womensCoatsAndJacketsPage = new WomensCoatsAndJacketsPage(getDriver());
        automationHomePage.clickWomensCoatsAndJacketsButton();
        prestaShopPage.clickSupportLink();
        Assert.assertEquals("PrestaShop Support", getPageTitle());
    }
    @Test(enabled = true)//check3
    public void testProcessShoppingCart() {
        AutomationHomePage homepage = new AutomationHomePage(getDriver());
        homepage.clickCartButton();

        String expectedPageTitle = "Order - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
