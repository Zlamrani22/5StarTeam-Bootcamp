package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifeInsurancePage  extends CommonAPI {

    //life insurance
    @FindBy(xpath = "//span[text()='Insurance']")
    private WebElement insurance;
    @FindBy(css="#oneX-3-insurance")
    private WebElement life;
    @FindBy(css = "#quote-main-state-select")
    private WebElement state;
    @FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/button[1]")
    WebElement go;



    public LifeInsurancePage(WebDriver driver){PageFactory.initElements(driver, this);}

    //get Life insurance
    public void clickOnInsurance(){click(insurance);}
    public void clickOnLife(){click(life);}
    public void selectFromDropDown(String st){selectFromDropdown(state, st);}
    public void clickOnGo(){click(go);}





}
