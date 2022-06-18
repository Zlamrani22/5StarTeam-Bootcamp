package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.DVDAndMoviePage;
import pages.ebay.HomePage;


public class DVDAndMovieTest extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(DropdownTest.class);
//
        @Test(enabled = false)
        public void selectDVDAndMovieOptionFromDropdown(){
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("DVDAndMovie");
            DVDAndMoviePage dvdAndMoviePage = new DVDAndMoviePage(getDriver());
            dvdAndMoviePage.clickdvdAndMoviebutton();
            waitFor(2);
            homePage.clickSearch();
            String expectDVDAndMovie= "ebay.com :DVDandMovie";
            Assert.assertEquals(expectDVDAndMovie, (getPageTitle()));
        }
    }

