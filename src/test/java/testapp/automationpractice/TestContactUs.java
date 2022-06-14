package testapp.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.ContactUsPage;
import pages.automationpractice.HomePage;

public class TestContactUs extends CommonAPI {

    @Test(enabled = false)//check
    public void testContactUs(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickContactUsButton();
        ContactUsPage contactUsPage = new ContactUsPage(getDriver());
        contactUsPage.selectFromSubjectHeadingDropdown();
        contactUsPage.typeEmailAddress("tadefi_01@yahoo.fr");
        contactUsPage.typeOrderRefNumber("123456F");
        contactUsPage.typeInTextArea("This an automation test");
        contactUsPage.clickSendButton();

        String expectedPageTitle = "Contact us - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

//        String actualValidationMesssage = driver.findElement(By.xpath("//*[@id='center_column']/p")).getText();
//        String expectedValidationMessage = "";
//        Assert.assertEquals(actualValidationMesssage, expectedValidationMessage);
    }
}
