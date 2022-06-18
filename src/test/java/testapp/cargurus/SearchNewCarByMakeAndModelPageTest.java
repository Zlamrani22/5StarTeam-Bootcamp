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
        waitFor(2);
        SearchNewCarByMakeAndModelPage.clickNewCarByMakeModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllMakes("Mercedes-Benz");
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllModels("G-Class");
        SearchNewCarByMakeAndModelPage.typeNewCarZipCodeByMakeAndModel("66223");
        SearchNewCarByMakeAndModelPage.clickNewCarSearchByMakeAndModel();
        String expectedPageTitle = "New Mercedes-Benz G-Class for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void searchNewJeep() {

        SearchNewCarByMakeAndModelPage SearchNewCarByMakeAndModelPage = new SearchNewCarByMakeAndModelPage(getDriver());
        SearchNewCarByMakeAndModelPage.clickNewCar();
        waitFor(2);
        SearchNewCarByMakeAndModelPage.clickNewCarByMakeModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllMakes("Jeep");
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllModels("Wrangler Unlimited 4xe");
        SearchNewCarByMakeAndModelPage.typeNewCarZipCodeByMakeAndModel("66223");
        SearchNewCarByMakeAndModelPage.clickNewCarSearchByMakeAndModel();
        String expectedPageTitle = "New Jeep Wrangler Unlimited 4xe for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        SearchNewCarByMakeAndModelPage.selectOptionFromSortListing("Closest first");
    }

    @Test
    public void searchNewJep() {

        SearchNewCarByMakeAndModelPage SearchNewCarByMakeAndModelPage = new SearchNewCarByMakeAndModelPage(getDriver());
        SearchNewCarByMakeAndModelPage.clickNewCar();
        waitFor(2);
        SearchNewCarByMakeAndModelPage.clickNewCarByMakeModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllMakes("Jeep");
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllModels("Wrangler Unlimited 4xe");
        SearchNewCarByMakeAndModelPage.typeNewCarZipCodeByMakeAndModel("66223");
        SearchNewCarByMakeAndModelPage.clickNewCarSearchByMakeAndModel();
        SearchNewCarByMakeAndModelPage.typeEmail("lari@gmail.com");
        SearchNewCarByMakeAndModelPage.clickEmailMe();
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
        waitFor(5);
    }
    @Test
    public void searchNewJeepNationWide() {

        SearchNewCarByMakeAndModelPage SearchNewCarByMakeAndModelPage = new SearchNewCarByMakeAndModelPage(getDriver());
        SearchNewCarByMakeAndModelPage.clickNewCar();
        SearchNewCarByMakeAndModelPage.clickNewCarByMakeModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllMakes("Jeep");
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllModels("Wrangler Unlimited 4xe");
        SearchNewCarByMakeAndModelPage.typeNewCarZipCodeByMakeAndModel("66223");
        SearchNewCarByMakeAndModelPage.clickNewCarSearchByMakeAndModel();
        waitFor(5);
    }
    @Test
    public void searchNewCadillacEscalade2021() {

        SearchNewCarByMakeAndModelPage SearchNewCarByMakeAndModelPage = new SearchNewCarByMakeAndModelPage(getDriver());
        SearchNewCarByMakeAndModelPage.clickNewCar();
        SearchNewCarByMakeAndModelPage.clickNewCarByMakeModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllMakes("Cadillac");
        SearchNewCarByMakeAndModelPage.selectOptionFromNewCarAllModels("Escalade");
        SearchNewCarByMakeAndModelPage.typeNewCarZipCodeByMakeAndModel("66223");
        SearchNewCarByMakeAndModelPage.clickNewCarSearchByMakeAndModel();
        SearchNewCarByMakeAndModelPage.selectOptionFromRadius("200 mi");
        waitFor(5);
    }

}
