package testapp.statefarm.socialMedia;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.contactStateFarmPage;

public class contactStateFarm extends CommonAPI {


    @Test
    public void StateFarmFacebook(){
       contactStateFarmPage socialMedia = new contactStateFarmPage(getDriver());
       JavascriptExecutor js = (JavascriptExecutor)getDriver();
       js.executeScript("window.scrollBy(0,8000)", "");
       socialMedia.clickOnFacebook();
       waitFor(3);
       String expectedPageTitle = "State Farm Auto Insurance & More for 100 Years. Get a Quote | State Farm®";
       Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void contactUs(){
        contactStateFarmPage socialMedia = new contactStateFarmPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,8000)", "");
        socialMedia.clickOnContactUs();
        String expectedPageTitle = "Contact Us - Customer Care | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void findJob(){
        contactStateFarmPage socialMedia = new contactStateFarmPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,8000)", "");
        socialMedia.clickOnCareer();
        JavascriptExecutor jsc = (JavascriptExecutor)getDriver();
        jsc.executeScript("window.scrollBy(0,500)", "");
        socialMedia.clickOnFindJob();
        String expectedPageTitle = "State Farm Careers Job Search - Jobs";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void contactRecruiter(){
        contactStateFarmPage socialMedia = new contactStateFarmPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,8000)", "");
        socialMedia.clickOnCareer();
        JavascriptExecutor jsc = (JavascriptExecutor)getDriver();
        jsc.executeScript("window.scrollBy(0,500)", "");
        socialMedia.clickOnContactRecruiter();
        String expectedPageTitle = "Contact an Agent Recruiter | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void summaryOfBenefits(){
        contactStateFarmPage socialMedia = new contactStateFarmPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,8000)", "");
        socialMedia.clickOnCareer();
        socialMedia.clickOnWorkingHere();
        socialMedia.clickOnBenefits();
        JavascriptExecutor jsc = (JavascriptExecutor)getDriver();
        jsc.executeScript("window.scrollBy(0,500)", "");
        socialMedia.clickOnSummary();
        waitFor(3);
        String expectedPageTitle ="Benefits | State Farm Careers";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void internShip(){
        contactStateFarmPage socialMedia = new contactStateFarmPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,8000)", "");
        socialMedia.clickOnCareer();
        socialMedia.clickOnWorkingHere();
        socialMedia.clickOnInternShip();
        String expectedPageTitle ="Internships | State Farm Careers";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void hoverOverJobMenu(){
        contactStateFarmPage socialMedia = new contactStateFarmPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,8000)", "");
        socialMedia.clickOnCareer();
        socialMedia.clickOnWorkingHere();
        socialMedia.clickOnBenefits();
        socialMedia.hoverOverJobMenu(getDriver());
        socialMedia.clickOnFinance();
        String expectedPageTitle ="Accounting & Financial | State Farm Careers";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

}
