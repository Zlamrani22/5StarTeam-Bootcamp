package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.DollsAndBearsPage;
import pages.ebay.HomePage;


public class DollsAndBearsTest extends CommonAPI {

        @Test
        public void DollsAndBearsTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("DollsAndBears");
            DollsAndBearsPage dollsAndBearsPage = new DollsAndBearsPage(getDriver());
            dollsAndBearsPage.clickdollsAndBearsbutton();
            waitFor(1);
            homePage.clickSearch();
            String expectDollsAndBears = "ebay.com :DollsAndBears";
            Assert.assertEquals(expectDollsAndBears, (getPageTitle()));
        }
    }



