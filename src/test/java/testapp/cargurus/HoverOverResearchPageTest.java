package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HoverOverResearchPage;


public class HoverOverResearchPageTest extends CommonAPI {

    @Test
    public void HoverOverTestDriveReviews() {
        HoverOverResearchPage hoverOverResearchPage = new HoverOverResearchPage(getDriver());
        hoverOverResearchPage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverResearchPage.clickTestDriveReviews();
        String expectedPageTitle = "Research New and Used Cars - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverPriceTrends() {
        HoverOverResearchPage hoverOverResearchPage = new HoverOverResearchPage(getDriver());
        hoverOverResearchPage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverResearchPage.clickPriceTrends();
        String expectedPageTitle = "Used Car Price Trends - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverTipsAdvice() {
        HoverOverResearchPage hoverOverResearchPage = new HoverOverResearchPage(getDriver());
        hoverOverResearchPage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverResearchPage.clickTipsAdvice();
        String expectedPageTitle = "Tips and Advice - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverGeneralQuestions() {
        HoverOverResearchPage hoverOverResearchPage = new HoverOverResearchPage(getDriver());
        hoverOverResearchPage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverResearchPage.clickGeneralQuestions();
        String expectedPageTitle = "All Car Questions - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
