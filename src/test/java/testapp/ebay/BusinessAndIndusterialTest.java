package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.BusinessAndIndusterialPage;
import pages.ebay.HomePage;

public class BusinessAndIndusterialTest extends CommonAPI {

    @Test
    public void BusinessAndIndusterialTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("BusinessAndIndusterial");
        BusinessAndIndusterialPage businessAndIndusterialPage = new BusinessAndIndusterialPage(getDriver());
        businessAndIndusterialPage.clickbusinessAndIndusterialbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectBusinessAndIndusterial = "ebay.com :BusinessAndIndusterial";
        Assert.assertEquals(expectBusinessAndIndusterial,(getPageTitle()));
    }
}





