package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import pages.msnbc.HomePage;
import pages.msnbc.NBCPage;
import pages.msnbc.TvSchedulePage;

public class NBCNewsPageTest extends CommonAPI {

    //@Test
    public void checkCovidTabOnNBCNewsPage(){
        HomePage homepage = new HomePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        nbcPage.clickNBCNewsLogo();
        switchTabs();
        waitFor(2);
        nbcPage.clickCovidTab();

    }

    //@Test
    public void viewCovidDataNBCPage(){
        HomePage homepage = new HomePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        nbcPage.clickNBCNewsLogo();
        switchTabs();
        waitFor(2);
        nbcPage.clickCovidTab();
        waitFor(2);
        scrollToView(nbcPage.viewCovidCasesColumn());
        nbcPage.viewCovidTwoWeekPercentage();
        Assert.assertTrue(isPresent(nbcPage.covidTwoWeekPercentageText));
    }

    //@Test
    public void navigateBackToMSNBCAfterViewingCovidPercentageData(){
        HomePage homepage = new HomePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        nbcPage.clickNBCNewsLogo();
        switchTabs();
        waitFor(2);
        nbcPage.clickCovidTab();
        waitFor(2);
        scrollToView(nbcPage.viewCovidCasesColumn());
        nbcPage.viewCovidTwoWeekPercentage();
        Assert.assertTrue(isPresent(nbcPage.covidTwoWeekPercentageText));
        navigateBack();
        navigateBack();
    }

}
