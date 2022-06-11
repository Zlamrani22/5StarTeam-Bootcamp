package testapp.cargurus;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.cargurus.SearchPage;

public class SearchPageTest extends CommonAPI {

    @Test
    public void searchHondaAccord() {

        SearchPage searchpage = new SearchPage(getDriver());
        searchpage.clickOnUsedCar();
        //waitFor(5);
        searchpage.clickByMakeModel();
        searchpage.selectOptionFromAllMakes("Honda");
        searchpage.selectOptionFromAllModels("Accord");
        //searchpage.typeZipCode("66223");
        searchpage.clickOnSearchByMakeAndModel();
    }

    @Test
    public void searchHondaCivic() {

        SearchPage searchpage = new SearchPage(getDriver());
        searchpage.clickOnUsedCar();
        waitFor(5);
        searchpage.clickByMakeModel();
        searchpage.selectOptionFromAllMakes("Honda");
        searchpage.selectOptionFromAllModels("Civic");
        //searchpage.typeZipCode("66223");
        searchpage.clickOnSearchByMakeAndModel();


    }

    @Test
    public void searchHondaPilot() {

        SearchPage searchpage = new SearchPage(getDriver());
        searchpage.clickOnUsedCar();
        waitFor(5);
        searchpage.clickByMakeModel();
        searchpage.selectOptionFromAllMakes("Honda");
        searchpage.selectOptionFromAllModels("Pilot");
        //searchpage.typeZipCode("66223");
        searchpage.clickOnSearchByMakeAndModel();


    }

    @Test
    public void searchNewToyotaCamry() {

        SearchPage searchpage = new SearchPage(getDriver());
        searchpage.clickOnUsedCar();
        waitFor(5);
        searchpage.clickByMakeModel();
        searchpage.selectOptionFromAllMakes("Toyota");
        searchpage.selectOptionFromAllModels("Camry");
        //searchpage.typeZipCode("66223");
        searchpage.clickOnSearchByMakeAndModel();


    }

    @Test
    public void searchUsedSedan() {

        SearchPage searchpage = new SearchPage(getDriver());
        searchpage.clickOnUsedCar();
        waitFor(5);
        searchpage.clickByBodyStyle();
        searchpage.clickSedan();
        searchpage.typeZipBodyCode("66223");
        searchpage.clickOnSearchByBodyStyle();

    }


    @Test
    public void searchNewSedan() {

        SearchPage searchpage = new SearchPage(getDriver());
        searchpage.clickOnUsedCar();
        waitFor(5);
        searchpage.clickByBodyStyle();
        searchpage.clickSedan();
        searchpage.typeZipBodyCode("66223");
        searchpage.clickOnSearchByBodyStyle();


    }

    @Test
    public void searchMercedesBenzGClass() {

        SearchPage searchpage = new SearchPage(getDriver());
        SearchPage.clickOnUsedCar();
        waitFor(5);
        SearchPage.clickByMakeModel();
        SearchPage.selectOptionFromAllMakes("Mercedes-Benz");
        SearchPage.selectOptionFromAllModels("G-Class");
       //SearchPage.typeZipMakeModel("66223");
        //SearchPage.clickOnSearchByMakeModel();


    }

}