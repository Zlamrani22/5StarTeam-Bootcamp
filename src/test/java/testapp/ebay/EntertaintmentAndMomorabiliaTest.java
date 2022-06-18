package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.EntertaintmentMemorabiliaPage;
import pages.ebay.HomePage;


public class EntertaintmentAndMomorabiliaTest extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(DropdownTest.class);
//
        @Test(enabled = false)
        public void selectEntertaintmentAndMomorabiliaOptionFromDropdown(){
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("EntertaintmentAndMomorabilia");
            EntertaintmentMemorabiliaPage entertaintmentMemorabiliaPage = new EntertaintmentMemorabiliaPage(getDriver());
            entertaintmentMemorabiliaPage.clickentertaintmentMemorabiliabutton();
            waitFor(2);
            homePage.clickSearch();
            String expectEntertaintmentAndMomorabilia = "ebay.com :EntertaintmentAndMomorabilia";
            Assert.assertEquals(expectEntertaintmentAndMomorabilia, (getPageTitle()));
        }
    }

