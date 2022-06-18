package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.SavedSearchPage;


public class SavedTest extends CommonAPI {
        @Test
        public void SavedTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickSavedSearch();
            SavedSearchPage savedSearchPage = new SavedSearchPage(getDriver());
            savedSearchPage.clicksavebutton();
            homePage.clickSearch();
            String expectSevedSearch = "ebay.com SavedSearch";
            Assert.assertEquals(expectSevedSearch, (getPageTitle()));
        }
    }



