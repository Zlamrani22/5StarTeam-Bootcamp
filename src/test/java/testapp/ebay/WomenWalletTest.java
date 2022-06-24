package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.WomenWalletPage;


public class WomenWalletTest extends CommonAPI {
        @Test
        public void WomenWalletTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickWomenWallet();
            WomenWalletPage womenWalletPage = new WomenWalletPage(getDriver());
            womenWalletPage.clickwomenWalletbutton();
            homePage.clickSavedSearch();
            String expectWomenWallet = "ebay.com WomenWallet";
            Assert.assertEquals(expectWomenWallet, (getPageTitle()));
        }
    }


