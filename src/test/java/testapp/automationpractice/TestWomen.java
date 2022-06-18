package testapp.automationpractice;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.AutomationHomePage;
import pages.automationpractice.PrintedDressPage;
import pages.automationpractice.WomenPage;

import java.util.Iterator;
import java.util.Set;

public class TestWomen extends CommonAPI {

    @Test(enabled = false)//check1
    public void testCloseWindowPopup() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickWomenLink();
        WomenPage womenPage = new WomenPage(getDriver());
        womenPage.clickList();
        womenPage.clickFadedShortSleeveTShirt();
        Assert.assertEquals("Faded Short Sleeve T-shirts - My Store", getPageTitle());
        womenPage.clickFadedShortSleeveTShirtRightArrow();
        womenPage.clickBlueColoredFadedShortSleeveTShirt();
        Assert.assertEquals("Faded Short Sleeve T-shirts - My Store", getPageTitle());
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while (iterator.hasNext()) {
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        System.out.println("Successfully switched to child window" + childWindow);
        waitFor(5);
        womenPage.clickClose();
        Assert.assertEquals("Faded Short Sleeve T-shirts - My Store", getPageTitle());
    }
    @Test(enabled = false)//check2
    public void testVerifyPrintedChiffonDress() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickWomenLink();
        WomenPage womenPage = new WomenPage(getDriver());
        womenPage.clickList();
        womenPage.selectSmallCheckBox();
        womenPage.selectBlueColorLink();
        womenPage.clickGreenColorprintedChiffonDress();
        Assert.assertEquals("Printed Chiffon Dress - My Store", getPageTitle());
    }
    @Test(enabled = false)//check3
    public void testModifyCompositionToCotton() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        automationHomePage.clickWomenLink();
        WomenPage womenPage = new WomenPage(getDriver());
        womenPage.clickList();
        womenPage.selectSmallCheckBox();
        womenPage.selectBlueColorLink();
        womenPage.clickCottonCompositionCheckBox();
        womenPage.clickWhiteColorBlouse();

        String expectedPageTitle = "Blouse - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check4
    public void testSummerDresses() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        automationHomePage.clickWomenLink();
        womenPage.clickDresses();
        womenPage.clickSummerDresses();
        womenPage.clickMaxiDressCheckBox();
        womenPage.clickOrangeColorPrintedSummerDress();

        String expectedPageTitle = "Summer Dresses - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check5
    public void testColorfulDress() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        PrintedDressPage printedDressPage = new PrintedDressPage(getDriver());
        automationHomePage.clickWomenLink();
        womenPage.clickColorfulDressCheckBox();

        String expectedPageTitle = "Women - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check6
    public void testAvailabilityInStock() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        automationHomePage.clickWomenLink();
        womenPage.clickInStockCheckBox();

        String expectedPageTitle = "Women - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check7
    public void testConditionNew() {
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        automationHomePage.clickWomenLink();
        womenPage.clickNewLink();

        String expectedPageTitle = "Women - My Store";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }
    @Test(enabled = false)//check8
    public void testPinterest(){
        AutomationHomePage automationHomePage = new AutomationHomePage(getDriver());
        WomenPage womenPage = new WomenPage(getDriver());
        automationHomePage.clickWomen();
        womenPage.clickTopsCheckBox();
        womenPage.clickBlouseImage();
        //womenPage.clickPinterestLink();
        Assert.assertEquals("Tops - My Store", getPageTitle());
    }

}
