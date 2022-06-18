package reporting.statefarm.investment;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.RetirementPage;

import java.util.Iterator;
import java.util.Set;

public class Retirement extends CommonAPI {
    @Test
    public void retirementPlan() {
        RetirementPage retirementPage = new RetirementPage(getDriver());
        retirementPage.clickOnInvestment();
        retirementPage.clickOnRetirementPlaning();
        retirementPage.clickOnXbox();
        String text = retirementPage.getHeaderText();
        Assert.assertEquals("Retirement planning for all of life's stages", text);

      }
      @Test
    public void calculateRetirement(){
          RetirementPage retirementPage = new RetirementPage(getDriver());
          retirementPage.clickOnInvestment();
          retirementPage.clickOnTraditionalIra();
          retirementPage.clickOnCalculate();
          String expectedPageTitle = "Traditional IRA | State Farm®";
          Assert.assertEquals(expectedPageTitle, getPageTitle());
          Set<String> windows = getDriver().getWindowHandles();
          Iterator<String> iterator = windows.iterator();
          String childWindow = null;
          while(iterator.hasNext()){
              childWindow = iterator.next();
          }
          getDriver().switchTo().window(childWindow);
          retirementPage.clickClose();
          Assert.assertEquals("Traditional vs Roth IRA Calculator",getPageTitle());
      }
   }
