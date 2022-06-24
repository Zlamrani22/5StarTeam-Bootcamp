package testapp.statefarm.insurance;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.AutoInsurancePage;
import pages.statefarm.LifeInsurancePage;

public class AutoInsurance extends CommonAPI {

    @Test
    public void getMotorcycleInsurance(){
        AutoInsurancePage autoInsurancePage = new AutoInsurancePage(getDriver());
        autoInsurancePage.clickOnInsurance();
        autoInsurancePage.clickOnMotorcycle();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        autoInsurancePage.type("11010");
        autoInsurancePage.clickOnFindAgent();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void getBoatInsurance(){
        AutoInsurancePage autoInsurancePage = new AutoInsurancePage(getDriver());
        autoInsurancePage.clickOnInsurance();
        autoInsurancePage.clickOnBoat();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
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
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        autoInsurancePage.type("23186");
        autoInsurancePage.clickOnFindAgent();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void getCarInsurance(){
        AutoInsurancePage autoInsurancePage = new AutoInsurancePage(getDriver());
        autoInsurancePage.clickOnInsurance();
        autoInsurancePage.clickOnCarInsurance();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        autoInsurancePage.typeZip("10020");
        autoInsurancePage.clickOnStartQuote();
        String expectedPageTitle = "Free Car Insurance Quote - Save on Auto Insurance | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void getMotorHomeInsurance(){
        AutoInsurancePage autoInsurancePage = new AutoInsurancePage(getDriver());
        autoInsurancePage.clickOnInsurance();
        autoInsurancePage.clickOnMotorHome();
        waitFor(3);
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        autoInsurancePage.type("11377");
        autoInsurancePage.clickOnFindAgent();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void getOffRoadVehicle(){
        AutoInsurancePage autoInsurancePage = new AutoInsurancePage(getDriver());
        autoInsurancePage.clickOnInsurance();
        autoInsurancePage.clickOnOffRoad();
        waitFor(3);
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        autoInsurancePage.type("25089");
        autoInsurancePage.clickOnFindAgent();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

}
