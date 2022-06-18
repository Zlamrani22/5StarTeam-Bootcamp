package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.ArtPage;
import pages.ebay.HomePage;


public class ArtTest extends CommonAPI {

        @Test
        public void ArtTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("Art");
           ArtPage artPage = new ArtPage(getDriver());
            artPage.clickartbutton();
            waitFor(2);
            homePage.clickSearch();
            String expectAntiques = "ebay.com :Art";
            Assert.assertEquals(expectAntiques, (getPageTitle()));
        }
    }


