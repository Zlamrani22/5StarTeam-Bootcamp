package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NBCPage extends CommonAPI {

    @FindBy(css = "a[href='https://www.nbcnews.com']")
    public WebElement nbcLogoDropdownMenu;

    @FindBy(css = "ul[class='shortcuts-list h-lh'] li:nth-child(5)")
    public WebElement covidMainTabNBCPage;

    @FindBy(css = "div[class='totalcolumn confirm-totalcolumn']")
    private WebElement covidCasesTwoWeekColumn;

    @FindBy(css = "p[class='two-week big-number']")
    public WebElement covidTwoWeekPercentageText;

    @FindBy(xpath = "#chart-date")
    public WebElement scrollToDate;

    @FindBy(css = "#hospital-trend")
    private WebElement covidHospitalTab;

    @FindBy(css = "#case-hotspots")
    private WebElement covidHotSpotsTab;

    @FindBy(css = "#overview")
    public WebElement covidOverviewTab;

    @FindBy(xpath = "(//a[normalize-space()='Plan Your Vote'])[1]")
    private WebElement planYouVoteTab;

    @FindBy(xpath = "//a[text()='Vaccine tracker']")
    public WebElement vaccineTabCovidPage;

    @FindBy(css = "table[id='table'] tbody")
    public WebElement covidDataTable;

    @FindBy(css = "table[id='table'] tr:nth-child(3) td:nth-child(4)")
    private WebElement newYorkCovidVaccinationPercentageData;

    @FindBy(css = "table[id='table'] thead tr")
    private WebElement covidTableHeader;

    @FindBy(css = "button[aria-label='news navigation and search']")
    private WebElement nbcPageDropdownTab;

    @FindBy(css = ".menu-section.menu-section-sections.menu-section-main")
    private WebElement dropdownSections;

    @FindBy(css = ".menu-section.menu-section-tv")
    private WebElement tvSectionDropdown;

    @FindBy(css = ".menu-section.menu-section-featured")
    private WebElement featureSectionDropdown;

    @FindBy(css = ".menu-section.menu-section-more")
    private WebElement moreSectionDropdown;



    public NBCPage(WebDriver driver){
    PageFactory.initElements(driver,this);
    }

    public void clickNBCNewsLogo(){
        click(nbcLogoDropdownMenu);
    }

    public void clickCovidTab(){
        click(covidMainTabNBCPage);
    }

    public void viewCovidTwoWeekPercentage(){
        getElementText(covidTwoWeekPercentageText);
    }

    public WebElement viewCovidCasesColumn(){
        isPresent(covidTwoWeekPercentageText);
        return covidTwoWeekPercentageText;
    }

    public void clickCovidHospitalizations(){

        click(covidHospitalTab);
    }

    public void clickCovidHotSpots(){
        click(covidHotSpotsTab);
    }

    public void clickCovidOverview(){
        click(covidOverviewTab);
    }

    public void clickPlanYourVoteTab(){
        click(planYouVoteTab);
    }

    public String getNewYorkCovidVaxPercentage(){
        String text=getElementText(newYorkCovidVaccinationPercentageData);

        return text;
    }

    public void clickVaccine(){
        click(vaccineTabCovidPage);
    }

    public String getCovidDataHeader(){
        String header= getElementText(covidTableHeader);
        return header;
    }

    public void clickNbcPageDropdownTab(){
        click(nbcPageDropdownTab);
    }

    public String getTextSections(){
        String list= getElementText(dropdownSections);
        return list;

    }

    public String getTextTvSection(){
        String tv= getElementText(tvSectionDropdown);
        return tv;
    }

    public String getTextFeaturedSection(){
        String features= getElementText(featureSectionDropdown);
        return features;
    }

    public String getTextMoreSection(){
        String more= getElementText(moreSectionDropdown);
        return more;
    }

}
