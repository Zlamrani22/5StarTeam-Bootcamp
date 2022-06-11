package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.HomePage;
import pages.msnbc.NewsletterPage;
import pages.msnbc.SigUpPage;

public class SignUpTests extends CommonAPI {

    @Test
    public void invalidEmail(){
        HomePage homePage= new HomePage(getDriver());
        NewsletterPage newsletterPage= new NewsletterPage(getDriver());
        SigUpPage sigUpPage= new SigUpPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectNewsletterOption();
        newsletterPage.chooseMorningJoeNewsletter();
        sigUpPage.searchElementAndEnter("abcd@123");
        String title= "Sign up for the Morning Joe newsletter | NBC News";
        Assert.assertEquals(title,getPageTitle());
    }

    @Test
    public void validEmail(){
        HomePage homePage= new HomePage(getDriver());
        NewsletterPage newsletterPage= new NewsletterPage(getDriver());
        SigUpPage sigUpPage= new SigUpPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectNewsletterOption();
        newsletterPage.chooseMorningJoeNewsletter();
        sigUpPage.searchElementAndEnter("sadaf492@hotmail.com");
        waitFor(1);
        String text= sigUpPage.validSignUpHeaderText();
        Assert.assertEquals("You have successfully signed up for the Morning Joe newsletter.",text);
    }

}
