package testapp.statefarm.investment;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.EducationSavingPage;

public class EducationSaving extends CommonAPI {

    @Test
    public void SavingForCollege(){
        EducationSavingPage education = new EducationSavingPage(getDriver());
        education.clickOnInvestment();
        education.clickOnSavingForCollege();
        waitFor(5);
        education.clickOnXbox();
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
