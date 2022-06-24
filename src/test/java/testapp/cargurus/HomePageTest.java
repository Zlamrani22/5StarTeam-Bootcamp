package testapp.cargurus;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.AccountLoginPage;
import pages.cargurus.HomePage;

import java.util.Iterator;
import java.util.Set;

public class HomePageTest extends CommonAPI {

    @Test

    public void logoValidation(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnLogo();
        Assert.assertTrue(homePage.checkLogoIsPresent());
    }

   @Test
    public void advertise() {
       HomePage homePage = new HomePage(getDriver());
       homePage.clickOnAdvertise();
       String expectedPageTitle = "Dealer Resource Center";
       Assert.assertEquals(expectedPageTitle, getPageTitle());
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
       js.executeScript("window.scrollBy(0,3000)", "");
       homePage.clickOnContactSupport();
       String expectedPageTitleOne = "Dealer Support Request - CarGurus";
       Assert.assertEquals(expectedPageTitleOne, getPageTitle());
       homePage.clickOnContactCarGurusHere();
       String expectedPageTitleTwo = "Contact Us - CarGurus";
       Assert.assertEquals(expectedPageTitleTwo, getPageTitle());

   }



       @Test
       public void welcomeMessageValidation(){

           HomePage homePage = new HomePage(getDriver());
           homePage.clickOnSignInBtn();
           homePage.typeUserEmail("larimus1987@outlook.com");
           homePage.clickOnNextBox();
           homePage.typeUserPassword("13Mai2014$");
           homePage.clickOnSignInBtn1();
           homePage.clickOnWelcomeMessage();
           Assert.assertTrue(homePage.checkWelcomeMessageIsPresent());
    }

  @Test
    public void sellMyCarByLicensePlate() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSignInBtn();
        homePage.typeUserEmail("larimus1987@outlook.com");
        homePage.clickOnNextBox();
        homePage.typeUserPassword("13Mai2014$");
        homePage.clickOnSignInBtn1();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,4000)", "");
        homePage.clickOnLicensePlate();
        homePage.typeLicensePlate("063nsf");
        homePage.selectOptionFromState("KS");
        homePage.clickOnGetYourOffer();
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
    @Test
    public void sellMyCarByVin() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSignInBtn();
        homePage.typeUserEmail("larimus1987@outlook.com");
        homePage.clickOnNextBox();
        homePage.typeUserPassword("13Mai2014$");
        homePage.clickOnSignInBtn1();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,4000)", "");
        homePage.clickOnVin();
        homePage.typeEnterYourVin("5XYZU3LB5EG203901");
        homePage.clickOnGetYourOffer();
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
  @Test
    public void AdventureAndOffRoads() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSignInBtn();
        homePage.typeUserEmail("larimus1987@outlook.com");
        homePage.clickOnNextBox();
        homePage.typeUserPassword("13Mai2014$");
        homePage.clickOnSignInBtn1();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,4000)", "");
        homePage.clickOnAdventureAndOffRoads();
        String text = homePage.gertHeaderTextOne();
        Assert.assertEquals("4X4 trucks for sale nationwide", text);

    }
   @Test
    public void downloadCarGurusApp() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSignInBtn();
        homePage.typeUserEmail("larimus1987@outlook.com");
        homePage.clickOnNextBox();
        homePage.typeUserPassword("13Mai2014$");
        homePage.clickOnSignInBtn1();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,6000)", "");
        homePage.clickOnDownloadCarGurusApp();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        String text = homePage.gertHeaderText();
        Assert.assertEquals("Screenshots", text);
    }

    @Test
    public void ourTeam() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSignInBtn();
        homePage.typeUserEmail("larimus1987@outlook.com");
        homePage.clickOnNextBox();
        homePage.typeUserPassword("13Mai2014$");
        homePage.clickOnSignInBtn1();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,6000)", "");
        homePage.clickOnOurTeam();
        String expectedPageTitle = "CarGurus.com: Find and share automotive knowledge - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        homePage.clickOnCarrier();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while(iterator.hasNext()){
            childWindow = iterator.next();}
        getDriver().switchTo().window(childWindow);
        homePage.clickOnSeeOpenRoles();
        String text = homePage.gertHeaderTextTwo();
        Assert.assertEquals("Job Search Results", text);
    }

    @Test
    public void carGurusYoutubePage () {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSignInBtn();
        homePage.typeUserEmail("larimus1987@outlook.com");
        homePage.clickOnNextBox();
        homePage.typeUserPassword("13Mai2014$");
        homePage.clickOnSignInBtn1();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,6000)", "");
        waitFor(4);
        homePage.clickOnYoutubePage();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while(iterator.hasNext()){
            childWindow = iterator.next();}
        getDriver().switchTo().window(childWindow);
        homePage.clickOnSubscribe();

    }
    @Test
    public void carGurusPrivacy () {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSignInBtn();
        homePage.typeUserEmail("larimus1987@outlook.com");
        homePage.clickOnNextBox();
        homePage.typeUserPassword("13Mai2014$");
        homePage.clickOnSignInBtn1();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,6000)", "");
        homePage.clickOnPrivacy();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while(iterator.hasNext()){
            childWindow = iterator.next();}
        getDriver().switchTo().window(childWindow);
        JavascriptExecutor jsOne = (JavascriptExecutor) getDriver();
        jsOne.executeScript("window.scrollBy(0,3000)", "");
        JavascriptExecutor jsTwo = (JavascriptExecutor) getDriver();
        jsTwo.executeScript("window.scrollBy(0,6000)", "");


    }

    @Test
    public void carGurusSecurity () {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSignInBtn();
        homePage.typeUserEmail("larimus1987@outlook.com");
        homePage.clickOnNextBox();
        homePage.typeUserPassword("13Mai2014$");
        homePage.clickOnSignInBtn1();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,6000)", "");
        homePage.clickOnSecurity();
    }
    @Test
    public void checkMyGarageIsEmpty(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSignInBtn();
        homePage.typeUserEmail("larimus1987@outlook.com");
        homePage.clickOnNextBox();
        homePage.typeUserPassword("13Mai2014$");
        homePage.clickOnSignInBtn1();
        String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        homePage.clickOnUserName();
        homePage.clickOnMyAccount();
        String text = homePage.gertHeaderTextThree();
        Assert.assertEquals("Account settings", text);
        homePage.clickOnMyGarage();
        String text1 = homePage.gertHeaderTextFour();
        Assert.assertEquals("Your garage is empty.", text1);
}


}
