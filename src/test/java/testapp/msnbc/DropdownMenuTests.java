package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.HomePage;
import pages.msnbc.MSNBCSearchPage;
import pages.msnbc.TvSchedulePage;

public class DropdownMenuTests extends CommonAPI {

   @Test
    public void dropdownMoreOptions(){
       HomePage homePage= new HomePage(getDriver());
       homePage.clickDropdownTab();
       homePage.viewHomePageDropdownOptions();

   }

   @Test
   public void searchAndEraseDropdownSearchTab(){
       HomePage homePage= new HomePage(getDriver());
       homePage.clickDropdownTab();
       Assert.assertTrue(isInteractable(homePage.dropDownTab));
       homePage.typeInDropdownSearchField("Mendi Hassan");
       clear(homePage.dropDownSearchField);
       homePage.typeInDropdownSearchField("Ayman");
       clear(homePage.dropDownSearchField);
       homePage.typeInDropdownSearchField("todays news");
       clear(homePage.dropDownSearchField);
   }

   @Test
   public void SearchEraseSearchAndEnterDropdownSearchTab(){
       HomePage homePage= new HomePage(getDriver());
       homePage.clickDropdownTab();
       Assert.assertTrue(isInteractable(homePage.dropDownTab));
       homePage.typeInDropdownSearchField("Mendi Hassan");
       clear(homePage.dropDownSearchField);
       homePage.typeInDropdownSearchField("Ayman");
       clear(homePage.dropDownSearchField);
       homePage.typeAndEnterInDropdownSearchField("todays news");
   }

   @Test
   public void enterTextInDropdownSearchAndPressEnter(){
       HomePage homePage= new HomePage(getDriver());
       homePage.clickDropdownTab();
       Assert.assertTrue(isInteractable(homePage.dropDownTab));
       homePage.typeAndEnterInDropdownSearchField("COVID");
       String pageTitle="Search news with the MSNBC archive - MSNBC";
       Assert.assertEquals(pageTitle,getPageTitle());
   }

   @Test
   public void enterTextInDropdownSearchAndFilterByDate(){
       HomePage homePage= new HomePage(getDriver());
       MSNBCSearchPage msnbcSearchPage= new MSNBCSearchPage(getDriver());
       homePage.clickDropdownTab();
       Assert.assertTrue(isInteractable(homePage.dropDownTab));
       homePage.typeAndEnterInDropdownSearchField("shows");
       msnbcSearchPage.clickSortByDropdown();
       msnbcSearchPage.clickDateOptionFromSortByDropdown();
       String result= "Sort by:\n" +
               "Date";
       Assert.assertEquals(result,msnbcSearchPage.displaySortByOptionSelected());


   }

   @Test
   public void enterTextInDropdownSearchAndFilterByDateThenRelevance(){
       HomePage homePage= new HomePage(getDriver());
       MSNBCSearchPage msnbcSearchPage= new MSNBCSearchPage(getDriver());
       homePage.clickDropdownTab();
       Assert.assertTrue(isInteractable(homePage.dropDownTab));
       homePage.typeAndEnterInDropdownSearchField("shows");
       msnbcSearchPage.clickSortByDropdown();
       msnbcSearchPage.clickDateOptionFromSortByDropdown();
       String result= "Sort by:\n" +
               "Date";
       Assert.assertEquals(result,msnbcSearchPage.displaySortByOptionSelected());
       msnbcSearchPage.clickSortByDropdown();
       Assert.assertTrue(isInteractable(homePage.dropDownTab));
       msnbcSearchPage.clickRelevanceOptionFromSortByDropdown();
       String resultText= "Sort by:\n" +
               "Relevance";
       Assert.assertEquals(resultText,msnbcSearchPage.displaySortByOptionSelected());
   }

   @Test
   public void inputTextDropdownSearchApplyDateFilterAndEraseText(){
       HomePage homePage= new HomePage(getDriver());
       MSNBCSearchPage msnbcSearchPage= new MSNBCSearchPage(getDriver());
       homePage.clickDropdownTab();
       Assert.assertTrue(isInteractable(homePage.dropDownTab));
       homePage.typeAndEnterInDropdownSearchField("shows");
       msnbcSearchPage.clickSortByDropdown();
       msnbcSearchPage.clickDateOptionFromSortByDropdown();
       String result= "Sort by:\n" +
               "Date";
       Assert.assertEquals(result,msnbcSearchPage.displaySortByOptionSelected());
       msnbcSearchPage.clearSearchField();
   }

   @Test
   public void typeInSearchFilterEraseTypeAgain(){
       HomePage homePage= new HomePage(getDriver());
       MSNBCSearchPage msnbcSearchPage= new MSNBCSearchPage(getDriver());
       homePage.clickDropdownTab();
       Assert.assertTrue(isInteractable(homePage.dropDownTab));
       homePage.typeAndEnterInDropdownSearchField("shows");
       msnbcSearchPage.clickSortByDropdown();
       msnbcSearchPage.clickDateOptionFromSortByDropdown();
       String result= "Sort by:\n" +
               "Date";
       Assert.assertEquals(result,msnbcSearchPage.displaySortByOptionSelected());
       msnbcSearchPage.clearSearchField();
       msnbcSearchPage.typeInSearchPageSearchField("Covid");
   }

    @Test
    public void tvScheduleTest(){
        HomePage homepage = new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        homepage.selectTvSchedule();
        tvSchedulePage.clickMonSchedule();
        //Assert.assertTrue();
        tvSchedulePage.clickTuesSchedule();
        tvSchedulePage.clickWedSchedule();
        tvSchedulePage.clickThurSchedule();
        tvSchedulePage.clickFriSchedule();
        tvSchedulePage.clickSatSchedule();
        tvSchedulePage.clickSunSchedule();
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleMondayTest(){
        HomePage homepage = new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        homepage.selectTvSchedule();
        tvSchedulePage.clickMonSchedule();
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleTuesdayTest(){
        HomePage homepage = new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        homepage.selectTvSchedule();
        tvSchedulePage.clickTuesSchedule();
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleWednesdayTest(){
        HomePage homepage = new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        homepage.selectTvSchedule();
        tvSchedulePage.clickWedSchedule();
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleThursdayTest(){
        HomePage homepage = new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        homepage.selectTvSchedule();
        tvSchedulePage.clickThurSchedule();
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleFridayTest(){
        HomePage homepage = new HomePage(getDriver());
        waitFor(1);
        homepage.clickDropdownTab();
        homepage.selectTvSchedule();
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        tvSchedulePage.clickFriSchedule();
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleSatrudayTest(){
        HomePage homepage = new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        homepage.selectTvSchedule();
        tvSchedulePage.clickSatSchedule();
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleSundayTest(){
        HomePage homepage = new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        homepage.selectTvSchedule();
        tvSchedulePage.clickSunSchedule();
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }



}
