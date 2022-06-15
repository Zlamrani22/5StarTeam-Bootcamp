package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AuthenticationPage;
import pages.automationpractice.LoginPage;
import pages.automationpractice.SitemapPage;

public class TestSitemap extends CommonAPI {

    @Test(enabled = false)//check1
    public void testCheckManufacturers(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();
        sitemapPage.clickManufacturers();

        String expectedAccountPageTitle = "Manufacturers - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check2
    public void testCheckPriceDrop(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();
        sitemapPage.clickPriceDrop();

        String expectedAccountPageTitle = "Prices drop - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check3
    public void testCheckMyAddresses(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();
        sitemapPage.clickMyAddressesLink();

        String expectedAccountPageTitle = "Addresses - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check4
    public void testCheckNewProducts(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();
        sitemapPage.clickNewProducts();

        String expectedAccountPageTitle = "New products - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check5
    public void testCheckAllSpecials(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();
        sitemapPage.clickAllSpecials();

        String expectedAccountPageTitle = "Prices drop - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check6
    public void testCheckLegalNotice(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();
        sitemapPage.clickLegalNotice();

        String expectedAccountPageTitle = "Legal Notice - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check7
    public void testManagePersonalInformation(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();
        sitemapPage.clickPersonalInformation();

        String expectedAccountPageTitle = "Identity - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check8
    public void testAddSocialTitle(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();
        sitemapPage.clickPersonalInformation();
        sitemapPage.clickSocialTitleRadioButton();
        sitemapPage.typeCurrentPassword("tadefi2022");
        sitemapPage.clickSaveSubmitIdentity();

        String expectedAccountPageTitle = "Identity - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check9
    public void testSecurePayment(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();
        sitemapPage.clickSecurePaymentLink();

        String expectedAccountPageTitle = "Secure payment - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check10
    public void testFaceBook(){
        SitemapPage sitemapPage = new SitemapPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        loginPage.clickSitemap();
        sitemapPage.clickFacebookButton();

        String expectedAccountPageTitle = "Sitemap - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
}
