package testapp.statefarm.insurance;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.HomeInsurancePage;

public class HomeInsurance extends CommonAPI {

    @Test
    public void getHomeInsurance() {
        HomeInsurancePage homeInsurancePage = new HomeInsurancePage(getDriver());
        homeInsurancePage.clickOnInsurance();
        homeInsurancePage.clickOnHome();
        homeInsurancePage.typeInZipCode("11219");
        homeInsurancePage.clickOnStartQuote();
        String expectedPageTitle = "Home Insurance | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(5);
    }

}
