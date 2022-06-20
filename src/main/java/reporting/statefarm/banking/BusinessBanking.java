package reporting.statefarm.banking;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.BusinessBankingPage;

public class BusinessBanking extends CommonAPI {
    @Test
    public void openMonetaryAccount(){
        BusinessBankingPage businessBankingPage = new BusinessBankingPage(getDriver());
        businessBankingPage.clickOnBanking();
        businessBankingPage.clickOnMoneyMarket();
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
        String expectedPageTitle = "Business Cash Management | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
    @Test
    public void applyForLending(){
        BusinessBankingPage businessBankingPage = new BusinessBankingPage(getDriver());
        businessBankingPage.clickOnBanking();
        businessBankingPage.clickOnLending();
        String expectedPageTitle = "Business Lending, Loans, and Lines of Credit | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void findPaymentSolution(){
        BusinessBankingPage businessBankingPage = new BusinessBankingPage(getDriver());
        businessBankingPage.clickOnBanking();
        businessBankingPage.clickOnPaymentSolution();
        String expectedPageTitle = "Business Payment Processing Solutions | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

}
