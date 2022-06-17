package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.BeatPage;
import pages.msnbc.ColumnistPage;
import pages.msnbc.DeadlinePage;
import pages.msnbc.HomePage;
import pages.msnbc.MaddowPage;
import pages.msnbc.MorningJoePage;
import pages.msnbc.ReidOutPage;

public class MainTabsTests extends CommonAPI {

        @Test
        public void homepageTabTest(){
            pages.msnbc.HomePage homepage= new pages.msnbc.HomePage(getDriver());
            pages.msnbc.ColumnistPage columnistPage= new pages.msnbc.ColumnistPage(getDriver());
            pages.msnbc.MaddowPage maddowPage= new MaddowPage(getDriver());
            pages.msnbc.MorningJoePage morningJoePage= new MorningJoePage(getDriver());
            pages.msnbc.DeadlinePage deadlinePage= new DeadlinePage(getDriver());
            pages.msnbc.BeatPage beatPage= new BeatPage(getDriver());
            pages.msnbc.ReidOutPage reidOutPage= new ReidOutPage(getDriver());
            homepage.clickColumnist();
            String text=columnistPage.columnistPageHeader();
            Assert.assertEquals("MSNBC Daily Columnists",text);
            homepage.clickMaddow();
            String text1="Rachel Maddow Show on MSNBC | Watch Rachel Maddow Live";
            Assert.assertEquals(text1,getPageTitle());
            homepage.clickMorningJoe();
            String title= "Morning Joe | MSNBC Morning Joe Live with Joe Scarborough";
            Assert.assertEquals(title,getPageTitle());
            homepage.clickDeadLine();
            String header= "Deadline: White House on MSNBC with Nicolle Wallace";
            Assert.assertEquals(header,getPageTitle());
            homepage.clickBeat();
            String title1= "The Beat With Ari Melber on MSNBC";
            Assert.assertEquals(title1,getPageTitle());
            homepage.clickReidout();
            String header1= "The ReidOut with Joy Reid on MSNBC | The Joy Reid Show";
            Assert.assertEquals(header1,getPageTitle());


        }

    //@Test
    public void columnistZeeshanTest10(){
        pages.msnbc.HomePage homePage= new HomePage(getDriver());
        pages.msnbc.ColumnistPage columnistPage= new ColumnistPage(getDriver());
        homePage.selectMSNBSDailyNews();
        columnistPage.showAllColumnistButton();
        columnistPage.clickZeeshanAleem();
        String expectedPageTitle= "MSNBC Author Zeeshan Aleem";
        Assert.assertEquals(expectedPageTitle,getPageTitle());
    }




}
