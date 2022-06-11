package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.*;

public class TestHomePage extends CommonAPI {

    @Test(enabled = false)//check1
    public void testVerifySignInFunctionality(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.clickSignIn();

        String expectedPageTitle = "Login - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check2
    public void testSearchFunctionality(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.typeSearchInputField("shoes");
        homePage.clickSearchButton();

        String expectedPageTitle = "Search - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check3
    public void testSearchInvalidClothingItem() {
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.typeSearchInputField("Jeans");
        homePage.clickSearchButton();

        String expectedPageTitle = "Search - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
    @Test(enabled = false)//check4
    public void testBestSellers() {
        HomePage homePage = new HomePage(getDriver());
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        homePage.clickBestSellers();
        homePage.clickSunglassesAndEyewear();

        String expectedPageTitle = "Create and build your online business with PrestaShop";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check5
    public void testSummerCollection() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSummerCollection();
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        prestaShopPage.clickCreateMyStore();

        String expectedPrestaShopePageTitle = "Download PrestaShop and develop your online business";
        Assert.assertEquals(expectedPrestaShopePageTitle, getPageTitle());
    }

}
