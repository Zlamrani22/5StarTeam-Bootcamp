package reporting.statefarm.investment;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.EducationSavingPage;

public class EducationSaving extends CommonAPI {

    @Test
    public void SavingForCollege(){
        EducationSavingPage education = new EducationSavingPage(getDriver());
        education.clickOnInvestment();
        education.clickOnSavingForCollege();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,800)", "");
        education.clickOnLearnMore();
        String expectedPageTitle = "State Farm 529 College Plans | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void StateFarmSavingPlan(){
        EducationSavingPage education = new EducationSavingPage(getDriver());
        education.clickOnInvestment();
        education.clickOnSavingPlan();
        education.clickOnProgramAndDisclosure();
        String expectedPageTitle = "State Farm 529 College Plans | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }


}
