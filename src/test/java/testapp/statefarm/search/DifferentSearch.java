package testapp.statefarm.search;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.SearchPage;

public class DifferentSearch extends CommonAPI {

    @Test
    public void searchUsBank(){
        SearchPage differentSearchPage = new SearchPage(getDriver());
        differentSearchPage.clickOnSearchBtn();
        differentSearchPage.typeOnSearchBox("Us Bank");
        differentSearchPage.clickOnSearchBtn1();
        String expectedPageTitle = "State Farm | Search";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        differentSearchPage.clickOnBusinessBank();
    }

    @Test
    public void searchAgent(){
        SearchPage differentSearchPage = new SearchPage(getDriver());
        differentSearchPage.clickOnSearchBtn();
        differentSearchPage.typeOnSearchBox("Find an agent");
        differentSearchPage.clickOnSearchBtn1();
        String expectedPageTitle = "State Farm | Search";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void searchStateFarmAgency() {
        SearchPage differentSearchPage = new SearchPage(getDriver());
        differentSearchPage.clickOnSearchBtn();
        differentSearchPage.typeOnSearchBox("State Farm Agency");
        differentSearchPage.clickOnSearchBtn1();
        String expectedPageTitle = "State Farm | Search";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
