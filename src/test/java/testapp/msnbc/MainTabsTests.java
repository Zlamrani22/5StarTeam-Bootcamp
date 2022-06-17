package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTabsTests extends CommonAPI {

        @Test
        public void homepageTabTest(){
            HomePage homepage= new HomePage(getDriver());
            ColumnistPage columnistPage= new ColumnistPage(getDriver());
            MaddowPage maddowPage= new MaddowPage(getDriver());
            MorningJoePage morningJoePage= new MorningJoePage(getDriver());
            DeadlinePage deadlinePage= new DeadlinePage(getDriver());
            BeatPage beatPage= new BeatPage(getDriver());
            ReidOutPage reidOutPage= new ReidOutPage(getDriver());
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






}
