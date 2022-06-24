package testapp.cargurus;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.SearchNewCarByBodyStylePage;



public class SearchNewCarByBodyStylePageTest extends CommonAPI {

    @Test
    public void searchNewSUV() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarSUV();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
       String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
    @Test
    public void searchNewSedan() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarSedan();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void searchNewPickupTruck() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarPickupTruck();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void searchNewCoupe() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarCoupe();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
   @Test
    public void searchNewHatchback() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarHatchback();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
   @Test
    public void searchNewConvertible() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarConvertible();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
       String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
       Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void searchNewWagon() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarWagon();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
        String expectedPageTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void searchNewMinivan() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarMinivan();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,1000)", "");
        searchNewCarByBodyStylePage.selectFromRadiusDropDown("100");
        String expectedPageTitle = "New Minivan for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }
    @Test
    public void SUVByPriceDrop() {

        SearchNewCarByBodyStylePage searchNewCarByBodyStylePage = new SearchNewCarByBodyStylePage(getDriver());
        searchNewCarByBodyStylePage.clickNewCar();
        searchNewCarByBodyStylePage.clickNewCarByBodyStyle();
        searchNewCarByBodyStylePage.clickNewCarSUV();
        searchNewCarByBodyStylePage.typeZipCodeNewCarByBodyStyle("66223");
        searchNewCarByBodyStylePage.clickSearchNewCarByBodyStyle();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,4000)", "");
        searchNewCarByBodyStylePage.clickDropPrice();
        String expectedPageTitle = "New SUV / Crossover for Sale in Overland Park, KS - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());



    }

}
