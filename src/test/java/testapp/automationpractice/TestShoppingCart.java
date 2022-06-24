package testapp.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AutomationHomePage;
import pages.automationpractice.PrestaShopPage;
import pages.automationpractice.ShoppingCartPage;

import java.util.Iterator;
import java.util.Set;

public class TestShoppingCart extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TestShoppingCart.class);

    //this particular test has different issues everytime it gets run, they get fixed and
    //again the next time it runs will show different issues, such as staleElementException
    //and elementClickInterceptedException.
    @Test(enabled = false) //check1
    public void testAddItemsToCartOpenProceedToCheckOut() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickCartButton();
        Assert.assertEquals("Order - My Store", getPageTitle());
        shoppingCartPage.hoverOverDressesButton(getDriver());
        shoppingCartPage.clickCasualDressesButton();
        shoppingCartPage.clickGirlyStyleCheckBox();
        shoppingCartPage.clickPrintedDressGirlyStyle();
        Assert.assertEquals("Casual Dresses - My Store", getPageTitle());
        WebElement element = getDriver().findElement(By.cssSelector("a[class='button ajax_add_to_cart_button btn btn-default']"));
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].click();", element);
        //WebElement element = shoppingCartPage.clickAddToCartButton();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        //shoppingCartPage.clickProceedToCheckout();
        Assert.assertEquals("Casual Dresses - My Store", getPageTitle());
    }
    @Test(enabled = false)//check2
    public void testContactPrestaShopSupport() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        PrestaShopPage prestaShopPage = new PrestaShopPage(getDriver());
        automationHomePage.clickWomensCoatsAndJacketsButton();
        Assert.assertEquals("Create and build your online business with PrestaShop", getPageTitle());
        prestaShopPage.clickSupportLink();
        Assert.assertEquals("PrestaShop Support", getPageTitle());
    }
    @Test(enabled = false)//check3
    public void testProcessShoppingCart() {
        AutomationHomePage homepage = new AutomationHomePage(getDriver());
        homepage.clickCartButton();
        String expectedPageTitle = "Order - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
}
