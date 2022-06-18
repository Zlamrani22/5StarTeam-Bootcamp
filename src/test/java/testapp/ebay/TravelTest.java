package testapp.ebay;


import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.TravelPage;

public class TravelTest extends CommonAPI {

        @Test
        public void TravelTest() {
           HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("Travel");
            TravelPage travelPage=new TravelPage(getDriver());
            travelPage.clicktravelbutton();
            waitFor(2);
            homePage.clickSearch();
            String expectTravel = "ebay.com : Travel";
            Assert.assertEquals(expectTravel, (getPageTitle()));
        }
}


//            TravelPage travelPage = new TravelPage(getDriver());
//            TravelPage.clickTravel();
//
//            String expectTravel = "ebay.com :Travel";
//            Assert.assertEquals(expectTravel, (getPageTitle()));





