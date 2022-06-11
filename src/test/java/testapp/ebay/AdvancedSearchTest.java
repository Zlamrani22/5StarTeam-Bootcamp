package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.AdvancedSearchPage;

public class AdvancedSearchTest extends CommonAPI {
    @Test
    public void testAdvancedSearch() {
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(getDriver());
        advancedSearchPage.clickAddvancedSearch();

        String expectAdvancedSearch = "eBay Search: Advanced Search";
        Assert.assertEquals(expectAdvancedSearch, (getPageTitle()));
    }

}


