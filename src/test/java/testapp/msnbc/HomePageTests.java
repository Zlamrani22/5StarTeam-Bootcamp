package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.HomePage;


public class HomePageTests extends CommonAPI {

    @Test
    public void viewAllVideosListedCelebratingMSNBC(){
        HomePage homePage= new HomePage(getDriver());
        scrollToView(homePage.knowYourValueHeaderText);
        homePage.clickAllButtonsCelebratingMSNBC();
    }

    @Test
    public void viewAllLatestNewsNBC(){
        HomePage homePage= new HomePage(getDriver());
        scrollToView(homePage.celebratingMSNBCTitle);
        homePage.clickSeeAllLatestNBCNews();
    }

    @Test
    public void msnbcDailyNewsPage(){
        HomePage homePage= new HomePage(getDriver());
        scrollToView(homePage.msnbcDailyFooterHomePage);
        homePage.clickSubscribeToMsnbcDaily();
        //fails because not directed to msnbcDaily page.(Bug)
        Assert.assertEquals("MSNBC Sign up for the MSNBC Daily newsletter | NBC News",getPageTitle());
    }

    @Test
    public void getHeadlineText(){
        HomePage homePage= new HomePage(getDriver());
        doubleClick(homePage.homepageHeadline);
        String headline= homePage.getHeadlineTextNewPage();
        System.out.println(headline);
    }

    @Test
    public void scrollToSeeAllClickAndScrollUpClickHomepageLogo(){
        HomePage homePage= new HomePage(getDriver());
        scrollToView(homePage.celebratingMSNBCTitle);
        homePage.clickSeeAllLatestNBCNews();
        navigateBack();
        scrollToView(homePage.celebratingMSNBCTitle);
        scrollToView(homePage.homepageMSNBCLogo);
        homePage.clickMsnbcLogoHomePage();
        String text= homePage.getLogoText();
        Assert.assertEquals(text,"MSNBC");
    }
}
