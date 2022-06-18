package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.RefreshYourHomeForLessPage;


    public class RefreshYourHomeForLessTest extends CommonAPI {
        @Test
        public void RefreshYourHomeForLessTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickRefreshYourHomeForLess();
            RefreshYourHomeForLessPage refreshYourHomeForLessPage = new RefreshYourHomeForLessPage(getDriver());
            refreshYourHomeForLessPage.clickRefreshYourHomeForLessbutton();
            homePage.clickSearch();
            String expectRefreshYourHomeForLessTest = "ebay.com RefreshYourHomeForLessTest";
            Assert.assertEquals(expectRefreshYourHomeForLessTest, (getPageTitle()));
        }

    }


