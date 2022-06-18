package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AutomationHomePage;
import pages.automationpractice.MyStorePage;
import pages.automationpractice.PrestaShopPage;

import java.util.Iterator;
import java.util.Set;

public class TestMyStore extends CommonAPI {

    @Test(enabled = true )//check1
    public void testCloseNewWindowMyStore(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        MyStorePage myStorePage = new MyStorePage(getDriver());
        automationHomePage.clickSaleImage();
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
    @Test(enabled = true )//check2
    public void testMyStoreStartNow(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        MyStorePage myStorePage = new MyStorePage(getDriver());
        automationHomePage.clickSaleImage();
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
    @Test(enabled = true )//failed3
    public void testMyStoreSignIn(){
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
        waitFor(5);
        myStorePage.clickMyStoreSingIn();
       // myStorePage.clickExploreFrontOffice();
        Assert.assertEquals("Sign in - My Store", getPageTitle());
    }
}
