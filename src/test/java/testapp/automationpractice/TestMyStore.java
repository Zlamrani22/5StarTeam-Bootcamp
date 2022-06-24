package testapp.automationpractice;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AutomationHomePage;
import pages.automationpractice.MyStorePage;
import pages.automationpractice.PrestaShopPage;

import java.util.Set;

public class TestMyStore extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestMyStore.class);

    @Test(enabled = false)//check1
    public void testCloseNewWindowMyStore(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        automationHomePage.clickSaleImage();
        Assert.assertEquals("Create and build your online business with PrestaShop", getPageTitle());
        String parentWindowHandle = getDriver().getWindowHandle();
        System.out.println("Parent window handle: " + parentWindowHandle);
        prestaShopPage.clickLiveDemo();
        Set<String> windowHandles = getDriver().getWindowHandles();
        for(String handle: windowHandles){
            if(!handle.equals(parentWindowHandle)){
                getDriver().switchTo().window(handle);
                waitFor(15);
                System.out.println("New window title: " + getDriver().getTitle());
                System.out.println("Close new window");
            }
        }
    }
    @Test(enabled = false)//check2
    public void testMyStoreStartNow(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        MyStorePage myStorePage = new MyStorePage(getDriver());
        automationHomePage.clickSaleImage();
        Assert.assertEquals("Create and build your online business with PrestaShop", getPageTitle());
        String parentWindowHandle = getDriver().getWindowHandle();
        System.out.println("Parent window handle: " + parentWindowHandle);
        prestaShopPage.clickLiveDemo();
        Set<String> windowHandles = getDriver().getWindowHandles();
        for(String handle: windowHandles){
            if(!handle.equals(parentWindowHandle)){
                getDriver().switchTo().window(handle);
                waitFor(10);
                System.out.println("New window title: " + getDriver().getTitle());
            }
        }
        myStorePage.clickStartNow();
        Assert.assertEquals("PrestaShop Live Demo", getPageTitle());
    }
    @Test(enabled = false )//check3
    public void testSwitchToATabCloseItAndSwitchBackToParent() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        MyStorePage myStorePage = new MyStorePage(getDriver());
        automationHomePage.clickSaleImage();

        String parentWindowHandle = getDriver().getWindowHandle();
        System.out.println("Prent window handle: " + parentWindowHandle);
        prestaShopPage.clickLiveDemo();
        Set<String> windowHandles = getDriver().getWindowHandles();
        for(String handle: windowHandles){
            if(!handle.equals(parentWindowHandle)){
                getDriver().switchTo().window(handle);
                waitFor(10);

                System.out.println("New window title: " + getDriver().getTitle());
                System.out.println("Closing the new window...");
                getDriver().close();
                getDriver().switchTo().window(parentWindowHandle);
                System.out.println("Prent window url: " + getDriver().getCurrentUrl());
            }
        }
        Assert.assertEquals("Create and build your online business with PrestaShop", getPageTitle());
    }
}
