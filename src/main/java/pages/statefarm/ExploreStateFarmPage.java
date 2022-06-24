package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ExploreStateFarmPage extends CommonAPI {


    //environment
    @FindBy(xpath = "//a[contains(text(),'Explore State Farm at 100 years')]")
    WebElement explore;
    @FindBy(xpath = "//ul[@class='navbar-nav ms-auto']/li[1]")
    WebElement environment;

    //community
    @FindBy(xpath = "//ul[@class='navbar-nav ms-auto']/li[2]")
    WebElement community;
    @FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]/a[1]")
    WebElement communityContacts;

    //company
    @FindBy(xpath = "//ul[@class='navbar-nav ms-auto']/li[3]")
    WebElement company;
    //media
    @FindBy(xpath = "//ul[@class='navbar-nav ms-auto']/li[4]")
    WebElement media;
    //archive
    @FindBy(xpath = "//ul[@class='navbar-nav ms-auto']/li[5]")
    WebElement archive;



    public ExploreStateFarmPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(ExploreStateFarmPage.class);



    //environment
    public void clickOnExplore(){click(explore);
        LOG.info("click on explore success");}
    public void clickOnEnvironment(){click(environment);
        LOG.info("click on environment success");}

    //community
    public void clickOnCommunity(){click(community);
        LOG.info("click on community success");}
    public void clickOnCommunityContacts(){click(communityContacts);
        LOG.info("click on community contacts success");}

    //company
    public void clickOnCompany(){click(company);
        LOG.info("click on company success");}
    //media
    public void clickOnMedia(){click(media);
        LOG.info("click on media success");}
    //archive
    public void clickOnArchive(){click(archive);
        LOG.info("click on archive success");}


}
