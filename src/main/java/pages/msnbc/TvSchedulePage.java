package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TvSchedulePage extends CommonAPI {

    @FindBy(xpath = "//p[.='Monday']")
    private WebElement mondaySchedule;

    @FindBy(xpath = "//p[.='Tuesday']")
    private WebElement tuesdaySchedule;

    @FindBy(xpath = "//p[.='Wednesday']")
    private WebElement wednesdaySchedule;

    @FindBy(xpath = "//p[.='Thursday']")
    private WebElement thursdaySchedule;

    @FindBy(xpath = "//p[.='Friday']")
    private WebElement fridaySchedule;

    @FindBy(xpath = "//p[.='Saturday']")
    private WebElement saturdaySchedule;

    @FindBy(xpath = "//p[.='Sunday']")
    private WebElement sundaySchedule;


    public TvSchedulePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickMonSchedule(){
        click(mondaySchedule);
    }

    public void clickTuesSchedule(){
        click(tuesdaySchedule);
    }

    public void clickWedSchedule(){
        click(wednesdaySchedule);
    }

    public void clickThurSchedule(){
        click(thursdaySchedule);
    }

    public void clickFriSchedule(){
        click(fridaySchedule);
    }

    public void clickSatSchedule(){
        click(saturdaySchedule);
    }

    public void clickSunSchedule(){
        click(sundaySchedule);
    }


}
