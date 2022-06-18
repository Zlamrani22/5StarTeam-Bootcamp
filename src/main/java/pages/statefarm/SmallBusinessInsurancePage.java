package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmallBusinessInsurancePage extends CommonAPI {

    @FindBy(xpath = "//span[text()='Insurance']")
    private WebElement insurance;
    @FindBy(xpath = "//*[text()='Workers’ Compensation']")
    WebElement workersCompensation;
    @FindBy(xpath = "//*[text()=' Have an agent contact me']")
    WebElement haveAgentContactMe;
    @FindBy(xpath = "//*[@id='optclosebtn']/span")
    WebElement xBox;

    @FindBy(css = "#first-name")
    WebElement firstName;
    @FindBy(css = "#last-name")
    WebElement lastName;
    @FindBy(css = "#email")
    WebElement email;

    public SmallBusinessInsurancePage(WebDriver driver){PageFactory.initElements(driver, this);}


    public void clickOnInsurance(){click(insurance);}
    public void clickOnWorkerCompensation(){click(workersCompensation);}

    public void clickOnXbox(){click(xBox);}
    public void clickOnHaveAgentContactMe(){click(haveAgentContactMe);}
    public void typeFirstName(String first){type(firstName, first);}
    public void typeLastName(String last){type(lastName,last);}
    public void typeEmail(String eml){type(email, eml);}


}
