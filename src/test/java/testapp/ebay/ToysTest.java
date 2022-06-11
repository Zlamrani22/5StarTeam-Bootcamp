package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;
import pages.ebay.ToysPage;

public class ToysTest {
    public class ToyTest extends CommonAPI {
        @Test
        public void ToysTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("Toys");
            waitFor(2);
        }
    }
}







//    public void testToys() {
//        ToysPage toysPage = new ToysPage(getDriver());
//        ToysPage.clickToys();
//
//        String expectToys = "ebay.com :Toys";
//        Assert.assertEquals(expectToys, (getClass()));
//    }
//}

