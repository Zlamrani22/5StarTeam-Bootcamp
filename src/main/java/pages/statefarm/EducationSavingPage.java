package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EducationSavingPage extends CommonAPI {
    //saving for college
    @FindBy(xpath = "//ul[@class='-oneX-header-main-nav-menu']/li[3]")
    WebElement investments;
    @FindBy(xpath = "//a[text()='Saving for College']")
    WebElement savingForCollege;
    @FindBy(xpath = "//*[text()='Learn more about the State Farm']")
    WebElement learnMore;

    //state farm saving plan
    @FindBy(xpath = "//a[contains(text(),'State Farm® 529 Savings Plan')]")
    WebElement savingPlan;
    @FindBy(xpath = "//*[text()='Program Disclosure Statement']")
    WebElement ProgramAndDisclosure;


    public EducationSavingPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(EducationSavingPage.class);


     //saving for college
    public void clickOnInvestment(){click(investments);
    LOG.info("click on investment success ");}
    public void clickOnSavingForCollege(){click(savingForCollege);
        LOG.info("click on saving for college success");}
    public void clickOnLearnMore(){click(learnMore);
        LOG.info("click on learn more success");}


    //state farm saving plan
    public void clickOnSavingPlan(){click(savingPlan);
        LOG.info("click on saving plan success");}
    public void clickOnProgramAndDisclosure(){click(ProgramAndDisclosure);
        LOG.info("click on program and disclosure success");}


}
