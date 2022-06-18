package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CoinPage;
import pages.ebay.HomePage;


    public class CoinTest extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(DropdownTest.class);
//
        @Test
        public void selectCoinOptionFromDropdown(){
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("Coin");
           CoinPage coinPage = new CoinPage(getDriver());
            coinPage.clickcoinbutton();
            waitFor(2);
            homePage.clickSearch();
            String expectCoin= "ebay.com :Coin";
            Assert.assertEquals(expectCoin, (getPageTitle()));
        }
    }


