package testapp.statefarm.claims;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.ClaimsPage;

public class TypesOfClaims extends CommonAPI {

    @Test
    public void getRoadSideAssistance() {
        ClaimsPage claimsPage = new ClaimsPage(getDriver());
        claimsPage.clickOnClaim();
        claimsPage.clickOnRoadSideAssistance();
        String expectedPageTitle = "Get Roadside Assistance - State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        claimsPage.clickOnGetRoadSideAssistanceBtn();
        waitFor(3);
        String expectedPageTitle1 = "Emergency Roadside Service";
        Assert.assertEquals(expectedPageTitle1, getPageTitle());

    }

    @Test
    public void chatWithAgent(){
        ClaimsPage claimsPage = new ClaimsPage(getDriver());
        claimsPage.clickOnClaim();
        claimsPage.clickOnClaimHelp();
        waitFor(5);
        claimsPage.clickOnChat();
        claimsPage.typeAndEnter("Hi there, i would like to get a refund please");
        String expectedPageTitle1 = "Claims Help | State Farm®";
        Assert.assertEquals(expectedPageTitle1, getPageTitle());
    }
}
