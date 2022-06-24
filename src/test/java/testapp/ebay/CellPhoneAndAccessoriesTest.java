package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CellPhoneAndAccessoriesPage;
import pages.ebay.HomePage;

public class CellPhoneAndAccessoriesTest {
    public class CellPhoneAndAccessories extends CommonAPI {

        @Test (enabled = false)
    public void selectCellPhoneAndAccessoriesOptionFromDropdown(){
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("CellPhoneAndAccessories");
       CellPhoneAndAccessoriesPage cellPhoneAndAccessoriesPage= new CellPhoneAndAccessoriesPage(getDriver());
       cellPhoneAndAccessoriesPage.clickcellPhoneAndAccessoriesbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectCellPhoneAndAccessories = "ebay.com :CellPhoneAndAccessories";
        Assert.assertEquals(expectCellPhoneAndAccessories, (getPageTitle()));
        }
    }
}

