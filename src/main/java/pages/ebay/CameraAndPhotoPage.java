package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//public class CameraAndPhotoPage {
//    public CameraAndPhotoPage(WebDriver driver) {
//    }

    public class CameraAndPhotoPage extends CommonAPI {
        @FindBy(css = "input[id='gh-btn'] ")
        public WebElement cameraAndPhotoButton;

        public CameraAndPhotoPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


        public void clickcameraAndPhotobutton() {
            click(cameraAndPhotoButton);
        }
    }

//        @FindBy(css = "select [id='gh-cat']")
//        private List<WebElement> menuDropdownOptions;

//        public void selectOptionFromMenuDropdownWithGivenText(String option) {
//
//            List<WebElement> elements = menuDropdownOptions;
//
//            for (WebElement element : elements) {
//
//                if (element.getText().equalsIgnoreCase(option)) {
//
//                    element.click();
//
//                }
//
//            }
//
//        }
//    }

//public class CameraAndPhotoPage extends CommonAPI {
//
//    private final Logger LOG = LoggerFactory.getLogger(CameraAndPhotoPage.class);
//
//    @FindBy(css = " #gh-cat")
//    private WebElement menuDropdown;
//
//    @FindBy(xpath = " //select[@id='gh-cat']")
//    private WebElement searchField;
//
//    @FindBy(css = "#gh-btn")
//    private WebElement searchBtn;
//
//    public void clickSearchBtn() {
//        click(searchBtn);
//        LOG.info("click on search button success");
//    }
//}


