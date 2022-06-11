package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



    public class BookPage extends CommonAPI {

        @FindBy(css = "#gh-cat")
        private WebElement bookButton;

        public  BookPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        public void clickBook() {
            click(bookButton);
        }


    }

