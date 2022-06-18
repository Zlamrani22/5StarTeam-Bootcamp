
//package testapp.automationpractice;
//
//import base.CommonAPI;
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.automationpractice.HomePage;
//import pages.automationpractice.ShoppingCartPage;
//import pages.automationpractice.WomensCoatsAndJacketsPage;
//
//public class TestShoppingCart extends CommonAPI {
//
//    //@Test(enabled = false) //failed
//    public void testAddItemsToCart() {
//        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//        shoppingCartPage.hoverOverDressesButton();
//        shoppingCartPage.clickCasualDressesButton();
//        shoppingCartPage.checkSmallCheckBox();
//        shoppingCartPage.clickPrintedDressButton();
//        shoppingCartPage.clickAddToCartButton();
//
////        String actualMessage = driver.findElement(By.xpath("//*[text()[contains(.,'Product successfully added to your shopping cart')]]")).getText();
////        String expectedMessage = "Product successfully added to your shopping cart";
////        Assert.assertEquals(actualMessage, expectedMessage);
//    }
//    //@Test(enabled = false)//failed
//    public void testAddToWishListWithoutLoggingIn() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickWomensCoatsAndJacketsButton();
//        WomensCoatsAndJacketsPage womensCoatsAndJacketsPage = new WomensCoatsAndJacketsPage(getDriver());
//        womensCoatsAndJacketsPage.clickPrintedDressButton();
//        womensCoatsAndJacketsPage.clickWishlistButton();
//
//        String actualErrorMessage = driver.findElement(By.xpath("//p[@class='fancybox-error']")).getText();
//        String expectedErrorMessage = "You must be logged in to manage your wishlist.";
//        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
//    }
//   // @Test(enabled = false)//check
//    public void testProcessShoppingCart() {
//        HomePage homepage = new HomePage(getDriver());
//        homepage.clickCartButton();
//
//        String expectedPageTitle = "Order - My Store";
//        Assert.assertEquals(expectedPageTitle, getPageTitle());
//    }
//}

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

    @Test(enabled = false) //check1
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
    @Test(enabled = false)//check2
    public void testContactPrestaShopSupport() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        WomensCoatsAndJacketsPage womensCoatsAndJacketsPage = new WomensCoatsAndJacketsPage(getDriver());
        automationHomePage.clickWomensCoatsAndJacketsButton();
        prestaShopPage.clickSupportLink();
        Assert.assertEquals("PrestaShop Support", getPageTitle());
    }
    @Test(enabled = false)//check3
    public void testProcessShoppingCart() {
        AutomationHomePage homepage = new AutomationHomePage(getDriver());
        homepage.clickCartButton();

        String expectedPageTitle = "Order - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}

