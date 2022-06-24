package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.BuyPage;
import pages.ebay.HomePage;


public class BuyTest extends CommonAPI {
        @Test
        public void BuyTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.clickBuy();
            BuyPage buyPage = new BuyPage(getDriver());
            buyPage.clickbuybutton();
            waitFor(1);
            homePage.clickSearch();
            String expectBuy = "ebay.com Buy";
            Assert.assertEquals(expectBuy, (getPageTitle()));
        }
    }

//        private final Logger LOG = LoggerFactory.getLogger(SearchTest.class);
//@Test
//    public void searchJavaBook(){
//    HomePage homePage = new HomePage(getDriver());
//    SearchPage searchtPage = new SearchPage(getDriver());
//    homePage.searchElement("BuyButton");
//    homePage.clickSearchBtn();
//    String expectedBuyTitle = "ebay.com buyButton";
//    Assert.assertEquals(expectedBuyTitle, searchPage.getSearchPageTitle());
//}

