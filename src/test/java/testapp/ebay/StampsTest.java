package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.StampsPage;


public class StampsTest extends CommonAPI {

        @Test
        public void StampsTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("Stamps");
           StampsPage stampsPage = new StampsPage(getDriver());
            stampsPage.clickstampsbutton();
            waitFor(1);
            homePage.clickSearch();
            String expectStamps= "ebay.com : Stamps";
            Assert.assertEquals(expectStamps, (getPageTitle()));
        }
    }




