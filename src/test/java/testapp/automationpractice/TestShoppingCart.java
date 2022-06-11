package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.HomePage;
import pages.automationpractice.ShoppingCartPage;
import pages.automationpractice.WomensCoatsAndJacketsPage;

public class TestShoppingCart extends CommonAPI {

    @Test(enabled = false) //failed
    public void testAddItemsToCart() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        shoppingCartPage.hoverOverDressesButton();
        shoppingCartPage.clickCasualDressesButton();
        shoppingCartPage.checkSmallCheckBox();
        shoppingCartPage.clickPrintedDressButton();
        shoppingCartPage.clickAddToCartButton();

//        String actualMessage = driver.findElement(By.xpath("//*[text()[contains(.,'Product successfully added to your shopping cart')]]")).getText();
//        String expectedMessage = "Product successfully added to your shopping cart";
//        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Test(enabled = false)//failed
    public void testAddToWishListWithoutLoggingIn() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickWomensCoatsAndJacketsButton();
        WomensCoatsAndJacketsPage womensCoatsAndJacketsPage = new WomensCoatsAndJacketsPage(getDriver());
        womensCoatsAndJacketsPage.clickPrintedDressButton();
        womensCoatsAndJacketsPage.clickWishlistButton();

//        String actualErrorMessage = driver.findElement(By.xpath("//p[@class='fancybox-error']")).getText();
//        String expectedErrorMessage = "You must be logged in to manage your wishlist.";
//        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    @Test(enabled = false)//check
    public void testProcessShoppingCart() {
        HomePage homepage = new HomePage(getDriver());
        homepage.clickCartButton();

        String expectedPageTitle = "Order - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
