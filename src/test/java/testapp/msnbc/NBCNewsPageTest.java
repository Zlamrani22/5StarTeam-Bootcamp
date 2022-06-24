package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.HomePage;
import pages.msnbc.NBCPage;
import pages.msnbc.TvSchedulePage;

public class NBCNewsPageTest extends CommonAPI {

    @Test
    public void checkCovidTabOnNBCNewsPage() {
        HomePage homepage = new HomePage(getDriver());
        NBCPage nbcPage = new NBCPage(getDriver());
        TvSchedulePage tvSchedulePage = new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        nbcPage.clickNBCNewsLogo();
        switchTabs();
        nbcPage.clickCovidTab();

    }

    @Test
    public void viewCovidDataNBCPage() {
        HomePage homepage = new HomePage(getDriver());
        NBCPage nbcPage = new NBCPage(getDriver());
        TvSchedulePage tvSchedulePage = new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        nbcPage.clickNBCNewsLogo();
        switchTabs();
        nbcPage.clickCovidTab();
        switchFrames(0);
        scrollToView(nbcPage.viewCovidCasesColumn());
        nbcPage.viewCovidTwoWeekPercentage();
        Assert.assertTrue(isPresent(nbcPage.covidTwoWeekPercentageText));
    }

    @Test
    public void navigateBackToMSNBCAfterViewingCovidPercentageData() {
        HomePage homepage = new HomePage(getDriver());
        NBCPage nbcPage = new NBCPage(getDriver());
        TvSchedulePage tvSchedulePage = new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        nbcPage.clickNBCNewsLogo();
        switchTabs();
        nbcPage.clickCovidTab();
        switchFrames(0);
        scrollToView(nbcPage.viewCovidCasesColumn());
        nbcPage.viewCovidTwoWeekPercentage();
        Assert.assertTrue(isPresent(nbcPage.covidTwoWeekPercentageText));
        navigateBack();
        navigateBack();
    }

    @Test
    public void getNewYorkVaccinatePercentageFromCovidTable(){
        HomePage homePage= new HomePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
//        homePage.clickDropdownTab();
//        moveToElementAndClick(nbcPage.nbcLogoDropdownMenu);
//        nbcPage.clickNBCNewsLogo();
        getNewTab();
        newURL("https://www.nbcnews.com/health/coronavirus");
       // nbcPage.clickCovidTab();
        nbcPage.clickVaccine();
        switchFrames(1);
        scrollToView(nbcPage.covidDataTable);
        String text=nbcPage.getNewYorkCovidVaxPercentage();
        System.out.println(text);
        Assert.assertEquals(text,"75.9");
    }

    @Test
    public void getCovidTableHeader(){
        HomePage homePage= new HomePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        homePage.clickDropdownTab();
        moveToElementAndClick(nbcPage.nbcLogoDropdownMenu);
        nbcPage.clickNBCNewsLogo();
        nbcPage.clickCovidTab();
        nbcPage.clickVaccine();
        switchFrames(1);
        scrollToView(nbcPage.covidDataTable);
        String text=nbcPage.getCovidDataHeader();
        System.out.println(text);
        //Assert.assertEquals(text,"75.9");
    }

    @Test
    public void getTextSectionsDropdownOptionsNBC(){
        HomePage homePage= new HomePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        homePage.clickDropdownTab();
        moveToElementAndClick(nbcPage.nbcLogoDropdownMenu);
        nbcPage.clickNBCNewsLogo();
        nbcPage.clickNbcPageDropdownTab();
        String options= nbcPage.getTextSections();
        System.out.println(options);
    }

    @Test
    public void getTextTvOptionsDropdownNBC(){
        HomePage homePage= new HomePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        homePage.clickDropdownTab();
        moveToElementAndClick(nbcPage.nbcLogoDropdownMenu);
        nbcPage.clickNBCNewsLogo();
        nbcPage.clickNbcPageDropdownTab();
        String list= nbcPage.getTextTvSection();
        System.out.println(list);
    }

    @Test
    public void getTextFeaturedOptionsDropdownNBC(){
        HomePage homePage= new HomePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        homePage.clickDropdownTab();
        moveToElementAndClick(nbcPage.nbcLogoDropdownMenu);
        nbcPage.clickNBCNewsLogo();
        nbcPage.clickNbcPageDropdownTab();
        String features= nbcPage.getTextFeaturedSection();
        System.out.println(features);
    }

    @Test
    public void getTextMoreOptionsDropdownNBC(){
        HomePage homePage= new HomePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        homePage.clickDropdownTab();
        moveToElementAndClick(nbcPage.nbcLogoDropdownMenu);
        nbcPage.clickNBCNewsLogo();
        nbcPage.clickNbcPageDropdownTab();
        String more= nbcPage.getTextMoreSection();
        System.out.println(more);
    }



}



//    @Test
//    public void test(){
//
//        driver.get("https://www.nbcnews.com/health/health-news/map-covid-19-vaccination-tracker-across-u-s-n1252085");
//        driver.manage().window().maximize();
//        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//        int size = driver.findElements(By.tagName("iframe")).size();
//
//        for(int i=0; i<=size; i++){
//            driver.switchTo().frame(i);
//            int total=driver.findElements(By.xpath("html/body/a/img")).size();
//            System.out.println(total);
//            driver.switchTo().defaultContent();}
//    }



