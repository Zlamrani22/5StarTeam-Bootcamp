package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.AdvancedSearchPage;
import pages.ebay.HomePage;


    public class AdvancedSearchTest extends CommonAPI {
        @Test
        public void AdvancedSearchTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickadvancedSearchbutton();
            AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(getDriver());
            AdvancedSearchPage.clickadvancedSearchbutton();
            homePage.clickSearch();
            String expectAdvancedSearch = "ebay.com AdvanceSearch";
            Assert.assertEquals(expectAdvancedSearch, (getPageTitle()));
        }
            }


