package testapp.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.TestHomePage;

public class PetSupplyTest {
    public class PetSupplytest extends CommonAPI {

        @Test
        public void PetSupplyTest() {
            TestHomePage testHomePage = new TestHomePage(getDriver());
            testHomePage.selectOptionFromMenuDropdownWithGivenText("PetSupply");
            waitFor(2);
        }
    }
}
