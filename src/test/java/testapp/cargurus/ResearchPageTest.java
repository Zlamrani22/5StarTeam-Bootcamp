package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.ResearchPage;


public class ResearchPageTest extends CommonAPI {

    @Test
    public void HoverOverTestDriveReviews() {
        ResearchPage researchPage = new ResearchPage(getDriver());
        researchPage.hoverOverFloatingMenu(getDriver());
        researchPage.clickTestDriveReviews();
        String expectedPageTitle = "Research New and Used Cars - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverPriceTrends() {
        ResearchPage researchPage = new ResearchPage(getDriver());
        researchPage.hoverOverFloatingMenu(getDriver());
        researchPage.clickPriceTrends();
        String expectedPageTitle = "Used Car Price Trends - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverTipsAdvice() {
        ResearchPage researchPage = new ResearchPage(getDriver());
        researchPage.hoverOverFloatingMenu(getDriver());
        researchPage.clickTipsAdvice();
        String expectedPageTitle = "Tips and Advice - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverGeneralQuestions() {
        ResearchPage researchPage = new ResearchPage(getDriver());
        researchPage.hoverOverFloatingMenu(getDriver());
        researchPage.clickGeneralQuestions();
        String expectedPageTitle = "All Car Questions - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
