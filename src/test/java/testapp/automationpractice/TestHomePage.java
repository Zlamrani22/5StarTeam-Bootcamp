package testapp.automationpractice;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.automationpractice.HomePage;

public class TestHomePage extends CommonAPI {

    @Test
    public void testSearchFunctionality(){
        HomePage homePage = new HomePage(getDriver());
        homePage.typeSearchInputField("shoes");
        homePage.clickSearchButton();
        //homePage.clickContactUsButton();
    }

}
