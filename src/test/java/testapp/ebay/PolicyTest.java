package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.PolicyPage;

//import base.CommonAPI;
//import org.testng.Assert;
//import pages.ebay.PolicyPage;
//
public class PolicyTest {

    public class policyTest extends CommonAPI {

        @Test
        public void PolicyTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("Policy");
            PolicyPage policyPage = new PolicyPage(getDriver());
            policyPage.clickpolicybutton();
            waitFor(2);
            homePage.clickSearch();
            String expectPolicy = "ebay.com : Policy";
            Assert.assertEquals(expectPolicy, (getPageTitle()));
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
