package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HealthAndBeautyPage;
import pages.ebay.HomePage;


public class HealthAndBeautyTest extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(DropdownTest.class);
//
        @Test(enabled = false)
        public void selectHealthAndBeautyOptionFromDropdown(){
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("HealthAndBeauty");
            HealthAndBeautyPage healthAndBeautyPage = new HealthAndBeautyPage(getDriver());
            healthAndBeautyPage.clickhealthAndBeautybutton();
            waitFor(2);
            homePage.clickSearch();
            String expectHealthAndBeauty = "ebay.com :HealthAndBeauty";
            Assert.assertEquals(expectHealthAndBeauty, (getPageTitle()));
        }
    }

