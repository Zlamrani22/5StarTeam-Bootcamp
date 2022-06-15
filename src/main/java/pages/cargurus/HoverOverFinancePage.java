package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverOverFinancePage extends CommonAPI {

    @FindBy(xpath = "//span[text()='Finance']")
    WebElement floatingFinanceMenu;
    @FindBy(xpath = "//span[text()='Loan Calculator']")
    WebElement LoanCalculator;
    @FindBy(xpath = "//span[text()='Prequalify for Financing']")
    WebElement Prequalify;
    @FindBy(xpath = "//span[text()='How does it work? (video)']")
    WebElement HowDoesItWork;
    @FindBy(xpath = "//span[text()='Financing FAQs']")
    WebElement FinancingFAQS;

    public HoverOverFinancePage(WebDriver driver) {PageFactory.initElements(driver, this);}

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingFinanceMenu);}
    public void clickLoanCalculator(){click(LoanCalculator);}
    public void clickLPrequalify(){click(Prequalify);}
    public void clickHowDoesItWork(){click(HowDoesItWork);}
    public void clickFinancingFAQS(){click(FinancingFAQS);}
}
