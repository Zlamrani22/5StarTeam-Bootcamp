package testapp.statefarm.explorestatefarm;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.ExploreStateFarmPage;

import java.util.Iterator;
import java.util.Set;

public class ExploreStateFarm extends CommonAPI {

     @Test
    public void exploreEnvironment(){
        ExploreStateFarmPage explore = new ExploreStateFarmPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,4500)", "");
        explore.clickOnExplore();
        explore.clickOnEnvironment();
        String expectedPageTitle = "Environment";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void exploreCommunity(){
        ExploreStateFarmPage explore = new ExploreStateFarmPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,4500)", "");
        explore.clickOnExplore();
        explore.clickOnCommunity();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while(iterator.hasNext()){
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        JavascriptExecutor jsc = (JavascriptExecutor)getDriver();
        jsc.executeScript("window.scrollBy(0,500)", "");
        waitFor(3);
        explore.clickOnCommunityContacts();
        String expectedPageTitle = "Community";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void exploreCompany(){
        ExploreStateFarmPage explore = new ExploreStateFarmPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,4500)", "");
        explore.clickOnExplore();
        explore.clickOnCompany();
        waitFor(3);
        String expectedPageTitle = "Company";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void exploreMedia(){
        ExploreStateFarmPage explore = new ExploreStateFarmPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,4500)", "");
        explore.clickOnExplore();
        explore.clickOnMedia();
        String expectedPageTitle = "Media";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void checkArchive(){
        ExploreStateFarmPage explore = new ExploreStateFarmPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,4500)", "");
        explore.clickOnExplore();
        explore.clickOnArchive();
        String expectedPageTitle = "Articles tagged with 'story' & 'stories' & 'releases' & 'community_feed' & 'environment_feed' & 'company_feed' & 'media_feed' | State Farm";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }


}
