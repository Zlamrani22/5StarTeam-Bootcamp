package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationSavingPage extends CommonAPI {
    //saving for college
    @FindBy(xpath = "//ul[@class='-oneX-header-main-nav-menu']/li[3]")
    WebElement investments;
    @FindBy(xpath = "//a[text()='Saving for College']")
    WebElement savingForCollege;
    @FindBy(xpath = "//*[text()='Learn more about the State Farm']")
    WebElement learnMore;
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
    WebElement xBox;

    //state farm saving plan
    @FindBy(xpath = "//a[contains(text(),'State Farm® 529 Savings Plan')]")
    WebElement savingPlan;
    @FindBy(xpath = "//*[text()='Program Disclosure Statement']")
    WebElement ProgramAndDisclosure;

    public EducationSavingPage(WebDriver driver){PageFactory.initElements(driver, this);}

     //saving for college
    public void clickOnInvestment(){click(investments);}
    public void clickOnSavingForCollege(){click(savingForCollege);}
    public void clickOnLearnMore(){click(learnMore);}
    public void clickOnXbox(){click(xBox);}

    //state farm saving plan
    public void clickOnSavingPlan(){click(savingPlan);}
    public void clickOnProgramAndDisclosure(){click(ProgramAndDisclosure);}




}
