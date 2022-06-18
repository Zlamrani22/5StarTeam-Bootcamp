package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AuthenticationPage;
import pages.automationpractice.AutomationHomePage;
import pages.automationpractice.MyAccountPage;
import pages.automationpractice.MyWishlistPage;

public class TestMyWishlist extends CommonAPI {

    @Test(enabled = true)//check1
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
    @Test(enabled = true)//check2
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
        Assert.assertEquals("My account - My Store", getPageTitle());
    }
    @Test(enabled = true)//check4
    public void testGoBackToHomePage() {
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
        myWishlistPage.clickRemoveIcon();
        getDriver().switchTo().alert().dismiss();
        myWishlistPage.clickHome();
        Assert.assertEquals("My Store", getPageTitle());
    }
    }
