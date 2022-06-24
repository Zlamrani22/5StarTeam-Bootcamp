package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FinancePage extends CommonAPI {

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

    public FinancePage(WebDriver driver) {PageFactory.initElements(driver, this);}

    private final Logger LOG = LoggerFactory.getLogger(FinancePage.class);

    public void hoverOverFloatingMenu(WebDriver driver){hoverOver(driver, floatingFinanceMenu);
        LOG.info("hover over driver success");}
    public void clickLoanCalculator(){click(LoanCalculator);
        LOG.info("click loan calculator success");}
    public void clickLPrequalify(){click(Prequalify);
        LOG.info("click prequalify success");}
    public void clickHowDoesItWork(){click(HowDoesItWork);
        LOG.info("click how does it work success");}
    public void clickFinancingFAQS(){click(FinancingFAQS);
        LOG.info("click financing FAQS success");}
}
