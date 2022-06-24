package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.CareerSearchPage;
import pages.msnbc.HomePage;
import pages.msnbc.MorningJoePage;
import pages.msnbc.TvSchedulePage;

import java.io.IOException;

public class JobSearchTest extends CommonAPI {


   @Test
    public void careerSearchTestIT(){
        HomePage homePage= new HomePage(getDriver());
       TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
       CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
       homePage.clickDropdownTab();
       homePage.selectTvSchedule();
       moveToElementAndClick(tvSchedulePage.careersButton);
       careerSearchPage.searchButtonAndEnter("IT");
       String pageTitle= careerSearchPage.viewCareerResultsHeader();
       Assert.assertEquals("Showing results for:\n" + "IT",pageTitle);
    }

    @Test
    public void careerSearchAndErase(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        scrollToView(tvSchedulePage.careersButton);
        tvSchedulePage.clickCareersButton();
        careerSearchPage.searchButtonCareers("IT");
        careerSearchPage.clearSearchButton();
        careerSearchPage.searchButtonCareers("Automation Engineer");
        careerSearchPage.clearSearchButton();
        careerSearchPage.searchButtonCareers("marketing");

    }

    @Test
    public void narrowCareerSearchByCareerLevel(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        scrollToView(tvSchedulePage.careersButton);
        tvSchedulePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        String pageTitle= careerSearchPage.viewCareerResultsHeader();
        Assert.assertEquals("Showing results for:\n" +
                "IT",pageTitle);
        careerSearchPage.clickCareerLevelDropdown();
        waitUntilVisible(careerSearchPage.entryLevelCheckBox);
        careerSearchPage.clickCheckBoxEntryLevel();
        careerSearchPage.clickApplyFilters();
        waitUntilVisible(careerSearchPage.applyFilters);
    }

   @Test
    public void chooseEntryLevelCheckboxCareerlevel(){
        HomePage homePage= new HomePage(getDriver());
       TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
       CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
       homePage.clickDropdownTab();
       homePage.selectTvSchedule();
       moveToElementAndClick(tvSchedulePage.careersButton);
       tvSchedulePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        String pageTitle= careerSearchPage.viewCareerResultsHeader();
        Assert.assertEquals("Showing results for:\n" +
                "IT",pageTitle);
        scrollToView(careerSearchPage.searchFieldViewForScroll);
        careerSearchPage.clickCareerLevelDropdown();
        waitUntilVisible((careerSearchPage.entryLevelCheckBox));
        careerSearchPage.clickEntryLevelCheckbox();
        Assert.assertTrue(careerSearchPage.checkboxIsclicked());
    }

   @Test
    public void selectAutoSuggestOptionAutomationEngineer(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        scrollToView(tvSchedulePage.careersButton);
        tvSchedulePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.clickJobSearchField();
        careerSearchPage.typeAndPressEnterInJobSearchField("Auto");
        careerSearchPage.typeInJobSearchField("Auto");
        careerSearchPage.clickJobSearchField2();
        careerSearchPage.clickCareerLevelDropdown();
        careerSearchPage.clickJobSearchField();
        careerSearchPage.chooseFromAutoSuggestList("Automation Engineer");
        careerSearchPage.clickSearchEyeGlass();
        Assert.assertTrue(careerSearchPage.clickedAutomationEngineer());

    }

   @Test
    public void selectOptionAutomationEngineer(){
        HomePage homePage= new HomePage(getDriver());
        MorningJoePage morningJoePage= new MorningJoePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickMorningJoe();
        scrollToView(morningJoePage.viewCareersButton());
        morningJoePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.clearJobSearchField();
        careerSearchPage.typeAndPressEnterInJobSearchField("Automation Engineer");
        String text= "Showing results for:\n" +
                "Automation Engineer";
        Assert.assertEquals(careerSearchPage.viewCareerResultsHeader(),text);
    }

    @Test
    public void viewResultsForAutomationEngineerInNewJersey(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        scrollToView(tvSchedulePage.careersButton);
        tvSchedulePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.typeAndPressEnterInJobSearchField("Automation Engineer");
        careerSearchPage.enterLocationInCareerSearchField("New Jersey, United States");
        Assert.assertEquals("Showing results for:\n" +
                "Automation Engineer\n" +
                "New Jersey, United States",careerSearchPage.viewCareerResultsHeader());
    }

    @Test
    public void viewRemoteJobsForITAndSearchAutomationEngineer(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        scrollToView(tvSchedulePage.careersButton);
        tvSchedulePage.clickCareersButton();
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.typeInJobSearchField("Automation Engineer");
        careerSearchPage.clickRemoteCheckbox();
        String text= "Showing results for:\n" +
                "IT\n" +
                "Remote Jobs";
        Assert.assertEquals(text,careerSearchPage.viewCareerResultsHeader());
    }

