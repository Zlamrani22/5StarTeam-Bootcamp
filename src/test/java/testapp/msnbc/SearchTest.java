package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.CareerSearchPage;
import pages.msnbc.ColumnistPage;
import pages.msnbc.HomePage;
import pages.msnbc.MorningJoePage;

public class SearchTest extends CommonAPI {

    @Test(enabled = false)
    public void columnistZeeshanTest10(){
        HomePage homePage= new HomePage(getDriver());
        ColumnistPage columnistPage= new ColumnistPage(getDriver());
        homePage.selectMSNBSDailyNews();
        columnistPage.showAllColumnistButton();
        columnistPage.clickZeeshanAleem();
        String expectedPageTitle= "MSNBC Author Zeeshan Aleem";
        Assert.assertEquals(expectedPageTitle,getPageTitle());
    }

    @Test(enabled = false)
    public void careerSearchTestIT(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.clickCareers());
        waitFor(1);
        careerSearchPage.searchButtonAndEnter("IT");
        String pageTitle= morningJoePage.viewResultsHeader();
        Assert.assertEquals("Showing results for:\n" +
                        "IT",pageTitle);
    }

    @Test(enabled = true)
    public void careerSearchAndErase(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.clickCareers());
        waitFor(1);
        careerSearchPage.searchButtonCareers("IT");
        careerSearchPage.clearSearchButton();
        careerSearchPage.searchButtonCareers("Automation Engineer");
        careerSearchPage.clearSearchButton();
        careerSearchPage.searchButtonCareers("marketing");

    }

}
