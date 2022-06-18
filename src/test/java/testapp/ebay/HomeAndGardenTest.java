package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomeAndGardenPage;
import pages.ebay.HomePage;


public class HomeAndGardenTest extends CommonAPI {

        @Test
        public void HomeAndGardenTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("HomeAndGarden");
           HomeAndGardenPage homeAndGardenPage = new HomeAndGardenPage(getDriver());
            homeAndGardenPage.clickhomeAndGardenbutton();
            waitFor(1);
            homePage.clickSearch();
            String expectHomeAndGarden = "ebay.com :HomeAndGarden";
            Assert.assertEquals(expectHomeAndGarden, (getPageTitle()));
        }
    }


