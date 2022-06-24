package testapp.cargurus;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.cargurus.SearchNewCarByBodyStylePage;



public class SearchNewCarByBodyStylePageTest extends CommonAPI {

    @Test
    public void searchNewSUV() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        waitFor(2);
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarSUV();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
    }
    @Test
    public void searchNewSedan() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        waitFor(2);
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarSedan();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
    }
    @Test
    public void searchNewPickupTruck() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        waitFor(2);
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarPickupTruck();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
    }
    @Test
    public void searchNewCoupe() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        waitFor(2);
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarCoupe();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
    }
    @Test
    public void searchNewHatchback() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        waitFor(2);
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarHatchback();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
    }
    @Test
    public void searchNewConvertible() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        waitFor(2);
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarConvertible();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
    }
    @Test
    public void searchNewWagon() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        waitFor(2);
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarWagon();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
    }
    @Test
    public void searchNewMinivan() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        waitFor(2);
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarMinivan();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
    }

}
