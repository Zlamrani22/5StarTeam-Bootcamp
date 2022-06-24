package testapp.statefarm.quotes;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.QuotesPage;

public class DifferentQuotes extends CommonAPI {
   @Test
    public void getAutoQuote() {
        QuotesPage quotesPage = new QuotesPage(getDriver());
        quotesPage.getQuote();
        quotesPage.selectFromMenuDropdown("Auto");
        quotesPage.typeZipCode("11219");
        quotesPage.clickOnStartQuoteBtn();
        String expectedPageTitle = "State Farm Auto Insurance & More for 100 Years. Get a Quote | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void getPetQuote() {
        QuotesPage quotesPage = new QuotesPage(getDriver());
        quotesPage.getQuote();
        quotesPage.selectFromMenuDropdown("Pet Insurance");
        quotesPage.typeZipCode("11219");
        quotesPage.clickOnStartQuoteBtn();
        String expectedPageTitle = "State Farm Auto Insurance & More for 100 Years. Get a Quote | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
   @Test
    public void getRenterQuote() {
        QuotesPage quotesPage = new QuotesPage(getDriver());
        quotesPage.getQuote();
        quotesPage.selectFromMenuDropdown("Renters");
        quotesPage.typeZipCode("11209");
        quotesPage.clickOnStartQuoteBtn();
        String expectedPageTitle = "State Farm Auto Insurance & More for 100 Years. Get a Quote | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
   @Test
    public void getHomeownersQuote() {
        QuotesPage quotesPage = new QuotesPage(getDriver());
        quotesPage.getQuote();
        quotesPage.selectFromMenuDropdown("Homeowners");
        quotesPage.typeZipCode("11209");
        quotesPage.clickOnStartQuoteBtn();
        String expectedPageTitle = "State Farm Auto Insurance & More for 100 Years. Get a Quote | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
  @Test
    public void getCondoOwnersQuote() {
        QuotesPage quotesPage = new QuotesPage(getDriver());
        quotesPage.getQuote();
        quotesPage.selectFromMenuDropdown("Condo Owners");
        quotesPage.typeZipCode("11209");
        quotesPage.clickOnStartQuoteBtn();
        String expectedPageTitle = "State Farm Auto Insurance & More for 100 Years. Get a Quote | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
   @Test
    public void getSmallBusinessQuote() {
        QuotesPage quotesPage = new QuotesPage(getDriver());
        quotesPage.getQuote();
        quotesPage.selectFromMenuDropdown("Small Business");
        quotesPage.typeZipCode("10301");
        quotesPage.clickOnFindAnAgent();
        quotesPage.clickOnAdvancedSearch();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void getLifeQuote() {
        QuotesPage quotesPage = new QuotesPage(getDriver());
        quotesPage.getQuote();
        quotesPage.selectFromMenuDropdown("Life");
        quotesPage.selectFromMenuDropdown1("TX");
        quotesPage.clickOnStartQuoteBtn();
        quotesPage.clickYesBtn();
        quotesPage.typeDateOfBirth("04061987");
        quotesPage.clickOnContinueBox();
        quotesPage.clickOnMaleBox();
        String expectedPageTitle = "Life Quote - State Farm";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
   @Test
    public void getMedicalSupplementQuote() {
        QuotesPage quotesPage = new QuotesPage(getDriver());
        quotesPage.getQuote();
        quotesPage.selectFromMenuDropdown("Medicare Supplement");
        quotesPage.selectFromMenuDropdown1("NJ");
        quotesPage.clickOnStartQuoteBtn();
        String expectedPageTitle = "State Farm Auto Insurance & More for 100 Years. Get a Quote | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void getHospitalIncomeQuote() {
        QuotesPage quotesPage = new QuotesPage(getDriver());
        quotesPage.getQuote();
        quotesPage.selectFromMenuDropdown("Hospital Income");
        quotesPage.selectFromMenuDropdown1 ("PA");
        quotesPage.clickOnStartQuoteBtn();
        quotesPage.typeBod("01022001");
        quotesPage.clickOnOKBox();
        String expectedPageTitle = "Policy and Personal Information - Health Rate Quote - State Farm";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
