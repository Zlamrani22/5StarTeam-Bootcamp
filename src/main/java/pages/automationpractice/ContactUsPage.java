package pages.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends CommonAPI {

    @FindBy(xpath = "//select[@id='id_contact']")
    public WebElement subjectHeadingDropdown;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAddressInputField;

    @FindBy(xpath = "//*[@id='id_order']")
    public WebElement orderRefNumberInputField;

    @FindBy (xpath = "//*[@id='message']")
    public WebElement textArea;

    @FindBy(css = "button[id='submitMessage']")
    public WebElement sendButton;

    public ContactUsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void selectFromSubjectHeadingDropdown(){
        click(subjectHeadingDropdown);
    }

    public void typeEmailAddress(String emailAddress){
        type(emailAddressInputField, emailAddress);
    }

    public void typeOrderRefNumber(String orderRefNumber){
        type(orderRefNumberInputField, orderRefNumber);
    }

    public void typeInTextArea(String text){
        type(textArea, text);
    }

    public void clickSendButton(){
        click(sendButton);
    }

}
