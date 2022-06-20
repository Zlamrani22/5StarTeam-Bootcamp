package testapp.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AutomationHomePage;
import pages.automationpractice.MyStorePage;
import pages.automationpractice.PrestaShopPage;
import pages.msnbc.HomePage;

import java.util.Iterator;
import java.util.Set;

public class TestPrestaShopPage extends CommonAPI {

    @Test(enabled = true)//check1
    public void testLiveDemo(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        MyStorePage myStorePage = new MyStorePage(getDriver());
        automationHomePage.clickSaleImage();
        prestaShopPage.clickLiveDemo();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        Assert.assertEquals("PrestaShop Live Demo", getPageTitle());
    }

}
