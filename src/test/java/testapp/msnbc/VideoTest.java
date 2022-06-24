package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.HomePage;
import pages.msnbc.LiveTvPage;
import pages.msnbc.MaddowPage;
import pages.msnbc.PeacockPage;

public class VideoTest extends CommonAPI {

    @Test
    public void PeacockHassanMehdiShow(){
        HomePage homePage= new HomePage(getDriver());
        homePage.clickPeackockTab();
        switchTabs();
        String pageTitle= "Watch MSNBC Streaming on Peacock | Peacock";
        Assert.assertEquals(pageTitle,getPageTitle());
        PeacockPage peacockPage= new PeacockPage(getDriver());
        scrollToView(peacockPage.scrollToOnlyOnPeacockHeader());
        peacockPage.clickHassanMehdiPeacock();
        String title= "Watch The Mehdi Hasan Show Streaming Online | Peacock";
        Assert.assertEquals(title,getPageTitle());

    }

    @Test
    public void liveTvTest1(){
        HomePage homePage= new HomePage(getDriver());
        LiveTvPage liveTvPage= new LiveTvPage(getDriver());
        homePage.clickLiveTvTab();
        liveTvPage.clickSignInButton();
        liveTvPage.chooseOptimum();
        String title= liveTvPage.optimumPageLogo();
        Assert.assertEquals("Optimum.",title);
    }

    @Test
    public void videoTests(){
        HomePage homePage= new HomePage(getDriver());
        MaddowPage maddowPage= new MaddowPage(getDriver());
        homePage.clickMaddow();
        maddowPage.playAllLatestMaddowVideos();
        boolean text= maddowPage.checkLatestVideosButtonIsInteractable();
        Assert.assertTrue(text);

    }
}
