package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.ComputerAndTabletPage;
import pages.ebay.HomePage;


public class ComputerAndTabletTest extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(DropdownTest.class);
//
        @Test(enabled = false)
        public void selectComputerAndTabletOptionFromDropdown(){
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("computerAndTablet");
            ComputerAndTabletPage computerAndTabletPage = new ComputerAndTabletPage(getDriver());
            computerAndTabletPage.clickcomputerAndTabletbutton();
            waitFor(2);
            homePage.clickSearch();
            String expectComputerAndTablet= "ebay.com :ComputerAndTablet";
            Assert.assertEquals(expectComputerAndTablet, (getPageTitle()));
        }
    }


