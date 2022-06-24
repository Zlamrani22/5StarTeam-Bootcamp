package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.HomePage;
import pages.msnbc.PodcastPage;

public class PodcastTests extends CommonAPI {

    @Test
    public void firstPodcast1(){
        HomePage homePage= new HomePage(getDriver());
        PodcastPage podcastPage= new PodcastPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectPodcastOption();
        podcastPage.clickAmericanRadical();
        String title= podcastPage.titleAmericanRadical();
        Assert.assertEquals("AMERICAN RADICAL",title);
    }

    @Test
    public void podcastOnApplePodcasts(){
        HomePage homePage= new HomePage(getDriver());
        PodcastPage podcastPage= new PodcastPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectPodcastOption();
        podcastPage.clickAmericanRadical();
        podcastPage.clickApplePodcast();
        String pageTitle= "American Radical on Apple Podcasts";
        Assert.assertEquals(pageTitle,getPageTitle());
    }

    @Test
    public void podcastOnSpotify(){
        HomePage homePage= new HomePage(getDriver());
        PodcastPage podcastPage= new PodcastPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectPodcastOption();
        podcastPage.clickAmericanRadical();
        podcastPage.spotifyPodcastButton();
        String pageText= "American Radical | Podcast on Spotify";
        Assert.assertEquals(pageText,getPageTitle());
    }

    @Test
    public void listenPodcast(){
        HomePage homePage= new HomePage(getDriver());
        PodcastPage podcastPage= new PodcastPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectPodcastOption();
        podcastPage.clickAmericanRadical();
        podcastPage.listenNowButtonRadicalPage();
        podcastPage.playButtonAmRedicalPod();
        String title1="American Radical";
        Assert.assertEquals(title1,getPageTitle());
    }

}
