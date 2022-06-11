package pages.msnbc;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColumnistPage extends CommonAPI {

    @FindBy(css = "h4[class='styles_title__Ge8pR']")
    private WebElement pageHeader;

    @FindBy(css = "button[class='animated-ghost-button animated-ghost-button--normal styles_actionButton__CyZ6G']")
    private WebElement showAllColumnist;

//    @FindBy(css = "//div[text()='Zeeshan Aleem is a writer and editor for MSNBC Daily.']")
//    private WebElement selectZeeshanAleem;

    @FindBy(xpath = "(//div[@class='styles_entity__qmo5G'])[1]")
    private WebElement selectZeeshanAleem;

    public ColumnistPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String columnistPageHeader() {

        String header = getElementText(pageHeader);
        return header;
    }

    public void showAllColumnistButton(){
        click(showAllColumnist);
    }

    public void clickZeeshanAleem(){
        click(selectZeeshanAleem);

    }

}
