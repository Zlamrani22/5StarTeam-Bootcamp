package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.*;

import java.util.Set;

public class TestAutomationHomePage extends CommonAPI {

    @Test(enabled = false)//check1
    public void testWebsiteLogo() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.typeSearchInputField("gloves");
        automationHomePage.clickSearchButton();
        automationHomePage.clickYourLogoLogo();

        String expectedPageTitle = "My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check2
    public void testVerifySignInFunctionality(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        automationHomePage.clickSignIn();

        String expectedPageTitle = "Login - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check3
    public void testSearchFunctionality(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        automationHomePage.typeSearchInputField("shoes");
        automationHomePage.clickSearchButton();

        String expectedPageTitle = "Search - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check4
    public void testSearchInvalidClothingItem() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        automationHomePage.typeSearchInputField("Jeans");
        automationHomePage.clickSearchButton();

        String expectedPageTitle = "Search - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
    @Test(enabled = false)//check5
    public void testBestSellers() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        automationHomePage.clickBestSellers();
        automationHomePage.clickSunglassesAndEyewear();

        String expectedPageTitle = "Create and build your online business with PrestaShop";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check6
    public void testSummerCollection() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickSummerCollection();
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        prestaShopPage.clickCreateMyStore();

        String expectedPageTitle = "Download PrestaShop and develop your online business";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check7
    public void testSendToAFriend() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickTShirts();
        automationHomePage.clickFadedShortSleeveTShirts();
        automationHomePage.clickBlueColor();
        automationHomePage.clickSendToAFriend();

        String expectedPageTitle = "Faded Short Sleeve T-shirts - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check8
    public void testSendToARealFriendRoman() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickTShirts();
        automationHomePage.clickFadedShortSleeveTShirts();
        automationHomePage.clickBlueColor();
        automationHomePage.clickSendToAFriend();
        String parentWindowHandle = getDriver().getWindowHandle();
        System.out.println("Parent window handle: " + parentWindowHandle);
        Set<String> windowHandles = getDriver().getWindowHandles();
        for(String handle: windowHandles){
            if(!handle.equals(parentWindowHandle)){
                getDriver().switchTo().window(handle);
                waitFor(10);
                System.out.println("New window title: " + getDriver().getTitle());
            }
        }
        automationHomePage.typeNameOfYourFriend("Roman");
        automationHomePage.typeFriendEmailAddress("romang@gmail.com");
        automationHomePage.clickSendEmail();
        String expectedPageTitle = "Faded Short Sleeve T-shirts - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check9
    public void testDelivery() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickTShirts();
        automationHomePage.clickDeliveryLink();
        Assert.assertEquals("Delivery - My Store", getPageTitle());
    }
    @Test(enabled = false)//check10
    public void testSendAnEmailToSupport() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickTShirts();
        automationHomePage.clickSupportEmail();
        Assert.assertEquals("T-shirts - My Store", getPageTitle());
    }
}
