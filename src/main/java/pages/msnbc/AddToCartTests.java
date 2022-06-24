package pages.msnbc;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AddToCartTests extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AddToCartTests.class);


    @Test
    public void addItemsToCart(){
        ExcelReader excelReader= new ExcelReader(currentDir+"data/testCasesData.xlsx");
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage = new AddToCartStorePage(getDriver());
        homePage.clickDropdownTab();
        waitUntilVisible(homePage.dropDownTab);
        homePage.selectStoreOptionFromMenu();
        scrollToView(addToCartStorePage.logoMug);
//        waitUntilVisible(addToCartStorePage.logoMug);
//        cancelAlert();
       // addToCartStorePage.selectLogoMug();
        moveToElementAndClick(addToCartStorePage.logoMug);
        waitFor(1);
//        String expectedText= excelReader.getDataFromCell("addToCart",2,1);
//        String actualTitle= getPageTitle();
//        Assert.assertEquals(expectedText,actualTitle);
        addToCartStorePage.addToCartBtn();
        waitFor(3);
        Assert.assertTrue(addToCartStorePage.checkoutPageLogoDisplayed());
        addToCartStorePage.checkoutBtn();
//        String pageTitle= excelReader.getDataFromCell("addToCart",4,2);
//        System.out.println(pageTitle);
       // String pageTitle= "Information - NBC Store - Checkout";
       // String actualTitle= getPageTitle();
       // System.out.println(actualTitle);
       // Assert.assertEquals(pageTitle,getPageTitle());
    }

    @Test
    public void addMultipleItemsToCart(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage = new AddToCartStorePage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectStoreOptionFromMenu();
        addToCartStorePage.selectLogoMug();
        String text= "MSNBC Logo Mug | NBC Store";
        Assert.assertEquals(text,getPageTitle());
      //  ExcelReader excelReader= new ExcelReader(currentDir+"data/testCasesData.xlsx");
       // String expectedText= excelReader.getDataFromCell("addToCart",2,1);
//        String actualTitle= getPageTitle();
//        Assert.assertEquals(expectedText,actualTitle);
        addToCartStorePage.addToCartBtn();
        Assert.assertTrue(addToCartStorePage.checkoutPageLogoDisplayed());
        navigateBack();
        addToCartStorePage.clickRachelMaddowLogoTee();
        String PageTitle= "The Rachel Maddow Show Logo Tee | The Shop at NBC Studios | NBC Store";
        Assert.assertEquals(PageTitle,getPageTitle());
      //  String PageTitle= excelReader.getDataFromCell("addToCart",5,1);
        //        Assert.assertEquals(PageTitle,getPageTitle());
        addToCartStorePage.addToCartBtn();
        Assert.assertTrue(addToCartStorePage.checkoutPageLogoDisplayed());
    }

    @Test
    public void hoverOverShopByProductHeaderAndClickAccessories(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage = new AddToCartStorePage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectStoreOptionFromMenu();
        hoverOver(addToCartStorePage.shopByProductButton);
        addToCartStorePage.clickAccessoriesInShopByProduct();
    }

    @Test
    public void hoverOverShopByShowSelectTheOffice(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage = new AddToCartStorePage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectStoreOptionFromMenu();
        hoverOver(addToCartStorePage.shopByShowHeaderTab);
        addToCartStorePage.clickTheOfficeUnderShopByShowHoverOverMenu();
    }

    @Test
    public void selectBagsCheckboxTheOfficeStorePage(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage = new AddToCartStorePage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectStoreOptionFromMenu();
        hoverOver(addToCartStorePage.shopByShowHeaderTab);
        addToCartStorePage.clickTheOfficeUnderShopByShowHoverOverMenu();
        addToCartStorePage.selectBagsCheckboxTheOfficeStorePage();
    }

    @Test
    public void clickDunderMufflinToteBagChangeQuantityThreeAddToCart(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage = new AddToCartStorePage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectStoreOptionFromMenu();
        hoverOver(addToCartStorePage.shopByShowHeaderTab);
        addToCartStorePage.clickTheOfficeUnderShopByShowHoverOverMenu();
        addToCartStorePage.selectBagsCheckboxTheOfficeStorePage();
        waitFor(1);
        addToCartStorePage.clickSortBy();
        addToCartStorePage.clickDunderMufflinToteBag();
        waitUntilVisible(addToCartStorePage.addToCart);
        addToCartStorePage.addToCartBtn();
        waitUntilVisible(addToCartStorePage.shoppingCartLogo);
        Assert.assertTrue(isPresent(addToCartStorePage.shoppingCartLogo));
    }
    @Test
    public void sortByBestSellingOfficeBags(){
        ExcelReader excelReader= new ExcelReader("C:\\Users\\sadaf\\eclipse-workspace\\Selenium\\data\\testCasesDataSaddif1.xlsx");
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage = new AddToCartStorePage(getDriver());
        homePage.clickDropdownTab();
        waitUntilVisible(homePage.storeMenuOption);
        homePage.selectStoreOptionFromMenu();
        hoverOver(addToCartStorePage.shopByShowHeaderTab);
        waitFor(1);
        addToCartStorePage.clickTheOfficeUnderShopByShowHoverOverMenu();
        addToCartStorePage.selectBagsCheckboxTheOfficeStorePage();
        waitFor(1);
        addToCartStorePage.clickSortBy();
        String option= excelReader.getDataFromCell("addToCart",5,1);
        System.out.println(option);
        addToCartStorePage.clickSortBy();
        addToCartStorePage.selectItemSortByDropdown(option);
        addToCartStorePage.clickDunderMufflinToteBag();
        String pageTitle="The Office Dunder Mifflin Tote Bag | The Shop at NBC Studios | NBC Store";
        Assert.assertEquals(getPageTitle(),pageTitle);
        waitFor(1);
        addToCartStorePage.addToCartBtn();
        waitFor(1);
        Assert.assertTrue(isPresent(addToCartStorePage.shoppingCartLogo));

    }

    @Test
    public void increaseBagQuantity(){
        ExcelReader excelReader= new ExcelReader("C:\\Users\\sadaf\\eclipse-workspace\\Selenium\\data\\testCasesDataSaddif1.xlsx");
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage = new AddToCartStorePage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectStoreOptionFromMenu();
        waitFor(2);
        hoverOver(addToCartStorePage.shopByShowHeaderTab);
        addToCartStorePage.clickTheOfficeUnderShopByShowHoverOverMenu();
        addToCartStorePage.selectBagsCheckboxTheOfficeStorePage();
        waitUntilClickAble(addToCartStorePage.storePageSortByDropdown);
        addToCartStorePage.clickSortBy();
        addToCartStorePage.clickDunderMufflinToteBag();
        String pageTitle="The Office Dunder Mifflin Tote Bag | The Shop at NBC Studios | NBC Store";
        Assert.assertEquals(getPageTitle(),pageTitle);
        waitFor(1);
        addToCartStorePage.addToCartBtn();
        waitFor(1);
        Assert.assertTrue(isPresent(addToCartStorePage.shoppingCartLogo));
        addToCartStorePage.increaseQuantityOnSelectedItem();

    }

    @Test
    public void increaseBagQuantityAndClickCheckout(){
        ExcelReader excelReader= new ExcelReader("C:\\Users\\sadaf\\eclipse-workspace\\Selenium\\data\\testCasesDataSaddif1.xlsx");
        HomePage homePage= new HomePage(getDriver());
        AddToCartStorePage addToCartStorePage = new AddToCartStorePage(getDriver());
        homePage.clickDropdownTab();
        homePage.selectStoreOptionFromMenu();
        hoverOver(addToCartStorePage.shopByShowHeaderTab);
        addToCartStorePage.clickTheOfficeUnderShopByShowHoverOverMenu();
        addToCartStorePage.selectBagsCheckboxTheOfficeStorePage();
        waitFor(1);
        addToCartStorePage.clickSortBy();
        addToCartStorePage.clickDunderMufflinToteBag();
        String pageTitle="The Office Dunder Mifflin Tote Bag | The Shop at NBC Studios | NBC Store";
        Assert.assertEquals(getPageTitle(),pageTitle);
        waitFor(1);
        addToCartStorePage.addToCartBtn();
        waitFor(2);
        Assert.assertTrue(isPresent(addToCartStorePage.shoppingCartLogo));
        addToCartStorePage.increaseQuantityOnSelectedItem();
        Assert.assertTrue(addToCartStorePage.itemIncreased());
        waitFor(1);
        addToCartStorePage.checkoutBtn();
        waitFor(2);
        String page= excelReader.getDataFromCell("addToCart",3,1);
        System.out.println(page);
       // System.out.println(getPageTitle());
       // Assert.assertEquals(page,getPageTitle());

    }
}
