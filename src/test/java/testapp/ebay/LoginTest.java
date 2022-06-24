package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.LoginPage;
//import pages.ebay.SigninPage;
//import java.util.logging.Logger;

    public class LoginTest extends CommonAPI {

        @Test
        public void LoginTest() {
            HomePage homePage =new HomePage(getDriver());
            homePage.clickSingin();
            LoginPage loginPage =new LoginPage(getDriver());
//            loginPage.clickSinginbutton();
            String expectLogin = "ebay.com :Login";
            Assert.assertEquals(expectLogin,(getPageTitle()));
        }
    }






//public class SigninTest extends CommonAPI {

//    private final Logger LOG = LoggerFactory.getLogger(InvalidSigninTest.class);
//
//    @Test
//
//    public void LoginPage() {
//        CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage(getDriver());
//        LoginPage loginPage = new LoginPage(getDriver());
//        String text = loginPage.getHeaderText();
//        Assert.assertEquals("Email or Password", text);
//    }
//
//}