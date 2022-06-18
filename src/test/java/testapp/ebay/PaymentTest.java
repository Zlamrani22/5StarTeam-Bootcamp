package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.PaymentPage;

public class PaymentTest extends CommonAPI {
    @Test
    public void PaymentTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Payment");
      PaymentPage paymentPage = new PaymentPage(getDriver());
        paymentPage.clickpaymentbutton();
        waitFor(1);
        homePage.clickSearch();
        String expectPayment = "ebay.com : Payment";
        Assert.assertEquals(expectPayment, (getPageTitle()));
    }
}



//public class PaymentPage extends CommonAPI {
//    @FindBy(xpath = "//a[normalize-space()='Payments']")
//    public WebElement paymenttButton;
//
//    public void clickPayment(){
//        click(paymenttButton);
//    }
//
//    public PaymentPage(WebDriver driver){
//        PageFactory.initElements(driver, this);
//    }
//}
//public class PaymentTest extends CommonAPI {
//
//    private final Logger LOG = LoggerFactory.getLogger(PaymentTest.class);
//
//    @Test
//    public void selectKindleStoreOptionFromDropdown() {
//        CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage(getDriver());
//        cameraAndPhotoPage.selectOptionFromAccountSettingWithSelectOptions("Payment");
//        waitFor(5);
//    }
////}