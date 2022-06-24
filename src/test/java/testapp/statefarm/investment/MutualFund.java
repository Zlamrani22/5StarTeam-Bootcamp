package testapp.statefarm.investment;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.MutualFundPage;

public class MutualFund extends CommonAPI {

    @Test
    public void openIraFundAccount(){
        MutualFundPage mutualFundPage = new MutualFundPage(getDriver());
        mutualFundPage.clickOnInvestment();
        mutualFundPage.clickOnTypeOfAccounts();
        mutualFundPage.clickOnTraditionalIra();
        String text = mutualFundPage.getHeaderText();
        Assert.assertEquals("Traditional IRA", text);
    }

    @Test
    public void learnAboutFunds(){
        MutualFundPage mutualFundPage = new MutualFundPage(getDriver());
        mutualFundPage.clickOnInvestment();
        mutualFundPage.clickOnSelectFunds();
        String text = mutualFundPage.getHeaderTextFunds();
        Assert.assertEquals("Establishing your investment goals", text);

    }
}
