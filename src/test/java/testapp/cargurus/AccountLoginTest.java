package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.AccountLoginPage;

public class AccountLoginTest extends CommonAPI {
    @Test
    public void loginTest1(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai2014$");
        accountLoginPage.clickOnSignInBtn1();
        waitFor(5);
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void loginTest2(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@outlook.com");
        accountLoginPage.clickOnNextBox();
        accountLoginPage.typeUserPassword("13Mai20");
        accountLoginPage.clickOnSignInBtn1();
        waitFor(5);
        String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }


    @Test
    public void loginTest3(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(getDriver());
        accountLoginPage.clickOnSignInBtn();
        accountLoginPage.typeUserEmail("larimus1987@out.com");
        String expectedPageTitle = "Sign In or Register with CarGurus!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }



}
