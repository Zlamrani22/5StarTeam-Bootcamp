package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class DVDAndMoviePage extends CommonAPI {

        //        private final Logger LOG = LoggerFactory.getLogger(HomePage.class);
        @FindBy(css = "#gh-cat")
        private WebElement dvdAndMovieButton;

        public  DVDAndMoviePage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickdvdAndMoviebutton() {
            click(dvdAndMovieButton);
        }
    }


