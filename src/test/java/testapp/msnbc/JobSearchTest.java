package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import pages.msnbc.CareerSearchPage;
import pages.msnbc.HomePage;
import pages.msnbc.MorningJoePage;

public class JobSearchTest extends CommonAPI {


    //@Test
    public void careerSearchTestIT(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        String pageTitle= careerSearchPage.viewCareerResultsHeader();
        Assert.assertEquals("Showing results for:\n" +
                        "IT",pageTitle);
    }

    //@Test
    public void careerSearchAndErase(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonCareers("IT");
        careerSearchPage.clearSearchButton();
        careerSearchPage.searchButtonCareers("Automation Engineer");
        careerSearchPage.clearSearchButton();
        careerSearchPage.searchButtonCareers("marketing");

    }

    //@Test
    public void narrowCareerSearchByCareerLevel(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        String pageTitle= careerSearchPage.viewCareerResultsHeader();
        Assert.assertEquals("Showing results for:\n" +
                "IT",pageTitle);
        careerSearchPage.clickCareerLevelDropdown();
        waitFor(1);
        careerSearchPage.clickAllCareerLevelOptions();

    }

    //@Test
    public void chooseEntryLevelCareerlevel(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        String pageTitle= careerSearchPage.viewCareerResultsHeader();
        Assert.assertEquals("Showing results for:\n" +
                "IT",pageTitle);
        //scrollToView(careerSearchPage.searchFieldViewForScroll);
        careerSearchPage.clickCareerLevelDropdown();
        careerSearchPage.clickEntryLevelCheckbox();
        waitFor(3);
        Assert.assertTrue(checkBoxIsChecked(careerSearchPage.entryLevelCheckBox));
        //scrollToView(careerSearchPage.applyFiltersCareerLevel);
        careerSearchPage.clickApplyFiltersCareerLevel();
    }

    //@Test
    public void selectAutoSuggestOptionAutomationEngineer(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.clearJobSearchField();
        careerSearchPage.chooseFromAutoSuggestList("Auto","Automation Engineer");
        Assert.assertTrue(careerSearchPage.automationEngineerIsClicked());
    }

    //@Test
    public void selectOptionAutomationEngineer(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.chooseFromAutoSuggestList("Automation Engineer","Automation Engineer");
        waitFor(2);
        String text= "Showing results for:\n" +
                "Automation Engineer";
        Assert.assertEquals(careerSearchPage.viewCareerResultsHeader(),text);
    }

    //@Test
    public void viewResultsForAutomationEngineerInNewJersey(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.viewCareersButton());
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.typeInJobSearchField("Automation Engineer");
        careerSearchPage.enterLocationInCareerSearchField("New Jersey, United States");
        waitFor(1);
        careerSearchPage.clickSearchArrow();
        waitFor(2);
        Assert.assertEquals("Showing results for:\n" +
                "Automation Engineer \n" +
                "New Jersey, United States",careerSearchPage.viewCareerResultsHeader());
    }

    //@Test
    public void viewRemoteJobsForITAndInputAutomationEngineerInSearch(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.typeInJobSearchField("Automation Engineer");
        careerSearchPage.clickRemoteCheckbox();
        waitFor(2);
        String text= "Showing results for:\n" +
                "IT\n" +
                "Remote Jobs";
        Assert.assertEquals(text,careerSearchPage.viewCareerResultsHeader());
    }

   // @Test
    public void viewRemoteJobsForAutomationEngineer(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.clickFindJobArrow();
        careerSearchPage.typeAndPressEnterInJobSearchField("Automation Engineer");
        careerSearchPage.clickRemoteCheckbox();
        waitFor(2);
        String text= "Showing results for:\n" +
                "Automation Engineer\n" +
                "Remote Jobs";
        Assert.assertEquals(text,careerSearchPage.viewCareerResultsHeader());
    }

    //@Test
    public void selectRemoteAndThenUnselect(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.clickRemoteCheckbox();
        Assert.assertTrue(checkBoxIsChecked(careerSearchPage.remoteCheckboxButton));
        careerSearchPage.clickRemoteCheckbox();
        Assert.assertFalse(checkBoxIsChecked(careerSearchPage.remoteCheckboxButton));

    }

    //@Test
    public void selectTechnologyAndEngineeringInBusinessesMenu(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        //scrollToView(morningJoePage.viewCareersButton());
        waitFor(1);
        morningJoePage.clickCareersButton();
        careerSearchPage.clickFindJobArrow();
        careerSearchPage.clickBusinessesCollapsableOption();
        Assert.assertTrue(isInteractable(careerSearchPage.businessesCollapsableOptions));
        careerSearchPage.viewBusinessesOptionsHeader();
        //scrollToView(careerSearchPage.operationsTechnologyOptionUnderBusinesses);
        careerSearchPage.clickOperationsTechnologyOptionUnderBusinesses();
        Assert.assertTrue(isInteractable(careerSearchPage.operationsTechnologyOptionUnderBusinesses));
        careerSearchPage.clickOperationsOptionUnderOperationsAndTechnology();
        Assert.assertTrue(checkBoxIsChecked(careerSearchPage.operationsOptionUnderOperationsTechnology));




    }








}
