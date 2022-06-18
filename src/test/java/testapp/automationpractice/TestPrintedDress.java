package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AutomationHomePage;
import pages.automationpractice.PrintedDressPage;
import pages.automationpractice.ShoppingCartPage;
import pages.automationpractice.WomenPage;

import java.util.Iterator;
import java.util.Set;

public class TestPrintedDress extends CommonAPI {

    @Test(enabled = true)//check1
    public void testAddToCartBackToContinueShopping() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        PrintedDressPage printedDressPage = new PrintedDressPage(getDriver());
        automationHomePage.clickWomenLink();
        womenPage.clickList();
        womenPage.selectSmallCheckBox();
        womenPage.selectBlueColorLink();
        womenPage.clickFashionManufacturerCheckBox();
        womenPage.clickAddToCartButton();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        System.out.println("Successfully switched to child window" + childWindow);
        waitFor(5);
        String expectedPageTitle = "Women > Size S > Color Blue > Manufacturer Fashion Manufacturer - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        printedDressPage.clickContinueShopping();
    }
    @Test(enabled = true)//check2
    public void testAddThenDeleteAnItemFromShoppingCart() {
        AutomationHomePage homepage = new AutomationHomePage(getDriver());
        PrintedDressPage printedDressPage = new PrintedDressPage(getDriver());
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        homepage.clickPrintedDress();
        printedDressPage.clickPinkColorCheckBox();
        printedDressPage.clickAddToCart();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        printedDressPage.clickContinueShopping();
        printedDressPage.clickContinueShopping();
        Assert.assertEquals("Printed Dress - My Store", getPageTitle());
        printedDressPage.clickShoppingCart();
        shoppingCartPage.clickTrashIcon();

        String expectedPageTitle = "Order - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

}
