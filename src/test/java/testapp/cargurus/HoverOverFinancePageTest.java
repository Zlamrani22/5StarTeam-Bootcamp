package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HoverOverFinancePage;

public class HoverOverFinancePageTest extends CommonAPI {

    @Test
    public void HoverOverFinanceLoanCalculator(){
        HoverOverFinancePage hoverOverFinancePage = new HoverOverFinancePage(getDriver());
        hoverOverFinancePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverFinancePage.clickLoanCalculator();
        String expectedPageTitle = "Car Loan Monthly Payment Calculator - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverFinancePrequalify(){
        HoverOverFinancePage hoverOverFinancePage = new HoverOverFinancePage(getDriver());
        hoverOverFinancePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverFinancePage.clickLPrequalify();
        String expectedPageTitle = "Prequalify for New and Used Auto Loans - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverFinanceHowDoesItWork(){
        HoverOverFinancePage hoverOverFinancePage = new HoverOverFinancePage(getDriver());
        hoverOverFinancePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverFinancePage.clickHowDoesItWork();
        String expectedPageTitle = "Prequalify for New and Used Auto Loans - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverFinanceFinancingFAQS(){
        HoverOverFinancePage hoverOverFinancePage = new HoverOverFinancePage(getDriver());
        hoverOverFinancePage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverFinancePage.clickFinancingFAQS();
        String expectedPageTitle = "Prequalify for New and Used Auto Loans - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
