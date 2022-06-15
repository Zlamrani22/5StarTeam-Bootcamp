package testapp.statefarm.insurance;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.LifeInsurancePage;

public class LifeInsurance extends CommonAPI {

    //@Test
    public void getLifeInsurance(){
        LifeInsurancePage lifeInsurancePage = new LifeInsurancePage(getDriver());
        lifeInsurancePage.clickOnInsurance();
        lifeInsurancePage.clickOnLife();
        lifeInsurancePage.selectFromDropDown("NY");
        lifeInsurancePage.clickOnGo();
        String expectedPageTitle = "Life Quote - State Farm";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(5);

    }




}
