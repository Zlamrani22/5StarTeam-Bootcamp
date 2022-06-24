package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.SearchNewCarByPricePage;

public class SearchNewCarByPricePageTest extends CommonAPI {
    @Test
    public void search() {

        SearchNewCarByPricePage searchNewCarByPricePage = new SearchNewCarByPricePage(getDriver());
        searchNewCarByPricePage.clickNewCar();
        searchNewCarByPricePage.clickNewCarByPrice();
        searchNewCarByPricePage.selectOptionFromNewCarMinPrice("8000");
        searchNewCarByPricePage.selectOptionFromNewCarMaxPrice("40000");
        searchNewCarByPricePage.typeNewCarByPriceZipCode("66223");
        searchNewCarByPricePage.clickNewCarByPriceSearchBtn();
       String expectedPageTitle = "New Cars For Sale. Find new cars in Overland Park, KS. - CarGurus";
       Assert.assertEquals(expectedPageTitle, getPageTitle());


    }
    @Test
    public void searchMax() {

        SearchNewCarByPricePage searchNewCarByPricePage = new SearchNewCarByPricePage(getDriver());
        searchNewCarByPricePage.clickNewCar();
        searchNewCarByPricePage.clickNewCarByPrice();
        searchNewCarByPricePage.selectOptionFromNewCarMaxPrice("40000");
        searchNewCarByPricePage.typeNewCarByPriceZipCode("66223");
        searchNewCarByPricePage.clickNewCarByPriceSearchBtn();
        String expectedPageTitle = "New Cars For Sale. Find new cars in Overland Park, KS. - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());

    }

    @Test
    public void searchMin() {

        SearchNewCarByPricePage searchNewCarByPricePage = new SearchNewCarByPricePage(getDriver());
        searchNewCarByPricePage.clickNewCar();
        searchNewCarByPricePage.clickNewCarByPrice();
        searchNewCarByPricePage.selectOptionFromNewCarMinPrice("1000");
        searchNewCarByPricePage.typeNewCarByPriceZipCode("66223");
        searchNewCarByPricePage.clickNewCarByPriceSearchBtn();
        String expectedPageTitle = "New Cars For Sale. Find new cars in Overland Park, KS. - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());


    }
}
