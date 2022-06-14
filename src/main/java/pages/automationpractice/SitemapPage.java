package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SitemapPage extends CommonAPI {

    @FindBy(css = "a[title='View a list of suppliers']")
    public WebElement suppliersLink;

    @FindBy(css = "a[title='View a list of manufacturers']")
    public WebElement manufacturersLink;

    @FindBy(css = "a[title='View products with a price drop']")
    public WebElement priceDropsLink;

    @FindBy(css = "a[title='View a list of my addresses']")
    public WebElement myAddressesLink;

    @FindBy(css = "a[title='View a new product']")
    public WebElement newProductsLink;

    @FindBy(css = "a[title='All specials']")
    public WebElement allSpecialsButton;

    @FindBy(xpath = "//*[@id='listpage_content']//div[2]//li[3]/a")
    public WebElement legalNoticeLink;

    @FindBy(css = "a[title='Manage your personal information']")
    public WebElement personalInformationLink;

    @FindBy(css = "input[id='id_gender2']")
    public WebElement socialTitleRadioButton;

    @FindBy(xpath = "//*[@id='old_passwd']")
    public WebElement currentPasswordInputField;

    @FindBy(css = "button[name='submitIdentity']")
    public WebElement saveSubmitIdentity;

    @FindBy(xpath = "//*[@id='listpage_content']//div[2]//li[6]/a")
    public WebElement securePaymentLink;

    @FindBy(xpath = "//*[@id='social_block']//li[1]/a")
    public WebElement facebookButton;

    public SitemapPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickSuppliers(){
        click(suppliersLink);
    }
    public void clickManufacturers(){
        click(manufacturersLink);
    }
    public void clickPriceDrop(){
        click(priceDropsLink);
    }
    public void clickMyAddressesLink(){
        click(myAddressesLink);
    }
    public void clickNewProducts(){
        click(newProductsLink);
    }
    public void clickAllSpecials(){
        click(allSpecialsButton);
    }
    public void clickLegalNotice(){
        click(legalNoticeLink);
    }
    public void clickPersonalInformation(){
        click(personalInformationLink);
    }
    public void clickSocialTitleRadioButton(){
        click(socialTitleRadioButton);
    }
    public void typeCurrentPassword(String currentPassword){
        type(currentPasswordInputField, currentPassword);
    }
    public void clickSaveSubmitIdentity(){
        click(saveSubmitIdentity);
    }
    public void clickSecurePaymentLink(){
        click(securePaymentLink );
    }
    public void clickFacebookButton(){
        click(facebookButton );
    }
}
