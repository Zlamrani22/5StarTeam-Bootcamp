package testapp.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;

public class HomeTest {
    public class Hometest extends CommonAPI {

        @Test
        public void HomeTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("Home");
            waitFor(2);
        }
    }
}




//    TestHomePage testHomePage = new TestHomePage(getDriver());
//        testHomePage.clickTestHomePage();
//
//        String expectTestHomePage = "ebay.com :TestHomePage";
//        Assert.assertEquals(expectTestHomePage, (getClass()));
//    }
//
//}
