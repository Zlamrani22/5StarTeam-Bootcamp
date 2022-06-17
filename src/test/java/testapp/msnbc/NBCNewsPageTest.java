package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
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

    @Test
    public void viewCovidDataNBCPage(){
        HomePage homepage = new HomePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        TvSchedulePage tvSchedulePage= new TvSchedulePage(getDriver());
        homepage.clickDropdownTab();
        nbcPage.clickNBCNewsLogo();
        switchTabs();
        waitFor(2);
        nbcPage.clickCovidTab();
        scrollToView(nbcPage.covidTwoWeekPercentageText);
        nbcPage.viewCovidTwoWeekPercentage();
        Assert.assertTrue(isPresent(nbcPage.covidTwoWeekPercentageText));
    }


}
