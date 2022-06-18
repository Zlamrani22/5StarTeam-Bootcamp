package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.WomenSandalsPage;


public class WomenSandalsTest extends CommonAPI {
            @Test
            public void WomenSandalsTest() {
                HomePage homePage = new HomePage(getDriver());
                homePage.clickWomenSandals();
               WomenSandalsPage womenSandalsPage = new WomenSandalsPage(getDriver());
               womenSandalsPage.clickwomenSandalsbutton();
               waitFor(2);
               homePage.clickSearch();
                String expectWomenSandals = "ebay.com WomenSandals";
                Assert.assertEquals(expectWomenSandals, (getPageTitle()));
            }
        }
