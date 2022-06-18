package testapp.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HoverOverBuyPage;
import pages.cargurus.HoverOverFinancePage;

public class HoverOverBuyPageTest extends CommonAPI {

    @Test
    public void HoverOverBuyUsedCar() {
        HoverOverBuyPage hoverOverBuyPage = new HoverOverBuyPage(getDriver());
        hoverOverBuyPage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverBuyPage.clickUsedCar();
        String expectedPageTitle = "Used Cars for Sale Near Me - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverBuyNewCar(){
        HoverOverBuyPage hoverOverBuyPage = new HoverOverBuyPage(getDriver());
        hoverOverBuyPage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverBuyPage.clickNewCar();
        String expectedPageTitle = "New Cars For Sale. Find new cars in your area. - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        }

    @Test
    public void HoverOverBuyCertifiedCars(){
        HoverOverBuyPage hoverOverBuyPage = new HoverOverBuyPage(getDriver());
        hoverOverBuyPage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverBuyPage.clickCertifiedCars();
        String expectedPageTitle = "Certified Pre-owned (CPO) Cars - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverBuyDealershipsNearMe(){
        HoverOverBuyPage hoverOverBuyPage = new HoverOverBuyPage(getDriver());
        hoverOverBuyPage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverBuyPage.clickDealershipsNearMe();
        String expectedPageTitle = "Used and new car dealers - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverBuyDelivery(){
        HoverOverBuyPage hoverOverBuyPage = new HoverOverBuyPage(getDriver());
        hoverOverBuyPage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverBuyPage.clickDelivery();
        String expectedPageTitle = "Get your next car delivered with CarGurus Delivery - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test
    public void HoverOverBuyBuyingACarDuringCoronavirus(){
        HoverOverBuyPage hoverOverBuyPage = new HoverOverBuyPage(getDriver());
        hoverOverBuyPage.hoverOverFloatingMenu(getDriver());
        waitFor(3);
        hoverOverBuyPage.clickBuyingACarDuringCoronavirus();
        String expectedPageTitle = "Buying a Car During Coronavirus - CarGurus";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

}
