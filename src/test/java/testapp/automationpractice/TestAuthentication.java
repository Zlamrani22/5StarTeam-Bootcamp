package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AuthenticationPage;

public class TestAuthentication extends CommonAPI {

    @Test(enabled = true)//check
    public void testAuthenticateWithValidCredentials() {
        AuthenticationPage authenticationPage = new AuthenticationPage(getDriver());
        authenticationPage.clickLoginButton();
        authenticationPage.typeEmailInputField("tadefi_01@yahoo.fr");
        authenticationPage.typePasswordInputField("tadefi2022");
        authenticationPage.clickLoginSubmitButton();

        String expectedAccountPageTitle = "My account - My Store";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }

}
