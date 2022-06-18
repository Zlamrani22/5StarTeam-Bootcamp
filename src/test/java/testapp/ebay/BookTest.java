package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.BookPage;
import pages.ebay.HomePage;
//import pages.ebay.BookPage;


public class BookTest extends CommonAPI {
    @Test
    public void BookTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Book");
        BookPage bookPage = new BookPage(getDriver());
        bookPage.clickbookbutton();
        waitFor(1);
        homePage.clickSearch();
        String expectBook = "ebay.com :Book";
        Assert.assertEquals(expectBook, (getPageTitle()));
    }
}


//        public void testBook() {
//            BookPage bookPage = new BookPage(getDriver());
//            bookPage.clickBook();
//
//            String expectBook = "ebay.com :Book";
//            Assert.assertEquals(expectBook, getPageTitle());
//        }
//
//
//    }


