package testapp.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.PaymentPage;
import pages.ebay.TestHomePage;

public class PaymentTest extends CommonAPI {

    @Test
    public void PaymentTest() {
        TestHomePage testHomePage = new TestHomePage(getDriver());
        testHomePage.selectOptionFromMenuDropdownWithGivenText("Payment");
        waitFor(2);

    }
}





//    public void testPayment() {
//        PaymentPage paymentPage = new PaymentPage(getDriver());
//        paymentPage.clickPayment();
//
//        String expectPayment = "ebay.com :Payment";
//        Assert.assertEquals(expectPayment, (getClass()));
//    }
//
//}
