package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CameraAndPhotoPage;
import pages.ebay.HomePage;


public class CameraAndPhotoTest extends CommonAPI {

        @Test
        public void CameraAndPhotoTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("CameraAndPhoto");
            CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage(getDriver());
            cameraAndPhotoPage.clickcameraAndPhotobutton();
            waitFor(2);
            homePage.clickSearch();
            String expectCameraAndPhoto = "ebay.com :CameraAndPhoto";
            Assert.assertEquals(expectCameraAndPhoto, (getPageTitle()));
        }
}



//        @Test
//        public void CameraAndPhotopage() {
//            CameraAndPhotoPage cameraAndPhotopage = new CameraAndPhotoPage(getDriver());
//            CameraAndPhotopage().selectOptionFromMenuDropdownWithGivenText("CameraAndPhoto");
//            waitFor(3);
//        }
//    }

//
//}
//public class CameraAndPhotoTest extends CommonAPI {
//
//    private final Logger LOG = LoggerFactory.getLogger(CameraAndPhotoTest.class);
//
//    @Test
//
////    public void selectBabyOption() {
////       HomePage homepage=new HomePage(getDriver());
////       homepage.selectOptionFromMenuDropdownWithGivenText("CameraAndPhoto");
////       homepage.
////        CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage(getDriver());
////        cameraAndPhotoPage.searchelement("CameraAndPhoto");
////        cameraAndPhotoPage.clickSearchBtn();
////        cameraAndPhotoPage.selectOptionFromMenuDropdown("CameraAndPhoto");
////        waitFor(3);
////    }
////}