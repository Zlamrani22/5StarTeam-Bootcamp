package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.SearchNewCarByMakeAndModelPage;


public class SearchNewCarByMakeAndModelPageTest extends CommonAPI {
   @Test
    public void searchNewMercedesBenzGClass() {

        SearchNewCarByMakeAndModelPage SearchNewCarByMakeAndModelPage = new SearchNewCarByMakeAndModelPage(getDriver());
        SearchNewCarByMakeAndModelPage.clickNewCar();
        SearchNewCarByMakeAndModelPage.clickNewCarByMakeModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllMakes("Mercedes-Benz");
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllModels("G-Class");
        SearchNewCarByMakeAndModelPage.typeNewCarZipCodeByMakeAndModel("66223");
        SearchNewCarByMakeAndModelPage.clickNewCarSearchByMakeAndModel();
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void searchNewJeep() {

        SearchNewCarByMakeAndModelPage SearchNewCarByMakeAndModelPage = new SearchNewCarByMakeAndModelPage(getDriver());
        SearchNewCarByMakeAndModelPage.clickNewCar();
        SearchNewCarByMakeAndModelPage.clickNewCarByMakeModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllMakes("Jeep");
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllModels("Wrangler Unlimited 4xe");
        SearchNewCarByMakeAndModelPage.typeNewCarZipCodeByMakeAndModel("66223");
        SearchNewCarByMakeAndModelPage.clickNewCarSearchByMakeAndModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromSortListing("Closest first");
        String expectedPageTitle = "New Jeep Wrangler Unlimited 4xe for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void setupEmailAlertForPriceDrop() {

        SearchNewCarByMakeAndModelPage SearchNewCarByMakeAndModelPage = new SearchNewCarByMakeAndModelPage(getDriver());
        SearchNewCarByMakeAndModelPage.clickNewCar();
        SearchNewCarByMakeAndModelPage.clickNewCarByMakeModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllMakes("Jeep");
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllModels("Wrangler Unlimited 4xe");
        SearchNewCarByMakeAndModelPage.typeNewCarZipCodeByMakeAndModel("66223");
        SearchNewCarByMakeAndModelPage.clickNewCarSearchByMakeAndModel();
        SearchNewCarByMakeAndModelPage.typeEmail("larimus1987@outlook.com");
        SearchNewCarByMakeAndModelPage.clickEmailMe();
        String expectedPageTitle = "New Jeep Wrangler Unlimited 4xe for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void searchNewBlackJeep() {

        SearchNewCarByMakeAndModelPage SearchNewCarByMakeAndModelPage = new SearchNewCarByMakeAndModelPage(getDriver());
        SearchNewCarByMakeAndModelPage.clickNewCar();
        SearchNewCarByMakeAndModelPage.clickNewCarByMakeModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllMakes("Jeep");
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllModels("Wrangler Unlimited 4xe");
        SearchNewCarByMakeAndModelPage.typeNewCarZipCodeByMakeAndModel("66223");
        SearchNewCarByMakeAndModelPage.clickNewCarSearchByMakeAndModel();
        SearchNewCarByMakeAndModelPage.clickColorBlack();
        String expectedPageTitle = "New Jeep Wrangler Unlimited 4xe for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
    @Test
    public void searchNewJeepWithin200Miles() {

        SearchNewCarByMakeAndModelPage SearchNewCarByMakeAndModelPage = new SearchNewCarByMakeAndModelPage(getDriver());
        SearchNewCarByMakeAndModelPage.clickNewCar();
        SearchNewCarByMakeAndModelPage.clickNewCarByMakeModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllMakes("Jeep");
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllModels("Wrangler Unlimited 4xe");
        SearchNewCarByMakeAndModelPage.typeNewCarZipCodeByMakeAndModel("66223");
        SearchNewCarByMakeAndModelPage.clickNewCarSearchByMakeAndModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromRadius("200 mi");
        String expectedPageTitle = "New Jeep Wrangler Unlimited 4xe for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
    @Test
    public void searchNewCadillacEscalade() {

        SearchNewCarByMakeAndModelPage SearchNewCarByMakeAndModelPage = new SearchNewCarByMakeAndModelPage(getDriver());
        SearchNewCarByMakeAndModelPage.clickNewCar();
        SearchNewCarByMakeAndModelPage.clickNewCarByMakeModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllMakes("Cadillac");
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllModels("Escalade");
        SearchNewCarByMakeAndModelPage.typeNewCarZipCodeByMakeAndModel("66223");
        SearchNewCarByMakeAndModelPage.clickNewCarSearchByMakeAndModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromRadius("200 mi");
        String expectedPageTitle = "New Cadillac Escalade for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

}
