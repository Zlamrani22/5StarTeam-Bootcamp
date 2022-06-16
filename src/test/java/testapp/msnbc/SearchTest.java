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

    @Test(enabled = true)
    public void careerSearchTestIT(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        String pageTitle= careerSearchPage.viewCareerResultsHeader();
        Assert.assertEquals("Showing results for:\n" +
                        "IT",pageTitle);
    }

    @Test(enabled = false)
    public void careerSearchAndErase(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonCareers("IT");
        careerSearchPage.clearSearchButton();
        careerSearchPage.searchButtonCareers("Automation Engineer");
        careerSearchPage.clearSearchButton();
        careerSearchPage.searchButtonCareers("marketing");

    }

    //@Test
    public void selectAutoSuggestOptionAutomationEngineer(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
//        careerSearchPage.typeInJobSearchField("Automate");
        careerSearchPage.typeInJobSearchField("auto");
        careerSearchPage.chooseFromAutoSuggestList("Automation Engineer");
        waitFor(2);

       // careerSearchPage.autoSuggestCareerSearchField("Automa","Automation Engineer");
        waitFor(2);
        String text= "Showing results for:\n" +
                "Automation\n" +
                "Automation Engineer";
        Assert.assertEquals(careerSearchPage.viewCareerResultsHeader(),text);
    }

    //@Test
    public void selectOptionAutomationEngineer(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.typeInJobSearchField("Automation Engineer");
        careerSearchPage.chooseFromAutoSuggestList("Automation Engineer");
        waitFor(2);
        String text= "Showing results for:\n" +
                "Automation Engineer";
        Assert.assertEquals(careerSearchPage.viewCareerResultsHeader(),text);
    }

    @Test
    public void viewResultsForAutomationEngineerInNewJersey(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.typeInJobSearchField("Automation Engineer");
        careerSearchPage.enterLocationInCareerSearchField("New Jersey");
        waitFor(5);
        Assert.assertEquals("Showing results for:\n" +
                "Automation Engineer \n" +
                "New Jersey",careerSearchPage.viewCareerResultsHeader());
    }




}
