package testapp.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.AddToCartPage;

public class AddToCartTest extends CommonAPI {
    @Test
    public void testAddToCart() {

       AddToCartPage addToCartPage = new AddToCartPage(getDriver());
        addToCartPage.clickaddtocartbutton();
        String expectAddToCartOnEbay = "eBay shopping cart";
        Assert.assertEquals(expectAddToCartOnEbay, (getPageTitle()));
    }
}



