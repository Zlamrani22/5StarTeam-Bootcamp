package reporting.statefarm.investment;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.RealEstatePage;

public class RealEstatePlaning extends CommonAPI {
    @Test
    public void learAboutTrust(){
        RealEstatePage realEstate = new RealEstatePage(getDriver());
        realEstate.clickOnInvestment();
        realEstate.clickOnTrust();
        String text = realEstate.getHeaderText();
        Assert.assertEquals("What is a trust?", text);

    }

    @Test
    public void learnAboutFederalTax(){
        RealEstatePage realEstate = new RealEstatePage(getDriver());
        realEstate.clickOnInvestment();
        realEstate.clickOnFederalTax();
        String text = realEstate.getHeaderTextTax();
        Assert.assertEquals("Federal estate taxes", text);

    }

    @Test
    public void learnAboutJoinAccount(){
        RealEstatePage realEstate = new RealEstatePage(getDriver());
        realEstate.clickOnInvestment();
        realEstate.clickOnJoinAccount();
        String expectedPageTitle = "Joint Tenancy | State Farm®";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

}
