package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetirementPage  extends CommonAPI {

    //Retirement plan
    @FindBy(xpath = "//ul[@class='-oneX-header-main-nav-menu']/li[3]")
    WebElement investments;
    @FindBy(xpath = "//a[text()='Retirement Planning']")
    WebElement retirementPlaning;
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
    WebElement xBox;
    @FindBy(xpath = "//a[text()='Start now. Save more.']")
    WebElement startNow;
    @FindBy(xpath = "//h1[contains(text(),\"Retirement planning for all of life's stages\")]")
    WebElement headerText;

    //calculate retirement
    @FindBy(xpath = "//a[text()='Traditional IRA']")
    WebElement traditionalIra;
    @FindBy(xpath = "//a[text()='Calculator']")
    WebElement calculate;

    public RetirementPage(WebDriver driver){PageFactory.initElements(driver, this);}

    //Retirement plan
    public void clickOnInvestment(){click(investments);}
    public void clickOnRetirementPlaning(){click(retirementPlaning);}
    public void clickOnXbox(){click(xBox);}
    public String getHeaderText(){return getElementText(headerText);}

    //calculate retirement
    public void clickOnTraditionalIra(){click(traditionalIra);}
    public void clickOnCalculate(){click(calculate);}
    public void clickClose(){click();}
    private void click() {
    }


}
