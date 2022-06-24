package testapp.statefarm.insurance;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
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
        String expectedPageTitle = "Life Insurance | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(3);

    }

    @Test
    public void getUniversalInsurance(){
        LifeInsurancePage lifeInsurancePage = new LifeInsurancePage(getDriver());
        lifeInsurancePage.clickOnInsurance();
        lifeInsurancePage.clickOnUniversalInsurance();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        lifeInsurancePage.typeZipCode("11229");
        lifeInsurancePage.clickOnGoBtn();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void changeBeneficiary(){
        LifeInsurancePage lifeInsurancePage = new LifeInsurancePage(getDriver());
        lifeInsurancePage.clickOnInsurance();
        lifeInsurancePage.clickOnChangeBeneficiary();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        lifeInsurancePage.typeZipCode("11204");
        lifeInsurancePage.clickOnGoBtn();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }


}
