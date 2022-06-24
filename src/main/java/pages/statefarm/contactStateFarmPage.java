package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class contactStateFarmPage extends CommonAPI {

    //check facebook page
    @FindBy(xpath = "//a[contains(text(),'Facebook')]")
    WebElement facebook;

    //contact state farm
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/footer[1]/div[2]/div[1]/section[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement contactUs;

    //get a job with state farm
    @FindBy(xpath = "//a[contains(text(),'Careers at State Farm')]")
    WebElement career;
    @FindBy(xpath = "//a[contains(text(),'Find jobs')]")
    WebElement findJob;

    //contact a recruiter
    @FindBy(xpath = "//a[contains(text(),'Contact a recruiter')]")
    WebElement contactRecruiter;

    //benefits working with state farm
    @FindBy(xpath = "//*[text()='Working Here']")
    WebElement workingHere;
    @FindBy(css = "#oneX-1-Working_Here")
    WebElement benefits;
    @FindBy(xpath = "//*[text()='Benefits summary']")
    WebElement summary;

    //get internship with state farm
    @FindBy(css = "#oneX-4-Working_Here")
    WebElement internShip;

    //hover over
    @FindBy(xpath = "//div[contains(text(),'JOB CATEGORIES')]")
    WebElement jobMenu;
    @FindBy(xpath = "//body/div[@id='all-content']/section[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[2]/a[1]")
    WebElement finance;


    public contactStateFarmPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(contactStateFarmPage.class);

    //check facebook page
    public void clickOnFacebook(){click(facebook);
    LOG.info("click on facebook success");}

    //contact state farm
    public void clickOnContactUs(){click(contactUs);
        LOG.info("click on contact us success");}

    //get a job with state farm
    public void clickOnCareer(){click(career);
        LOG.info("click on career success");}
    public void clickOnFindJob(){click(findJob);
        LOG.info("click on find job success");}

    //contact a recruiter
    public void clickOnContactRecruiter(){click(contactRecruiter);
        LOG.info("click on contact recruiter success");}

    //benefits working with state farm
    public void clickOnWorkingHere(){click(workingHere);
        LOG.info("click on working here success");}
    public void clickOnBenefits(){click(benefits);
        LOG.info("click on benefits success");}
    public void clickOnSummary(){click(summary);
        LOG.info("click on summary success");}


    //get internship with state farm
    public void clickOnInternShip(){click(internShip);
        LOG.info("click on internship success");}

    //hover Over
    public void hoverOverJobMenu(WebDriver driver){hoverOver(driver, jobMenu);
        LOG.info("hover over job menu success");}
    public void clickOnFinance(){click(finance);
        LOG.info("click on finance success");}


}
