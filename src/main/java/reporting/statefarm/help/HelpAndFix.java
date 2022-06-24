package reporting.statefarm.help;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        helpAndFixPage.typePhoneNum("3459872332");
        helpAndFixPage.typeDateOfBirth("01021991");
        helpAndFixPage.typeEmail("tyrion60@gmail.com");
        helpAndFixPage.checkBox();
        }

        @Test
    public void forgetPassword(){
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
        helpAndFixPage.typeEmail("james10@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,800)", "");
        helpAndFixPage.checkBox();

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
        waitFor(3);
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        helpAndFixPage.clickOnSecurityAndFraud();
        helpAndFixPage.clickOnProtectYourself();

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
        waitFor(3);
        helpAndFixPage.clickOnMobileApp();

           }

           @Test
    public void generalFAQ(){
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

           }

          @Test
    public void DriveSafeProgram(){
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
        helpAndFixPage.clickOnDriveSafe();
        Assert.assertEquals("Drive Safe & Save™️ Mobile | State Farm®",getPageTitle());

           }

          @Test
    public void PrivacyPolicy(){
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
        helpAndFixPage.clickOnXbox();
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        helpAndFixPage.clickOnPrivacyPolicy();
        Assert.assertEquals("State Farm Privacy and Security | State Farm®",getPageTitle());
           }

    }
