package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.SearchUsedCarPage;

public class SearchUsedCarPageTest extends CommonAPI {

    @Test
    public void searchHondaAccord() {
        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByMakeModel();
        searchUsedCarPage.selectOptionFromAllMakes("Honda");
        searchUsedCarPage.selectOptionFromAllModels("Accord");
        searchUsedCarPage.typeZipCodeByMakeAndModel("66223");
        searchUsedCarPage.clickSearchByMakeAndModel();
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void searchHondaCivic() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByMakeModel();
        searchUsedCarPage.selectOptionFromAllMakes("Honda");
        searchUsedCarPage.selectOptionFromAllModels("Civic");
        searchUsedCarPage.typeZipCodeByMakeAndModel("66223");
        searchUsedCarPage.clickSearchByMakeAndModel();
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());


    }

    @Test
    public void searchHondaPilot() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByMakeModel();
        searchUsedCarPage.selectOptionFromAllMakes("Honda");
        searchUsedCarPage.selectOptionFromAllModels("Pilot");
        searchUsedCarPage.typeZipCodeByMakeAndModel("66223");
        searchUsedCarPage.clickSearchByMakeAndModel();
        String expectedPageTitle = "Used Honda Pilot for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());


    }

    @Test
    public void searchToyotaCamry() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByMakeModel();
        searchUsedCarPage.selectOptionFromAllMakes("Toyota");
        searchUsedCarPage.selectOptionFromAllModels("Camry");
        searchUsedCarPage.typeZipCodeByMakeAndModel("66223");
        searchUsedCarPage.clickSearchByMakeAndModel();
        String expectedPageTitle = "Used Toyota Camry for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());


    }
    @Test
    public void searchMercedesBenzGClass() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByMakeModel();
        searchUsedCarPage.selectOptionFromAllMakes("Mercedes-Benz");
        searchUsedCarPage.selectOptionFromAllModels("G-Class");
        searchUsedCarPage.typeZipCodeByMakeAndModel("66223");
        searchUsedCarPage.clickSearchByMakeAndModel();
        String expectedPageTitle = "Used Mercedes-Benz G-Class for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());


    }
    @Test
    public void searchUsedSUV() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByBodyStyle();
        searchUsedCarPage.clickSUV();
        searchUsedCarPage.typeZipCodeBodyStyle("66223");
        searchUsedCarPage.clickSearchByBodyStyle();


    }

    @Test
    public void searchUsedSedan() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByBodyStyle();
        searchUsedCarPage.clickSedan();
        searchUsedCarPage.typeZipCodeBodyStyle("66223");
        searchUsedCarPage.clickSearchByBodyStyle();

    }

    @Test
    public void searchUsedPickUpTruck() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByBodyStyle();
        searchUsedCarPage.clickPickUpTruck();
        searchUsedCarPage.typeZipCodeBodyStyle("66223");
        searchUsedCarPage.clickSearchByBodyStyle();


    }
    @Test
    public void searchUsedCarByPrice2() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByPrice();
        searchUsedCarPage.selectOptionFromMinimumPrice("2000");
        searchUsedCarPage.selectOptionFromMaximumPrice("6000");
        searchUsedCarPage.typeZipCodeByPrice("66162");
        searchUsedCarPage.clickSearchByPrice();
        String expectedPageTitle = "Used Cars for Sale Near Me - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void searchUsedCoupe() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByBodyStyle();
        searchUsedCarPage.clickCoupe();
        searchUsedCarPage.typeZipCodeBodyStyle("66223");
        searchUsedCarPage.clickSearchByBodyStyle();
    }
    @Test
    public void searchUsedHatchback() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByBodyStyle();
        searchUsedCarPage.clickHatchback();
        searchUsedCarPage.typeZipCodeBodyStyle("66223");
        searchUsedCarPage.clickSearchByBodyStyle();
    }
    @Test
    public void searchUsedConvertible() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByBodyStyle();
        searchUsedCarPage.clickConvertible();
        searchUsedCarPage.typeZipCodeBodyStyle("66223");
        searchUsedCarPage.clickSearchByBodyStyle();
    }
    @Test
    public void searchUsedWagon() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByBodyStyle();
        searchUsedCarPage.clickWagon();
        searchUsedCarPage.typeZipCodeBodyStyle("66223");
        searchUsedCarPage.clickSearchByBodyStyle();
    }
    @Test
    public void searchUsedMinivan() {

        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByBodyStyle();
        searchUsedCarPage.clickMinivan();
        searchUsedCarPage.typeZipCodeBodyStyle("66223");
        searchUsedCarPage.clickSearchByBodyStyle();
    }
    @Test
    public void searchUsedCarByPrice() {
        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByPrice();
        searchUsedCarPage.selectOptionFromMinimumPrice("4000");
        searchUsedCarPage.selectOptionFromMaximumPrice("16000");
        searchUsedCarPage.typeZipCodeByPrice("66223");
        searchUsedCarPage.clickSearchByPrice();
        String expectedPageTitle = "Used Cars for Sale Near Me - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void searchUsedCarByPrice1() {
        SearchUsedCarPage searchUsedCarPage = new SearchUsedCarPage(getDriver());
        searchUsedCarPage.clickUsedCar();
        waitFor(2);
        searchUsedCarPage.clickByPrice();
        searchUsedCarPage.selectOptionFromMinimumPrice("8000");
        searchUsedCarPage.selectOptionFromMaximumPrice("26000");
        searchUsedCarPage.typeZipCodeByPrice("66062");
        searchUsedCarPage.clickSearchByPrice();
        String expectedPageTitle = "Used Cars for Sale Near Me - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }



}