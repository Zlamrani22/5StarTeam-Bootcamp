package testapp.statefarm.banking;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.PersonalBankingPage;

public class PersonalBanking extends CommonAPI {
    @Test
    public void openCheckingAccount(){
        PersonalBankingPage personalBankingPage = new PersonalBankingPage(getDriver());
        personalBankingPage.clickOnBanking();
        personalBankingPage.clickOnChecking();
        waitFor(5);
        String expectedPageTitle = "Open an Online Checking Account that Fits Your Needs | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void getHomeLoan(){
        PersonalBankingPage personalBankingPage = new PersonalBankingPage(getDriver());
        personalBankingPage.clickOnBanking();
        personalBankingPage.clickOnHomeLoan();
        waitFor(5);
        String expectedPageTitle = "Welcome to a simple and seamless home loan experience | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
   @Test
    public void getCreditCard(){
        PersonalBankingPage personalBankingPage = new PersonalBankingPage(getDriver());
        personalBankingPage.clickOnBanking();
        personalBankingPage.clickOnCreditCard();
        personalBankingPage.clickOnLearnMore();
        waitFor(3);
        personalBankingPage.clickOnContinueBtn();
        String expectedPageTitle = "Visa Credit Cards from U.S. Bank® | State Farm®";
        Assert.assertEquals(expectedPageTitle,getPageTitle());

    }
    @Test
    public void savingAccount(){
        PersonalBankingPage personalBankingPage = new PersonalBankingPage(getDriver());
        personalBankingPage.clickOnBanking();
        personalBankingPage.clickOnSaving();
        String expectedPageTitle = "Types of Savings Accounts | State Farm®";
        Assert.assertEquals(expectedPageTitle,getPageTitle());
    }


}
