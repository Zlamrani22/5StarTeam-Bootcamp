package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.HomePage;
import pages.msnbc.LiveTvPage;
import pages.msnbc.MaddowPage;
import pages.msnbc.PeacockPage;

public class VideoTest extends CommonAPI {

    @Test(enabled = true)
    public void PeacockHassanMehdiShow(){
        HomePage homePage= new HomePage(getDriver());
        homePage.clickPeackockTab();
        waitFor(1);
        PeacockPage peacockPage= new PeacockPage(getDriver());
//        scrollToView(peacockPage.clickHassanMehdiPeacock());
        //need to finish
    }

    @Test(enabled = false)
    public void liveTvTest1(){
        HomePage homePage= new HomePage(getDriver());
        LiveTvPage liveTvPage= new LiveTvPage(getDriver());
        homePage.clickLiveTvTab();
        liveTvPage.clickSignInButton();
        liveTvPage.chooseOptimum();
        String title= liveTvPage.optimumPageLogo();
        Assert.assertEquals("Optimum.",title);
    }

    @Test(enabled = false)
    public void videoTests(){
        HomePage homePage= new HomePage(getDriver());
        MaddowPage maddowPage= new MaddowPage(getDriver());
        homePage.clickMaddow();
        maddowPage.playAllLatestMaddowVideos();
        boolean text= maddowPage.checkLatestVideosButtonIsInteractable();
        Assert.assertTrue(text);

    }
}
