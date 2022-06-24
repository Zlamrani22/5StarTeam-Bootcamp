package testapp.statefarm.insurance;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.HealthInsurancePage;

public class HealthInsurance extends CommonAPI {

   @Test
    public void medicalSupplement(){
        HealthInsurancePage health = new HealthInsurancePage(getDriver());
        health.clickOnInsurance();
        health.clickOnMedicalSupplement();
        health.selectFromDropDown("Texas");
        health.clickOnGoBtn();
        String expectedPageTitle = "Medicare Supplement Insurance | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void individualHealth(){
        HealthInsurancePage health = new HealthInsurancePage(getDriver());
        health.clickOnInsurance();
        health.clickOnIndividualMedical();
        health.selectFromStateDropDown("California");
        health.clickOnGoBox();
        String expectedPageTitle = "Medicare Supplement Insurance | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

}
