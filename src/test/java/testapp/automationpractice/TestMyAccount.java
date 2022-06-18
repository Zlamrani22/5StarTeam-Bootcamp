package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.*;
import pages.msnbc.HomePage;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class TestMyAccount extends CommonAPI {

    @Test(enabled = false)//check1
    public void testDeleteMyAddress() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        automationHomePage.clickSignIn();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.clickMyAddresses();
        myAccountPage.clickDelete();
        getDriver().switchTo().alert().dismiss();
        Assert.assertEquals("Addresses - My Store", getPageTitle());
    }

    @Test(enabled = false)//check2
    public void testSearchMultipleItems() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        automationHomePage.clickSignIn();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir + "/src/test/resources/TestData.xlsx");
        List<String> items = excelReader.getEntireColumnForGivenHeader("searchMultipleItems", "item");
        for (String item : items) {
            myAccountPage.searchElementAndEnter(item);
            myAccountPage.clearSearchInputField();
        }
        Assert.assertEquals("My account - My Store", getPageTitle());
    }
    @Test(enabled = false)//check3
    public void testWriteAReview() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        automationHomePage.clickSignIn();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.searchElementAndEnter("white dresses");
        myAccountPage.clickSearchButton();
        myAccountPage.clickListButton();
        myAccountPage.clickWhiteColorPrintedSummerDress();
        myAccountPage.clickWriteAReview();
        Assert.assertEquals("Printed Summer Dress - My Store", getPageTitle());
    }
    @Test(enabled = false)//check4
    public void testPrintASelectedItem() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        automationHomePage.clickSignIn();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.searchElementAndEnter("hats");
        myAccountPage.clickSearchButton();
        myAccountPage.clickListButton();
        myAccountPage.clickBlueColorCheckBox();
        myAccountPage.clickPrintButton();
        Assert.assertEquals("Printed Summer Dress - My Store", getPageTitle());
    }
    @Test(enabled = false)//check5
    public void testDisplayAllPictures() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        automationHomePage.clickSignIn();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.searchElementAndEnter("hats");
        myAccountPage.clickSearchButton();
        myAccountPage.clickListButton();
        myAccountPage.clickWhiteColorBlouse();
        myAccountPage.clickDisplayAllPicturesLink();
        Assert.assertEquals("Blouse - My Store", getPageTitle());
    }
    @Test(enabled = false)//check6
    public void testDeleteAWishlist() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        automationHomePage.clickSignIn();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
        myAccountPage.clickMyWishlist();
        MyWishlistPage myWishlistPage = new MyWishlistPage(getDriver());
        myWishlistPage.clickRemoveIcon();
        getDriver().switchTo().alert().dismiss();
        Assert.assertEquals("My Store", getPageTitle());
    }
}