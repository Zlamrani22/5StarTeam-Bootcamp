package testapp.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AuthenticationPage;
import pages.automationpractice.AutomationHomePage;
import pages.automationpractice.ForgotPasswordPage;

public class TestAuthentication extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestAuthentication.class);

    @Test(enabled = false)//check1
    public void testAuthenticateWithValidCredentials() {
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();
        String expectedAccountPageTitle = "My account - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check2
    public void testForgotPassword() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.clickForgotPasswordLink();
        Assert.assertEquals("Forgot your password - My Store", getPageTitle());
        forgotPasswordPage.clickBackToLogin();
        Assert.assertEquals("Login - My Store", getPageTitle());
    }
    @Test(enabled = false)//check3
    public void testRetrievePassword() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.clickForgotPasswordLink();
        Assert.assertEquals("Forgot your password - My Store", getPageTitle());
        forgotPasswordPage.typeEmailAddress("tadefi_01@yahoo.fr");
        forgotPasswordPage.clickRetrievePassword();
        String actualText = getDriver().findElement(By.cssSelector("p[class='alert alert-success']")).getText();
        String expectedText = "A confirmation email has been sent to your address: tadefi_01@yahoo.fr";
        Assert.assertEquals(expectedText, actualText);
    }
    @Test(enabled = false)//check4
    public void testCreateAnAccountWithExistingEmail(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailToCreateAnAccount("tadefi_01@yahoo.fr");
        authenticationPage.clickCreateAnAccount();
        String expectedText = "";
        String actualText = getDriver().findElement(By.xpath("//*[@id='create_account_error']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test(enabled = false)//check5
    public void testCreateNewAccount(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        automationHomePage.clickSignIn();
        Assert.assertEquals("Login - My Store", getPageTitle());
        authenticationPage.typeEmailToCreateAnAccount("tadefi_01@yahoo.fr");
        authenticationPage.clickCreateAnAccount();
        authenticationPage.clickMrsRadioButton();
        authenticationPage.typeFirstName("Zina");
        authenticationPage.typeLastName("Belle");
        authenticationPage.typeNewAccountPassword("zinabelle");
        authenticationPage.selectDateOfBirthDay("5");
        authenticationPage.selectDateOfBirthMonth("9");
        authenticationPage.selectDateOfBirthYear("2006");
        authenticationPage.clickNewsletterCheckBox();
        authenticationPage.typeStreetAddress("65 Crescent Drive");
        authenticationPage.typeCity("Pleasant Hill");
        authenticationPage.selectState("California");
        authenticationPage.typeZipCode("94523");
        authenticationPage.typeMobilePhoneNumber("9252788415");
        authenticationPage.clickRegisterButton();
        Assert.assertEquals("My account - My Store", getPageTitle());
    }
}
