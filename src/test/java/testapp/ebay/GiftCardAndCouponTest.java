package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.GiftCardAndCouponPage;
import pages.ebay.HomePage;


    public class GiftCardAndCouponTest extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(DropdownTest.class);
//
        @Test(enabled = false)
        public void selectGiftCardAndCouponOptionFromDropdown(){
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("GiftCardAndCoupon");
           GiftCardAndCouponPage giftCardAndCouponPage = new GiftCardAndCouponPage(getDriver());
            giftCardAndCouponPage.clickgiftCardAndCouponbutton();
            waitFor(2);
            homePage.clickSearch();
            String expectGiftCardAndCoupon = "ebay.com :GiftCardAndCoupon";
            Assert.assertEquals(expectGiftCardAndCoupon, (getPageTitle()));
        }
    }


