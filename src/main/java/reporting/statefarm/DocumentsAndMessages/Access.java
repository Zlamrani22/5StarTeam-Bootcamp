package reporting.statefarm.DocumentsAndMessages;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.AccessPage;
import pages.statefarm.LoginPage;

public class Access extends CommonAPI {


    @Test
    public void accessDocuments() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnLogInButton();
        loginPage.typeUserName("Aksel1506");
        loginPage.typePassword("TestCase@java0");
        loginPage.clickLoginButtonSecond();
        waitFor(3);
        String expectedPageTitle = "Log In";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(3);
        AccessPage accessPage = new AccessPage(getDriver());
        accessPage.selectFromDropdown("documents");
        String expectedPageTitle1 = "Document Center";
        Assert.assertEquals(expectedPageTitle1, getPageTitle());
    }
    @Test
    public void accessMessages() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnLogInButton();
        loginPage.typeUserName("Aksel1506");
        loginPage.typePassword("TestCase@java0");
        loginPage.clickLoginButtonSecond();
        waitFor(3);
        String expectedPageTitle = "Log In";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(3);
        AccessPage accessPage = new AccessPage(getDriver());
        accessPage.selectFromDropdown("Messages");
        String expectedPageTitle2 = "State Farm Secure Mailbox Sign-in";
        Assert.assertEquals(expectedPageTitle2, getPageTitle());
        accessPage.clickOnContinueBtn();

       }
    }
