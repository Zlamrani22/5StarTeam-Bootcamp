package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.AntiquesPage;
import pages.ebay.HomePage;
//import pages.ebay.AntiquesPage;

public class AntiquesTest extends CommonAPI {


    @Test
    public void AntiquesTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Antiques");
       AntiquesPage antiquesPage = new AntiquesPage(getDriver());
        antiquesPage.clickantiquesbutton();
        waitFor(3);
        homePage.clickSearch();
        String expectAntiques = "ebay.com :Antiques";
        Assert.assertEquals(expectAntiques, (getPageTitle()));
    }
}

//        @Test
//        public void AntiquesTest() {
//            HomePage homePage = new HomePage(getDriver());
//            homePage.selectOptionFromDropDown("Antiques");
//            waitFor(3);
//           homePage.clickSearchBtn();
//            String expectAntiques = "ebay.com :Antiques";
//            Assert.assertEquals(expectAntiques, (getPageTitle()));
//        }
//    }

