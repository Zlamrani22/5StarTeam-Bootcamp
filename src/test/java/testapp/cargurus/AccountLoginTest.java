package testapp.cargurus;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.AccountLoginPage;

public class AccountLoginTest extends CommonAPI {
    @Test
    public void loginTestOne(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void loginTestTwo(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai20");
        accountLoginPage.clickOnSignInBtn1();
        String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }


    @Test
    public void loginTestThree(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@out.com");
        String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void account(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
        String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        accountLoginPage.clickOnUserName();
        accountLoginPage.clickOnMyAccount();
        String expectedPageTitle1 = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle1, getPageTitle());


    }

    @Test
    public void savedSearch(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
        String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        accountLoginPage.clickOnUserName();
        accountLoginPage.clickOnSavedSearch();
        accountLoginPage.clickOnNewEscalade();
        String expectedPageTitleOne = "New Cadillac Escalade for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitleOne, getPageTitle());


    }
    @Test
    public void savedCars() {
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
        String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        accountLoginPage.clickOnUserName();
        accountLoginPage.clickOnSavedCars();
        accountLoginPage.clickOnStartANewSearch();
        String expectedPageTitleOne = "Used Cars for Sale Near Me - CarGurus";
        Assert.assertEquals(expectedPageTitleOne, getPageTitle());
    }
    @Test
    public void seeAllRecommendations() {
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
        String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        accountLoginPage.clickOnUserName();
        accountLoginPage.clickOnSavedCars();
        accountLoginPage.clickOnSeeAllRecommendations();
        String expectedPageTitleOne = "CarGurus - CarGurus";
        Assert.assertEquals(expectedPageTitleOne, getPageTitle());
    }
    @Test
    public void recommendedCars() {
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
        String expectedPageTitle = "Sign In or Register with CarGurus!";
       Assert.assertEquals(expectedPageTitle, getPageTitle());
        accountLoginPage.clickOnUserName();
        accountLoginPage.clickOnRecommendedCars();
       String expectedPageTitleOne = "";
       Assert.assertEquals(expectedPageTitleOne, getPageTitle());
    }
    @Test
    public void recentlyViewedCars() {
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
       String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        accountLoginPage.clickOnUserName();
        accountLoginPage.clickOnRecentlyViewedCars();
       String expectedPageTitleOne = "";
       Assert.assertEquals(expectedPageTitleOne, getPageTitle());
    }
    @Test
    public void messages() {
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
       String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        accountLoginPage.clickOnUserName();
        accountLoginPage.clickOnMessages();
        accountLoginPage.clickOnShopForSellByOwnerVehicles();
       String expectedPageTitleOne = "Cars For Sale By Owner For Sale Near Me - CarGurus";
        Assert.assertEquals(expectedPageTitleOne, getPageTitle());
    }
    @Test
    public void financing() {
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
       String expectedPageTitle = "Sign In or Register with CarGurus!";
       Assert.assertEquals(expectedPageTitle, getPageTitle());
        accountLoginPage.clickOnUserName();
        accountLoginPage.clickOnFinancing();
       String expectedPageTitleOne = "Financing - CarGurus";
        Assert.assertEquals(expectedPageTitleOne, getPageTitle());
    }
    @Test
    public void chooseCountry() {
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
        String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        accountLoginPage.clickOnUserName();
        accountLoginPage.clickOnChooseCountry();
        accountLoginPage.clickOnUnitedKingdom();
       String expectedPageTitleOne = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitleOne, getPageTitle());
    }
    @Test
    public void signOut() {
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
       String expectedPageTitle = "Sign In or Register with CarGurus!";
       Assert.assertEquals(expectedPageTitle, getPageTitle());
        accountLoginPage.clickOnUserName();
        accountLoginPage.clickOnSignOut();
        String expectedPageTitleOne = "";
        Assert.assertEquals(expectedPageTitleOne, getPageTitle());
    }
    @Test
    public void signInWithFacebook() {
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.clickOnSignInWithFacebook();
        String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void addReview() {
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
        accountLoginPage.clickOnAddACarReview();
        accountLoginPage.selectOptionFromSelectMake("Acura");
        accountLoginPage.selectOptionFromSelectModel("ILX");
        accountLoginPage.selectOptionFromSelectYear("2020");
        accountLoginPage.clickOnStartWriting();
    }
}
