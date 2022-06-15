package testapp.statefarm.payement;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.BillingPage;

public class Billing extends CommonAPI {
    @Test
    public void payBill() {
        BillingPage billingPage = new BillingPage(getDriver());
        billingPage.clickOnPayBill();
        billingPage.selectOptionFromMenuDropdown("Phone Number");
        billingPage.typePhoneNum("3475495665");
        billingPage.typeDateOfBirth("04061987");
        billingPage.clickOnPayNowBtn();
        String expectedPageTitle = "Sorry we are having technical problems";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(5);
    }
}
