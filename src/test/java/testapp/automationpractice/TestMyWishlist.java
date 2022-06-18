package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AuthenticationPage;
import pages.automationpractice.AutomationHomePage;
import pages.automationpractice.MyAccountPage;
import pages.automationpractice.MyWishlistPage;

public class TestMyWishlist extends CommonAPI {

    @Test(enabled = false)//check1
    public void testAddNewWishlist() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        MyWishlistPage myWishlistPage = new MyWishlistPage(getDriver());
        automationHomePage.clickSignIn();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.clickMyWishlist();
        myWishlistPage.typeNewWishlistName("Whispers");
        myWishlistPage.clickSave();
        Assert.assertEquals("My Store", getPageTitle());
    }
    @Test(enabled = false)//check2
    public void testBackToYourAccount() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        MyWishlistPage myWishlistPage = new MyWishlistPage(getDriver());
        automationHomePage.clickSignIn();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.clickMyWishlist();
        myWishlistPage.clickBackToYouAccount();
        Assert.assertEquals("My account - My Store", getPageTitle());
    }
    @Test(enabled = true)//check3
    public void testAddItemsToWishlist() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        MyWishlistPage myWishlistPage = new MyWishlistPage(getDriver());
        automationHomePage.clickSignIn();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.searchElementAndEnter("green dress");
        myAccountPage.clickSearchButton();
        myAccountPage.clickListButton();
        myWishlistPage.clickPrintedChiffonDress();
        myWishlistPage.clickAddToWishlist();
//        getDriver().switchTo().alert().dismiss();
        Assert.assertEquals("My account - My Store", getPageTitle());
    }

}
