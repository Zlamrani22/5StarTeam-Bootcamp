package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.PotteryAndGlassPage;


public class PotteryAndGlassTest extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(DropdownTest.class);
//
        @Test(enabled = false)
        public void selectPotteryAndGlassOptionFromDropdown(){
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("PotteryAndGlass");
           PotteryAndGlassPage potteryAndGlassPage = new PotteryAndGlassPage(getDriver());
            potteryAndGlassPage.clickpotteryAndGlassbutton();
            waitFor(2);
            homePage.clickSearch();
            String expectPottryAndGlass = "ebay.com :PotteryAndGlass";
            Assert.assertEquals(expectPottryAndGlass, (getPageTitle()));
        }
    }



