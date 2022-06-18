package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.MotorPage;

public class MotorTest {
    public class motorTest extends CommonAPI {


        @Test
        public void MotorTest() {
            HomePage homePage = new HomePage(getDriver());
            homePage.selectOptionFromDropDown("Motor");
            MotorPage motorPage=new MotorPage(getDriver());
            motorPage.clickmotorbutton();
            waitFor(2);
            homePage.clickSearch();
            String expectMotor = "ebay.com : Motor";
            Assert.assertEquals(expectMotor, (getPageTitle()));
        }
    }

}