   @Test
    public void viewRemoteJobsForAutomationEngineer(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        scrollToView(tvSchedulePage.careersButton);
        tvSchedulePage.clickCareersButton();
        careerSearchPage.clickFindJobArrow();
        careerSearchPage.typeAndPressEnterInJobSearchField("Automation Engineer");
        waitUntilClickAble(careerSearchPage.remoteCheckboxButton);
        careerSearchPage.clickRemoteCheckbox();
        String text= "Showing results for:\n" +
                "Automation Engineer\n" +
                "Remote Jobs";
        Assert.assertEquals(text,careerSearchPage.viewCareerResultsHeader());
    }

    @Test
    public void remoteCheckboxValidation(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        moveToElementAndClick(tvSchedulePage.careersButton);
        careerSearchPage.searchButtonAndEnter("IT");
        careerSearchPage.clickRemoteCheckbox();
        Assert.assertTrue(careerSearchPage.remoteCheckboxIsChecked());
        careerSearchPage.clickRemoteCheckbox();
        Assert.assertTrue(checkBoxIsUnchecked(careerSearchPage.remoteCheckboxButton));

    }

    @Test
    public void selectTechnologyInBusinessesMenu(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        moveToElementAndClick(tvSchedulePage.careersButton);
        careerSearchPage.clickFindJobArrow();
        careerSearchPage.clickBusinessesCollapsableOption();
        Assert.assertTrue(isInteractable(careerSearchPage.businessesCollapsableOptions));
        scrollToView(careerSearchPage.operationsTechnologyOptionUnderBusinesses);
        waitFor(2);
        careerSearchPage.clickOperationsTechnologyOptionUnderBusinesses();
        Assert.assertTrue(isInteractable(careerSearchPage.operationsTechnologyOptionUnderBusinesses));
    }

    @Test
    public void applyTechnologyFilterBusinessMenu(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        moveToElementAndClick(homePage.tvSchedule);
        moveToElementAndClick(tvSchedulePage.careersButton);
        waitUntilClickAble(careerSearchPage.findJobArrow);
        careerSearchPage.clickFindJobArrow();
        careerSearchPage.clickBusinessesCollapsableOption();
        moveToElementAndClick(careerSearchPage.operationsTechnologyOptionUnderBusinesses);
        moveToElementAndClick(careerSearchPage.applyFilters);
        Assert.assertTrue(isInteractable(careerSearchPage.applyFilters));

    }

    @Test
    public void clickAllCareerPageHeaderTabs(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        moveToElementAndClick(tvSchedulePage.careersButton);
        careerSearchPage.clickFindJobArrow();
        careerSearchPage.clickFindJobArrow();
        careerSearchPage.clickAllNavigationBarTabsCareers();
    }

    @Test
    public void viewAllFilterOptionsJobSearchPage(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        moveToElementAndClick(tvSchedulePage.careersButton);
        careerSearchPage.clickFindJobArrow();
        scrollToView(careerSearchPage.searchFieldViewForScroll);
        doubleClick(careerSearchPage.areaOfInterestCollapsibleOptions);
        doubleClick(careerSearchPage.allLocationsCollapsibleOptions);
        doubleClick(careerSearchPage.businessesCollapsableOptions);
        doubleClick(careerSearchPage.careerLevelCollapsibleOptions);
        }

    @Test
    public void selectAsiaPacificLocationCareersPage(){
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        moveToElementAndClick(tvSchedulePage.careersButton);
        careerSearchPage.clickFindJobArrow();
        scrollToView(careerSearchPage.searchFieldViewForScroll);
        careerSearchPage.clickAllLocations();
        clickAndHold(careerSearchPage.allLocationsCollapsibleOptions);
        careerSearchPage.clickAsiaPacificOptionLocations();
        clickAndHold(careerSearchPage.asiaPacificOptionAllLocations);


    }

    @Test
    public void iterateOverCareersFooterWeblinks() throws IOException {
        HomePage homePage= new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectTvSchedule();
        moveToElementAndClick(tvSchedulePage.careersButton);
        careerSearchPage.clickFindJobArrow();
        careerSearchPage.clickCareersTab();
        scrollToView(careerSearchPage.careersPageFooter);
        waitUntilVisible(careerSearchPage.careersPageFooter);
        careerSearchPage.iterateOverCareersFooterWeblinks();

    }

    @Test
    public void clickAllHeaderTabsCareersPageAndNavigateBack(){
        HomePage homePage= new HomePage(getDriver());
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        getNewTab();
        switchTabsAndCloseWhenSwitching();
        newURL("https://www.nbcunicareers.com/find-a-job");
        careerSearchPage.clickCareersTab();
        navigateBack();
        careerSearchPage.clickProgramsTab();
        navigateBack();
        careerSearchPage.clickInternshipsTab();
        navigateBack();
        careerSearchPage.clickBrandsTab();
        navigateBack();
        careerSearchPage.clickCultureTab();
        navigateBack();
        careerSearchPage.clickBenefitsTab();
        navigateBack();
        careerSearchPage.clickLocationsTab();
        navigateBack();
        careerSearchPage.clickFAQTab();
    }

}










