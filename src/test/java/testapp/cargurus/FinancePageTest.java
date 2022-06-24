package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.FinancePage;

public class FinancePageTest extends CommonAPI {

    @Test
    public void HoverOverFinanceLoanCalculator(){
        FinancePage financePage = new FinancePage(getDriver());
        financePage.hoverOverFloatingMenu(getDriver());
        financePage.clickLoanCalculator();
        String expectedPageTitle = "Car Loan Monthly Payment Calculator - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverFinancePrequalify(){
        FinancePage financePage = new FinancePage(getDriver());
        financePage.hoverOverFloatingMenu(getDriver());
        financePage.clickLPrequalify();
        String expectedPageTitle = "Prequalify for New and Used Auto Loans - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverFinanceHowDoesItWork(){
        FinancePage financePage = new FinancePage(getDriver());
        financePage.hoverOverFloatingMenu(getDriver());
        financePage.clickHowDoesItWork();
        String expectedPageTitle = "Prequalify for New and Used Auto Loans - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverFinanceFinancingFAQS(){
        FinancePage financePage = new FinancePage(getDriver());
        financePage.hoverOverFloatingMenu(getDriver());
        financePage.clickFinancingFAQS();
        String expectedPageTitle = "Prequalify for New and Used Auto Loans - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }



}
