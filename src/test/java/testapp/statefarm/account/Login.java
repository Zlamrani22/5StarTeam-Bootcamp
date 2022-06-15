package testapp.statefarm.account;

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
        loginPage.typePassword("TestCase@java$");
        loginPage.clickLoginButtonSecond();
        waitFor(3);
        String expectedPageTitle = "Log In";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(3);


    }
    @Test
    public void loginInvalidCredentials(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnLogInButton();
        loginPage.typeUserName("Aksel1506");
        loginPage.typePassword("Test@java");
        loginPage.clickLoginButtonSecond();
        waitFor(3);
        String expectedPageTitle = "Log In";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

}



