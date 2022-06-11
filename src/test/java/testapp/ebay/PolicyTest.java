package testapp.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.PolicyPage;
import pages.ebay.TestHomePage;

import java.security.Policy;

//import base.CommonAPI;
//import org.testng.Assert;
//import pages.ebay.PolicyPage;
//
public class PolicyTest {

    public class policyTest extends CommonAPI {

        @Test
        public void PolicyTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("Policy");
            waitFor(2);
        }
    }
}




//
//        PolicyPage policyPage = new PolicyPage(getDriver());
//            policyPage.clickPolicyButton();
//
//            String expectPolicy = "ebay.com :Policy";
//            Assert.assertEquals(expectPolicy, (getPageTitle()));
//        }
//
//
//    }
//        }
//
//
//
//
//    public void testPolicy() {
//            PplicyPage policyPage = new PolicyPage(getDriver());
//            policyPage.clickPolicy();
//
//            String expectPolicy = "ebay.com :Policy";
//            Assert.assertEquals(expectPolicy, (getPageTitle()));
//        }
//
//
//    }
//}
