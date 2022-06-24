package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HoverOverSellPage;

public class HoverOverSellPageTest extends CommonAPI {

    @Test
    public void HoverOverSellMyCar() {
        HoverOverSellPage hoverOverSellPage = new HoverOverSellPage(getDriver());
        hoverOverSellPage.hoverOverFloatingMenu(getDriver());
        hoverOverSellPage.clickSellMyCar();
        String expectedPageTitle = "Sell your car | It’s free & 100% online | CarGurus - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverCarValues() {
        HoverOverSellPage hoverOverSellPage = new HoverOverSellPage(getDriver());
        hoverOverSellPage.hoverOverFloatingMenu(getDriver());
        hoverOverSellPage.clickCarValues();
        String expectedPageTitle = "Car Values - What’s My Car Worth? - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverSellMyCarFAQ() {
        HoverOverSellPage hoverOverSellPage = new HoverOverSellPage(getDriver());
        hoverOverSellPage.hoverOverFloatingMenu(getDriver());
        hoverOverSellPage.clickSellMyCarFAQ();
        String expectedPageTitle = "Sell your car | It’s free & 100% online | CarGurus - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverDealerSignup() {
        HoverOverSellPage hoverOverSellPage = new HoverOverSellPage(getDriver());
        hoverOverSellPage.hoverOverFloatingMenu(getDriver());
        hoverOverSellPage.clickDealerSignup();
        String expectedPageTitle = "Request Dealer Account - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }


}
