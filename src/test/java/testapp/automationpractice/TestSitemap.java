package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AuthenticationPage;
import pages.automationpractice.LoginPage;
import pages.automationpractice.SitemapPage;

public class TestSitemap extends CommonAPI {

    @Test(enabled = true)//check1
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

        String expectedPageTitle = "Manufacturers - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check2
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

        String expectedPageTitle = "Prices drop - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check3
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

        String expectedPageTitle = "Addresses - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check4
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

        String expectedPageTitle = "New products - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check5
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

        String expectedPageTitle = "Prices drop - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check6
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

        String expectedPageTitle = "Legal Notice - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check7
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

        String expectedPageTitle = "Identity - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check8
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

        String expectedPageTitle = "Identity - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check9
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

        String expectedPageTitle = "Secure payment - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = true)//check10
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

        String expectedPageTitle = "Sitemap - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
