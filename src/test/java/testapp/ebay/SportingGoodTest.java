package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.SportingGoodPage;


public class SportingGoodTest extends CommonAPI {

        @Test
        public void SportingGoodTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("SportingGood");
            SportingGoodPage sportingGoodPage = new SportingGoodPage(getDriver());
            sportingGoodPage.clicksportingGoodButton();
            waitFor(1);
            homePage.clickSearch();
            String expectSportingGood = "ebay.com : SportingGood";
            Assert.assertEquals(expectSportingGood, (getPageTitle()));
        }
    }


