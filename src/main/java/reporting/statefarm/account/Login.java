package reporting.statefarm.account;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.LoginPage;

public class Login extends CommonAPI {

    @Test
    public void loginWithValidCredentials(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnLogInButton();
        loginPage.typeUserName("Aksel1506");
        loginPage.typePassword("TestCase@java10");
        loginPage.clickLoginButtonSecond();
        String expectedPageTitle = "Log In";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }


    @Test
    public void loginInvalidCredentials(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnLogInButton();
        loginPage.typeUserName("Aksel1506");
        loginPage.typePassword("Test@java");
        loginPage.clickLoginButtonSecond();
        String expectedPageTitle = "Log In";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

}



