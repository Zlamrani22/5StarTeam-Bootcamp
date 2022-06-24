package reporting.statefarm.insurance;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.SmallBusinessInsurancePage;

public class SmallBusinessInsurance extends CommonAPI {

    @Test
    public void workerCompensation(){
        SmallBusinessInsurancePage smallBusiness = new SmallBusinessInsurancePage(getDriver());
        smallBusiness.clickOnInsurance();
        smallBusiness.clickOnWorkerCompensation();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        smallBusiness.clickOnHaveAgentContactMe();
        smallBusiness.typeFirstName("james");
        smallBusiness.typeLastName("bond");
        smallBusiness.typeEmail("jamesbond@gmail.com");
        String expectedPageTitle = "Small Business Insurance - Lead Generation Form | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

}
