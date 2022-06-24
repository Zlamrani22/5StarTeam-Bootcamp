package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.HowToDonatePage;


public class HowToDonateTest extends CommonAPI {
        @Test
        public void HowToDonateTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickHowToDonate();
            HowToDonatePage howToDonatePage = new HowToDonatePage(getDriver());
            howToDonatePage.clickhowToDonatebutton();
            homePage.clickSearch();
            String expectHowToDonate = "ebay.com HowToDonate";
            Assert.assertEquals(expectHowToDonate, (getPageTitle()));
        }

    }
