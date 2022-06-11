package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import pages.ebay.SearchProductPage;


    public class SearchProductTest extends CommonAPI {

        public void testSearchProduct() {
            SearchProductPage searchProductPage = new SearchProductPage(getDriver());
           searchProductPage.clickSearchProduct();

            String expectSearchProduct = "ebay.com :SearchProduct";
            Assert.assertEquals(expectSearchProduct, (getPageTitle()));
        }


    }

