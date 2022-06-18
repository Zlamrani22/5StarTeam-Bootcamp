package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.SearchNewCarByBodyStyleAndPricePage;

public class SearchNewCarByBodyStyleAndPricePageTest extends CommonAPI {
        @Test
    public void searchNewSUV() {

        SearchNewCarByBodyStyleAndPricePage searchNewCarByBodyStyleAndPricePage = new SearchNewCarByBodyStyleAndPricePage(getDriver());
        searchNewCarByBodyStyleAndPricePage.clickNewCarPrice();
        waitFor(2);
        searchNewCarByBodyStyleAndPricePage.clickNewCarByBodyStylePrice();
        searchNewCarByBodyStyleAndPricePage.clickNewCarSUVPrice();
        searchNewCarByBodyStyleAndPricePage.selectOptionFromNewCarMinimumPrice("8000");
        searchNewCarByBodyStyleAndPricePage.selectOptionFromNewCarMaximumPrice("40000");
        searchNewCarByBodyStyleAndPricePage.typeZipCodeNewCarByBodyStylePrice("66223");
        searchNewCarByBodyStyleAndPricePage.clickSearchNewCarByBodyStylePrice();
        String expectedPageTitle = "New SUV / Crossover for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void searchNewSUVl() {

        SearchNewCarByBodyStyleAndPricePage searchNewCarByBodyStyleAndPricePage = new SearchNewCarByBodyStyleAndPricePage(getDriver());
        searchNewCarByBodyStyleAndPricePage.clickNewCarPrice();
        waitFor(2);
        searchNewCarByBodyStyleAndPricePage.clickNewCarByBodyStylePrice();
        searchNewCarByBodyStyleAndPricePage.clickNewCarSUVPrice();
        searchNewCarByBodyStyleAndPricePage.selectOptionFromNewCarMinimumPrice("40000");
        searchNewCarByBodyStyleAndPricePage.typeZipCodeNewCarByBodyStylePrice("66223");
        searchNewCarByBodyStyleAndPricePage.clickSearchNewCarByBodyStylePrice();
        String expectedPageTitle = "New SUV / Crossover for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void searchNewSUVh() {

        SearchNewCarByBodyStyleAndPricePage searchNewCarByBodyStyleAndPricePage = new SearchNewCarByBodyStyleAndPricePage(getDriver());
        searchNewCarByBodyStyleAndPricePage.clickNewCarPrice();
        waitFor(2);
        searchNewCarByBodyStyleAndPricePage.clickNewCarByBodyStylePrice();
        searchNewCarByBodyStyleAndPricePage.clickNewCarSUVPrice();
        searchNewCarByBodyStyleAndPricePage.selectOptionFromNewCarMaximumPrice("160000");
        searchNewCarByBodyStyleAndPricePage.typeZipCodeNewCarByBodyStylePrice("66223");
        searchNewCarByBodyStyleAndPricePage.clickSearchNewCarByBodyStylePrice();
        String expectedPageTitle = "New SUV / Crossover for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }


}
