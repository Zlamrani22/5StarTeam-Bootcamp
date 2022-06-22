package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.activation.CommandMap;
import java.util.LinkedList;

public class SuppliersPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SuppliersPage.class);

    @FindBy(css = "a[class='btn btn-default button exclusive-medium']")
    public WebElement viewProducts;

    @FindBy(css = "select[id='selectProductSort']")
    public WebElement sortByComboBox;

    @FindBy(css = "i[class='icon-th-list']")
    public WebElement listView;

    public SuppliersPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickViewProducts(){
        click(viewProducts);
    }

    public void selectFromDropDown(String option){
        selectFromDropdown(sortByComboBox, option);
    }

    public void clickListView(){
        click(listView);
    }

    public boolean checkAlphabeticalOrder(LinkedList<String> productName){
        String previous = "";
        for (final String current: productName){
            if(current.compareTo(previous)<0)
                return false;
        }
        return true;
    }
}
