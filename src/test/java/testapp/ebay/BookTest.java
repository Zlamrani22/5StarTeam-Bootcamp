package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
//import pages.ebay.BookPage;
import pages.ebay.TestHomePage;


public class BookTest extends CommonAPI {
    @Test
    public void BookTest() {
        TestHomePage testHomePage = new TestHomePage(getDriver());
        testHomePage.selectOptionFromMenuDropdownWithGivenText("Book");
        waitFor(1);
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


