package testapp.statefarm.insurance;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.AutoInsurancePage;
import pages.statefarm.LifeInsurancePage;

public class AutoInsurance extends CommonAPI {

    //@Test
    public void getMotorcycleInsurance(){
        AutoInsurancePage autoInsurancePage = new AutoInsurancePage(getDriver());
        autoInsurancePage.clickOnInsurance();
        autoInsurancePage.clickOnMotorcycle();
        autoInsurancePage.type("23456");
        autoInsurancePage.clickOnFindAgent();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    //@Test
    public void getBoatInsurance(){
        AutoInsurancePage autoInsurancePage = new AutoInsurancePage(getDriver());
        autoInsurancePage.clickOnInsurance();
        autoInsurancePage.clickOnBoat();
        autoInsurancePage.type("11000");
        autoInsurancePage.clickOnFindAgent();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void getTrailerInsurance(){
        AutoInsurancePage autoInsurancePage = new AutoInsurancePage(getDriver());
        autoInsurancePage.clickOnInsurance();
        autoInsurancePage.clickOnTrailer();
        waitFor(3);
        autoInsurancePage.clickOnXbox();
        autoInsurancePage.type("25089");
        autoInsurancePage.clickOnFindAgent();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
