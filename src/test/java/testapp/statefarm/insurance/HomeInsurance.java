package testapp.statefarm.insurance;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.HomeInsurancePage;

public class HomeInsurance extends CommonAPI {

    @Test
    public void getHomeInsurance() {
        HomeInsurancePage homeInsurancePage = new HomeInsurancePage(getDriver());
        homeInsurancePage.clickOnInsurance();
        homeInsurancePage.clickOnHome();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,800)", "");
        homeInsurancePage.typeInZipCode("11218");
        homeInsurancePage.clickOnStartQuote();
        String expectedPageTitle = "Home and Property Insurance | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        waitFor(5);
    }

    @Test
    public void getArticleInsurance(){
        HomeInsurancePage homeInsurancePage = new HomeInsurancePage(getDriver());
        homeInsurancePage.clickOnInsurance();
        homeInsurancePage.clickOnPersonalArticles();
        homeInsurancePage.typeZip("23456");
        homeInsurancePage.clickOnFindAgent();
        //homeInsurancePage.clickOnFindAgent();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void farmAndRanchInsurance(){
        HomeInsurancePage homeInsurancePage = new HomeInsurancePage(getDriver());
        homeInsurancePage.clickOnInsurance();
        homeInsurancePage.clickOnFarmAndRanch();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,200)", "");
        homeInsurancePage.typeZip("11002");
        homeInsurancePage.clickOnFindAgent();
        String expectedPageTitle = "Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());


    }
}
