package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.AddToCartStorePage;
import pages.msnbc.CareerSearchPage;
import pages.msnbc.HomePage;
import pages.msnbc.MSNBCSearchPage;

public class MultipleOpenTabsTest extends CommonAPI {


    @Test
    public void openNewTabApplyBusinessFilter(){
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        getNewTab();
        newURL("https://www.nbcunicareers.com/find-a-job");
        careerSearchPage.clickBusinessesCollapsableOption();
        clickAndHold(careerSearchPage.businessesOptionsheader);
        String title= "Filter Businesses";
        Assert.assertEquals(title,careerSearchPage.getBusinessHeaderText());
        moveToElementAndClick(careerSearchPage.applyFilters);
    }

    @Test
    public void openTwoNewTabs(){
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        AddToCartStorePage addToCartStorePage= new AddToCartStorePage(getDriver());
        getNewTab();
        newURL("https://www.nbcunicareers.com/find-a-job");
        careerSearchPage.clickBusinessesCollapsableOption();
        getNewTab();
        newURL("https://www.nbcstore.com/");
        scrollToView(addToCartStorePage.firstProductStorePage);
        switchTabs();

    }

    @Test
    public void switchBetweenTabsToCopyAndInputInformation(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage= new AddToCartStorePage(getDriver());
        MSNBCSearchPage msnbcSearchPage= new MSNBCSearchPage(getDriver());
        getNewTab();
        newURL("https://www.nbcstore.com/");
        scrollToView(addToCartStorePage.firstProductStorePage);
        String text=addToCartStorePage.copyNbcStoreFirstItemText();
        Assert.assertEquals(text,"The Office Dunder Mifflin Speckled Diner Mug\n" +
                "$19.95");
        switchTabs();
        homePage.clickDropdownTab();
        homePage.typeInDropdownSearchField(text);
        Assert.assertTrue(Boolean.parseBoolean(text),msnbcSearchPage.searchFieldTextDisplayed());

    }

    @Test
    public void openTwoNewTabsCopyTextPaste(){
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        AddToCartStorePage addToCartStorePage= new AddToCartStorePage(getDriver());
        getNewTab();
        newURL("https://www.nbcunicareers.com/find-a-job");
        careerSearchPage.clickBusinessesCollapsableOption();
        getNewTab();
        newURL("https://www.nbcstore.com/");
        scrollToView(addToCartStorePage.firstProductStorePage);
        String text=addToCartStorePage.copyNbcStoreFirstItemText();
        Assert.assertEquals(text,"The Office Dunder Mifflin Speckled Diner Mug\n" +
                "$19.95");
        switchTabs();
        careerSearchPage.clickJobSearchField();
        careerSearchPage.typeAndPressEnterInJobSearchField(text);
        Assert.assertEquals("Showing results for:\n" +
                "$19.95",careerSearchPage.viewCareerResultsHeader());

    }

    @Test
    public void openTwoNewTabsAnSwitchToHomePageTab(){
        CareerSearchPage careerSearchPage= new CareerSearchPage(getDriver());
        AddToCartStorePage addToCartStorePage= new AddToCartStorePage(getDriver());
        getNewTab();
        newURL("https://www.nbcunicareers.com/find-a-job");
        careerSearchPage.clickBusinessesCollapsableOption();
        getNewTab();
        newURL("https://www.nbcstore.com/");
        scrollToView(addToCartStorePage.firstProductStorePage);
        String text=addToCartStorePage.copyNbcStoreFirstItemText();
        Assert.assertEquals(text,"The Office Dunder Mifflin Speckled Diner Mug\n" +
                "$19.95");
        switchTabsAndCloseWhenSwitching();
        careerSearchPage.clickJobSearchField();
        careerSearchPage.typeAndPressEnterInJobSearchField(text);
        Assert.assertEquals("Showing results for:\n" +
                "$19.95",careerSearchPage.viewCareerResultsHeader());
        switchTabsAndCloseWhenSwitching();

    }










}
