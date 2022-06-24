package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.BabyPage;
import pages.ebay.HomePage;


    public class BabyTest extends CommonAPI {
        @Test
        public void BabyTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("Baby");
           BabyPage babyPage = new BabyPage(getDriver());
            babyPage.clickbabybutton();
            waitFor(3);
            homePage.clickSearch();
            String expectBaby = "ebay.com :Baby";
            Assert.assertEquals(expectBaby, (getPageTitle()));
        }
    }






