package testapp.statefarm.payement;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.BillingPage;

public class Billing extends CommonAPI {
    @Test
    public void payBillUsingPhoneNumber() {
        BillingPage billingPage = new BillingPage(getDriver());
        billingPage.clickOnPayBill();
        billingPage.selectOptionFromMenuDropdown("Phone Number");
        billingPage.typePhoneNum("2015495605");
        billingPage.typeDateOfBirth("04031990");
        billingPage.clickOnPayNowBtn();
        String expectedPageTitle = "Sorry we are having technical problems";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(5);
    }

    @Test
    public void payBillUsingInvalidPolicyNumber(){
        BillingPage billingPage = new BillingPage(getDriver());
        billingPage.clickOnPayBill();
        billingPage.selectOptionFromMenuDropdown("Policy Number");
        billingPage.typePolicyNumber("76r74hhhveu709");
        billingPage.typeZipCode("12219");
        billingPage.clickOnPayNowBtn();
        String expectedPageTitle = "";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
//      String text = billingPage.getHeaderText();
//      Assert.assertEquals("Provide Bill Information", text);
        waitFor(5);
    }
}
