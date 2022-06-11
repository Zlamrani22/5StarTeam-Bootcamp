package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AuthenticationPage;
import pages.automationpractice.LoginPage;
import pages.automationpractice.SitemapPage;

public class TestLogin extends CommonAPI {

    @Test(enabled = false)//check1
    public void testCreateWishList() {
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickMyWishlistLink();
        loginPage.typeMyWishlistName("Zebra2");
        loginPage.clickSaveButton();

        String expectedAccountPageTitle = "My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }

    @Test(enabled = false)//check2
    public void testOrderHistory() {
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickOrderHistoryDetails();

        String expectedAccountPageTitle = "Order history - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }

    @Test(enabled = false)//check3
    public void testWriteAReview() {
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickWomen();
        loginPage.clickPrintedSummerDressMore();
        //loginPage.clickWriteAReview();

        String expectedAccountPageTitle = "Women - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }

    @Test(enabled = false)//check4
    public void testRegisterForNewsletter() {
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.typeNewsletterEmailInputField("tadefi_01@yahoo.fr");
        loginPage.clickNewsletterButton();

        String expectedAccountPageTitle = "My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());

//        String actualText = driver.findElement(By.xpath("//*[@id='columns']/p")).getText();
//        String expectedText = "Newsletter : You have successfully subscribed to this newsletter.";
//        Assert.assertEquals(actualText, expectedText);
    }
    @Test(enabled = false)//check5
    public void testCheckSignOutFunctionality() {
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSignOut();

        String expectedAccountPageTitle = "Login - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check6
    public void testVerifyAboutUsPage(){
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickAboutUsButton();

        String expectedAccountPageTitle = "About us - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check7
    public void testOUrStores(){
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickOurStores();

        String expectedAccountPageTitle = "Stores - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check8
    public void testCheckTermsAndConditions(){
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickTermsAndConditions();

        String expectedAccountPageTitle = "Terms and conditions of use - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check9
    public void testCheckSitemap(){
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();

        String expectedAccountPageTitle = "Sitemap - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check10
    public void testCheckSuppliers(){
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();
        sitemapPage.clickSuppliers();

        String expectedAccountPageTitle = "Suppliers - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
}