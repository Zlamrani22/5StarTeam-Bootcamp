package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.DeadlinePage;
import pages.msnbc.HomePage;
import pages.msnbc.MorningJoePage;
import pages.msnbc.TwitterDeadlinePage;

public class FollowPageTest extends CommonAPI {

    @Test
    public void deadlineTwitterPageTest(){
        HomePage homePage= new HomePage(getDriver());
        DeadlinePage deadlinePage= new DeadlinePage(getDriver());
        TwitterDeadlinePage twitterDeadlinePage= new TwitterDeadlinePage(getDriver());
        //homePage.clickDeadLine();
        homePage.clickDeadLine();
        String title= "Deadline: White House on MSNBC with Nicolle Wallace";
        Assert.assertEquals(title,getPageTitle());
        waitUntilClickAble(deadlinePage.twitterOption);
        deadlinePage.selectTwitter();
        twitterDeadlinePage.twitterFollowBtn();
        String text= twitterDeadlinePage.popupPageText();
        Assert.assertEquals("Follow Deadline White House to see what they share on Twitter.",text);

    }

   @Test
    public void morningJoeInstagramPageTest(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        homePage.clickMorningJoe();
        waitUntilVisible(morningJoePage.morningJoeBioButton);
        scrollToView(morningJoePage.morningJoeBioButton);
        morningJoePage.clickMorningJoeBioButton();
        scrollToView(morningJoePage.viewFollowJoeOnInsta());
        morningJoePage.clickFollowJoeOnInsta();
        waitFor(1);
        String pageTitle="Joe Scarborough (@joescarborough) • Instagram photos and videos";
        Assert.assertEquals(pageTitle,getPageTitle());


//        click("//a[text()='Morning Joe']");
//        click("//a[@class=\"animated-ghost-button animated-ghost-button--small styles_promo3PanelButton__X0MV7\"][text()='FULL BIO'][1]");
//        click("//a[text()='@JoeScarborough']");
//        waitFor(1);
//        Assert.assertEquals("Joe Scarborough (@joescarborough) • Instagram photos and videos",getPageTitle());
    }

}
