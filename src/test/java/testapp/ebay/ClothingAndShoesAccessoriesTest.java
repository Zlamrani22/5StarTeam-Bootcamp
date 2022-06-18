package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.ClothingAndAccessoriesPage;
import pages.ebay.HomePage;


    public class ClothingAndShoesAccessoriesTest extends CommonAPI {


//
        @Test(enabled = false)
        public void selectClothingAndAccessoriesOptionFromDropdown(){
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("ClothingAndShoesAccessories");
            ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(getDriver());
            clothingAndAccessoriesPage.clickclothingAndAccessoriesbutton();
            waitFor(2);
            homePage.clickSearch();
            String expectClothingAndShoesAccessories= "ebay.com :ClothingAndShoesAccessories";
            Assert.assertEquals(expectClothingAndShoesAccessories, (getPageTitle()));
        }
    }


