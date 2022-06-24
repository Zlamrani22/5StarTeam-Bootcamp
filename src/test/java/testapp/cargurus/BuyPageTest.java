package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.BuyPage;

public class BuyPageTest extends CommonAPI {

    @Test
    public void HoverOverBuyUsedCar() {
        BuyPage buyPage = new BuyPage(getDriver());
        buyPage.hoverOverFloatingMenu(getDriver());
        buyPage.clickUsedCar();
        String expectedPageTitle = "Used Cars for Sale Near Me - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverBuyNewCar(){
        BuyPage buyPage = new BuyPage(getDriver());
        buyPage.hoverOverFloatingMenu(getDriver());
        buyPage.clickNewCar();
        String expectedPageTitle = "New Cars For Sale. Find new cars in your area. - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        }

    @Test
    public void HoverOverBuyCertifiedCars(){
        BuyPage buyPage = new BuyPage(getDriver());
        buyPage.hoverOverFloatingMenu(getDriver());
        buyPage.clickCertifiedCars();
        String expectedPageTitle = "Certified Pre-owned (CPO) Cars - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverBuyDealershipsNearMe(){
        BuyPage buyPage = new BuyPage(getDriver());
        buyPage.hoverOverFloatingMenu(getDriver());
        buyPage.clickDealershipsNearMe();
        String expectedPageTitle = "Used and new car dealers - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverBuyDelivery(){
        BuyPage buyPage = new BuyPage(getDriver());
        buyPage.hoverOverFloatingMenu(getDriver());
        buyPage.clickDelivery();
        String expectedPageTitle = "Get your next car delivered with CarGurus Delivery - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverBuyBuyingACarDuringCoronavirus(){
        BuyPage buyPage = new BuyPage(getDriver());
        buyPage.hoverOverFloatingMenu(getDriver());
        buyPage.clickBuyingACarDuringCoronavirus();
        String expectedPageTitle = "Buying a Car During Coronavirus - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

}
