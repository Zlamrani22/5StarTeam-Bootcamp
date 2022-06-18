package reporting.statefarm.help;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.HelpAndFixPage;

import java.util.Iterator;
import java.util.Set;

public class HelpAndFix extends CommonAPI {
    @Test
    public void fixUserId() {
        HelpAndFixPage helpAndFixPage = new HelpAndFixPage(getDriver());
        helpAndFixPage.clickOnHelp();
        Set<String> windows = getDriver().getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String childWindow = null;
        while(iterator.hasNext()){
            childWindow = iterator.next();
        }
        getDriver().switchTo().window(childWindow);
        Assert.assertEquals("Customer Care | State Farm®",getPageTitle());
        helpAndFixPage.clickOnForgetUserId();
        helpAndFixPage.typePhoneNum("3459872332");
        helpAndFixPage.typeDateOfBirth("01021991");
        waitFor(5);
        helpAndFixPage.clickOnXbox();
        helpAndFixPage.typeEmail("tyrion60@gmail.com");

        }

        @Test
    public void forGetPassword(){
            HelpAndFixPage helpAndFixPage = new HelpAndFixPage(getDriver());
            helpAndFixPage.clickOnHelp();
            Set<String> windows = getDriver().getWindowHandles();
            Iterator<String> iterator = windows.iterator();
            String childWindow = null;
            while(iterator.hasNext()){
                childWindow = iterator.next();
            }
            getDriver().switchTo().window(childWindow);
            Assert.assertEquals("Customer Care | State Farm®",getPageTitle());
            helpAndFixPage.clickOnForgetPassword();
            helpAndFixPage.typePhoneNum("2016462090");
            helpAndFixPage.typeDateOfBirth("01101990");
            waitFor(5);
            helpAndFixPage.checkBox();
            helpAndFixPage.typeEmail("james10@gmail.com");
        }

        @Test
    public void protectAccount(){
            HelpAndFixPage helpAndFixPage = new HelpAndFixPage(getDriver());
            helpAndFixPage.clickOnHelp();
            Set<String> windows = getDriver().getWindowHandles();
            Iterator<String> iterator = windows.iterator();
            String childWindow = null;
            while(iterator.hasNext()){
                childWindow = iterator.next();
            }
            getDriver().switchTo().window(childWindow);
            Assert.assertEquals("Customer Care | State Farm®",getPageTitle());
            waitFor(5);
            helpAndFixPage.clickOnSecurityAndFraud();
            helpAndFixPage.clickOnProtectYourself();
            waitFor(5);

        }

           @Test
    public void downloadStatFarmApp(){
               HelpAndFixPage helpAndFixPage = new HelpAndFixPage(getDriver());
               helpAndFixPage.clickOnHelp();
               Set<String> windows = getDriver().getWindowHandles();
               Iterator<String> iterator = windows.iterator();
               String childWindow = null;
               while(iterator.hasNext()){
                   childWindow = iterator.next();
               }
               getDriver().switchTo().window(childWindow);
               Assert.assertEquals("Customer Care | State Farm®",getPageTitle());
               waitFor(5);
               helpAndFixPage.clickOnMobileApp();

           }

           @Test
    public void generalQuestion(){
               HelpAndFixPage helpAndFixPage = new HelpAndFixPage(getDriver());
               helpAndFixPage.clickOnHelp();
               Set<String> windows = getDriver().getWindowHandles();
               Iterator<String> iterator = windows.iterator();
               String childWindow = null;
               while(iterator.hasNext()){
                   childWindow = iterator.next();
               }
               getDriver().switchTo().window(childWindow);
               Assert.assertEquals("Customer Care | State Farm®",getPageTitle());
               helpAndFixPage.clickOnViewInsurance();
               helpAndFixPage.clickOnGeneralQuestions();
               waitFor(5);

           }

    }
