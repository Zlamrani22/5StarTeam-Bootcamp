package testapp.statefarm.otherFunctions;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.OthersPage;

public class Others extends CommonAPI {

    //@Test
    public void testPaperLess() {
        OthersPage othersPage = new OthersPage(getDriver());
        othersPage.clickOnXbox();
        othersPage.clickOnPaperLess();
        othersPage.typePhoneNum("3475495665");
        othersPage.typeDateOfBirth("04061987");
        othersPage.clickOnContinue();
        waitFor(5);
        String expectedPageTitle = "Go Paperless - We'll need your email.";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

   // @Test
    public void testAutoPay() {
        OthersPage othersPage = new OthersPage(getDriver());
        othersPage.clickOnXbox();
        othersPage.clickOnAutoPay();
        othersPage.typePhoneNum("2016672134");
        othersPage.typeDateOfBirth("07181980");
        othersPage.clickOnContinue();
        waitFor(5);
        String expectedPageTitle = "Go Paperless - We'll need your email.";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    //@Test
    public void changeLanguage(){
        OthersPage othersPage = new OthersPage(getDriver());
        othersPage.clickOnLanguage();
        waitFor(3);
        String expectedPageTitle = "100 años de seguro de automóviles de State Farm y más. Obtén una cotización | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    //@Test
    public void getBillDropdownList(){
        OthersPage othersPage = new OthersPage(getDriver());
        othersPage.clickOnPayBill();
        othersPage.selectOptionBillPayDropdown("Phone Number");
        for (String str:othersPage.getOthersPageDropdownOptions()) {
            System.out.println(str);
        }
    }

    @Test
    public void getQuoteDropdownList(){
        OthersPage othersPage = new OthersPage(getDriver());
        othersPage.clickOnGetQuote();
        othersPage.selectOtherPageQuoteDropDown("Auto");
        for (String str:othersPage.getOthersPageQuoteDropdownOptions()) {
            System.out.println(str);
        }
    }

}
