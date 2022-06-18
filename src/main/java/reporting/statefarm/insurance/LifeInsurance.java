package reporting.statefarm.insurance;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.LifeInsurancePage;

public class LifeInsurance extends CommonAPI {

    @Test
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

    @Test
    public void getUniversalInsurance(){
        LifeInsurancePage lifeInsurancePage = new LifeInsurancePage(getDriver());
        lifeInsurancePage.clickOnInsurance();
        lifeInsurancePage.clickOnUniversalInsurance();
        waitFor(5);
        lifeInsurancePage.typeZipCode("11229");
        lifeInsurancePage.clickOnGoBtn();
        waitFor(3);
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }


}
