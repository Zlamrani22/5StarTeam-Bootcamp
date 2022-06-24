package testapp.statefarm.search;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.statefarm.SearchPage;
import utility.ExcelReader;

import java.util.ArrayList;
import java.util.List;

import static utility.Utility.currentDir;

public class DifferentSearch extends CommonAPI {

    @Test
    public void searchUsBank() {
        SearchPage differentSearchPage = new SearchPage(getDriver());
        differentSearchPage.clickOnSearchBtn();
        differentSearchPage.typeOnSearchBox("Us Bank");
        differentSearchPage.clickOnSearchBtn1();
        String expectedPageTitle = "State Farm | Search";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        differentSearchPage.clickOnBusinessBank();
    }

    @Test
    public void searchAgent() {
        SearchPage differentSearchPage = new SearchPage(getDriver());
        differentSearchPage.clickOnSearchBtn();
        differentSearchPage.typeOnSearchBox("Find an agent");
        differentSearchPage.clickOnSearchBtn1();
        String expectedPageTitle = "State Farm | Search";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }

    @Test
    public void searchStateFarmAgency() {
        SearchPage differentSearchPage = new SearchPage(getDriver());
        differentSearchPage.clickOnSearchBtn();
        differentSearchPage.typeOnSearchBox("State Farm Agency");
        differentSearchPage.clickOnSearchBtn1();
        String expectedPageTitle = "State Farm | Search";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
      }

    public List<String> items(){
        List<String> items = new ArrayList<>();
        items.add("State Farm Agency");
        items.add("Find an agent");
        items.add("Us Bank");
        return items;
    }

   @Test
    public void searchMultipleItems() {
        SearchPage differentSearchPage = new SearchPage(getDriver());
        differentSearchPage.clickOnSearchBtn();
        differentSearchPage.typeOnSearchBox("state farm agency");
        differentSearchPage.clickOnSearchBtn1();
        differentSearchPage.clearSearchField();
        waitFor(3);
       for (String item : items()) {
          differentSearchPage.searchElementAndEnter(item);
           differentSearchPage.clearSearchField();
           waitFor(5);
          }
       }

    @Test
    public void dataDrivenTest1(){
        SearchPage differentSearchPage = new SearchPage(getDriver());
        differentSearchPage.clickOnSearchBtn();
        differentSearchPage.typeOnSearchBox("state farm");
        differentSearchPage.clickOnSearchBtn1();
        differentSearchPage.clearSearchField();
        ExcelReader excelReader = new ExcelReader(currentDir+"/data/TestData.xlsx");
        List <String> locations = excelReader.getEntireColumnForGivenHeader("Feuil1", "location");
        for (String location : locations) {
            differentSearchPage.searchElementAndEnter(location);
            waitFor(3);
            differentSearchPage.clearSearchField();
            waitFor(3);
            }

       }

       @Test
    public void dataDrivenTest2(){
           SearchPage differentSearchPage = new SearchPage(getDriver());
           differentSearchPage.clickOnSearchBtn();
           differentSearchPage.typeOnSearchBox("agent steven");
           differentSearchPage.clickOnSearchBtn1();
           differentSearchPage.clearSearchField();
           ExcelReader excelReader = new ExcelReader(currentDir+"/data/TestData.xlsx");
           List <String> employees = excelReader.getEntireColumnForGivenHeader("Feuil2", "employee");
           for (String employee : employees) {
               differentSearchPage.searchElementAndEnter(employee);
               waitFor(3);
               differentSearchPage.clearSearchField();
               waitFor(3);

           }

       }

    }






