package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.PetSupplyPage;


public class PetSupplyTest extends CommonAPI {

        @Test
        public void PetSupplyTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("PetSupply");
            PetSupplyPage petSupplyPage = new PetSupplyPage(getDriver());
            petSupplyPage.clickpetSupplybutton();
            waitFor(2);
            homePage.clickSearch();
            String expectPetSupply= "ebay.com : PatSupply";
            Assert.assertEquals(expectPetSupply, (getPageTitle()));
        }
    }


