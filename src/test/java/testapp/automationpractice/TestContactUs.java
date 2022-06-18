package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.ContactUsPage;
import pages.automationpractice.AutomationHomePage;

public class TestContactUs extends CommonAPI {

    @Test(enabled = true)//check
    public void testContactUs() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickContactUsButton();
        ContactUsPage contactUsPage = new ContactUsPage(getDriver());
        contactUsPage.selectFromSubjectHeadingDropdown();
        contactUsPage.typeEmailAddress("tadefi_01@yahoo.fr");
        contactUsPage.typeOrderRefNumber("123456F");
        contactUsPage.typeInTextArea("This an automation test");
        contactUsPage.clickSendButton();

        String expectedPageTitle = "Contact us - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
}
