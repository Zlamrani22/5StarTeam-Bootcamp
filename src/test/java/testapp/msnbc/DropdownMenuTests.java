package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.HomePage;
import pages.msnbc.TvSchedulePage;

public class DropdownMenuTests extends CommonAPI {

   @Test
    public void dropdownMoreOptions(){
       HomePage homePage= new HomePage(getDriver());
       homePage.clickDropdownTab();
       homePage.viewHomePageDropdownOptions();

   }

    @Test
    public void tvScheduleTest(){
        HomePage homepage = new HomePage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        homepage.selectTvSchedule();
        tvSchedulePage.clickMonSchedule();
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
