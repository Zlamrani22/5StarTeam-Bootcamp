package reporting.statefarm.otherFunctions;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.OthersPage;

public class Others extends CommonAPI {

    @Test
    public void testPaperLess() {
        OthersPage othersPage = new OthersPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        othersPage.clickOnPaperLess();
        othersPage.typePhoneNum("3475495665");
        othersPage.typeDateOfBirth("04061987");
        JavascriptExecutor jsc = (JavascriptExecutor)getDriver();
        jsc.executeScript("window.scrollBy(0,500)", "");
        othersPage.clickOnContinue();
        waitFor(5);
        String expectedPageTitle = "Go Paperless - We'll need your email.";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void testAutoPay() {
        OthersPage othersPage = new OthersPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        othersPage.clickOnAutoPay();
        othersPage.typePhoneNum2("2016672134");
        othersPage.typeBirthday("07181980");
        JavascriptExecutor jsc = (JavascriptExecutor)getDriver();
        jsc.executeScript("window.scrollBy(0,500)", "");
        othersPage.clickOnContinueBtn();
        waitFor(5);
        String expectedPageTitle = "Let's check your eligibility";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void changeLanguage(){
        OthersPage othersPage = new OthersPage(getDriver());
        othersPage.clickOnLanguage();
        waitFor(3);
        String expectedPageTitle = "100 años de seguro de automóviles de State Farm y más. Obtén una cotización | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
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

    @Test
    public void validateLoginPage() {
        OthersPage othersPage = new OthersPage(getDriver());
        othersPage.clickOnLogo();
        Assert.assertTrue(othersPage.checkLogoIsPresent());
    }

}
