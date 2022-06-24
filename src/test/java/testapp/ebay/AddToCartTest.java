package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.AddToCartPage;
import pages.ebay.HomePage;

public class AddToCartTest extends CommonAPI {
    @Test
    public void AddToCartTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickAddToCart();
        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
        addToCartPage.clickaddtocartbutton();
        homePage.clickSearch();
        String expectAddToCart = "ebay.com AddToCart";
        Assert.assertEquals(expectAddToCart, (getPageTitle()));
    }
}


//import pages.ebay.AddToCartPage;
//import pages.ebay.CameraAndPhotoPage;

//public class AddToCartTest extends CommonAPI {
//    @Test
//    public void AddToCartTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickAddToCart();
//        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
//        String expectAddToCart = "ebay.com AddToCart";
//        Assert.assertEquals(expectAddToCart, (getPageTitle()));
////    }
////}
//    }
//}

//        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
//        addToCartPage.clickaddtocartbutton();
//
//        String expectAddToCart = "ebay.com AddToCart";
//        Assert.assertEquals(expectAddToCart, (getPageTitle()));
//    }
//}









//




//public class AddToCartTest extends CommonAPI {
//    @Test
//    public void AddToCartTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("AddToCart");
//        waitFor(1);
//    }
//}

//
//    public class AddToCartTest extends CommonAPI {
//
//        private final Logger LOG = LoggerFactory.getLogger(testapp.ebay.AddToCartTest.class);
//
//        @Test
//        public void AddToCartPage() {
//            AddToCartPage addToCartPagePage = new AddToCartPage(getDriver());
//            addToCartPagePage.clickAddToCart();
//            Assert.assertFalse(AddToCartPage.checkLogoIsPresent());
//        }
//    }



