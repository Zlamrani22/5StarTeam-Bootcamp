package testapp.statefarm.banking;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.BusinessBankingPage;

public class BusinessBanking extends CommonAPI {
    @Test
    public void openMoneyMarketAccount(){
        BusinessBankingPage businessBankingPage = new BusinessBankingPage(getDriver());
        businessBankingPage.clickOnBanking();
        businessBankingPage.clickOnMoneyMarket();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,600)", "");
        String expectedPageTitle = "Business Checking, Savings, and Money Market | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void getBusinessCreditCard(){
        BusinessBankingPage businessBankingPage = new BusinessBankingPage(getDriver());
        businessBankingPage.clickOnBanking();
        businessBankingPage.clickOnBusinessCreditCard();
        businessBankingPage.clickOnLearnMore();
        businessBankingPage.clickOnContinueBtn();
        String expectedPageTitle = "Visa Credit Cards from U.S. Bank® | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void getCashManagement(){
        BusinessBankingPage businessBankingPage = new BusinessBankingPage(getDriver());
        businessBankingPage.clickOnBanking();
        businessBankingPage.clickOnCashManagement();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,800)", "");
        String expectedPageTitle = "Business Cash Management | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
    @Test
    public void applyForLending(){
        BusinessBankingPage businessBankingPage = new BusinessBankingPage(getDriver());
        businessBankingPage.clickOnBanking();
        businessBankingPage.clickOnLending();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,800)", "");
        String expectedPageTitle = "Business Lending, Loans, and Lines of Credit | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void findPaymentSolution(){
        BusinessBankingPage businessBankingPage = new BusinessBankingPage(getDriver());
        businessBankingPage.clickOnBanking();
        businessBankingPage.clickOnPaymentSolution();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,800)", "");
        businessBankingPage.clickOnFindSolution();
        String expectedPageTitle = "Welcome!";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

}
