package testapp.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.msnbc.HomePage;
import pages.msnbc.NBCPage;
import pages.msnbc.VotePage;

public class VotePageTest extends CommonAPI {

    @Test
    public void ChooseNewJerseyFromStateDropdown(){
        HomePage homePage= new HomePage(getDriver());
        VotePage votePage= new VotePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        homePage.clickDropdownTab();
        moveToElementAndClick(nbcPage.nbcLogoDropdownMenu);
        nbcPage.clickPlanYourVoteTab();
        votePage.chooseStateFromDropdown("New Jersey");
        Assert.assertTrue(votePage.optionChosenStateDropdownText());

    }

    @Test
    public void EnterStateToSignUpForStateAlerts(){
        HomePage homePage= new HomePage(getDriver());
        VotePage votePage= new VotePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        homePage.clickDropdownTab();
        moveToElementAndClick(nbcPage.nbcLogoDropdownMenu);
        nbcPage.clickPlanYourVoteTab();
        votePage.chooseStateFromDropdown("New Jersey");
        Assert.assertTrue(votePage.optionChosenStateDropdownText());
        scrollToView(votePage.signUpAlertsHeader);
        votePage.enterStateForAlerts("New Jersey");
        String state="New Jersey";
        Assert.assertEquals(state, votePage.optionChosenStateDropdownText());

    }

    @Test
    public void EnterStateForAlertsAndSubmit(){
        HomePage homePage= new HomePage(getDriver());
        VotePage votePage= new VotePage(getDriver());
        NBCPage nbcPage= new NBCPage(getDriver());
        homePage.clickDropdownTab();
        moveToElementAndClick(nbcPage.nbcLogoDropdownMenu);
        nbcPage.clickPlanYourVoteTab();
        scrollToView(votePage.signUpAlertsHeader);
        votePage.enterStateForAlerts("New Jersey");
        String state="New Jersey";
        Assert.assertEquals(state, votePage.optionChosenStateDropdownText());
        votePage.clickSubmitButton();
    }








}
