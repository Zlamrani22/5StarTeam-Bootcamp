package pages.statefarm;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage  extends CommonAPI {

    @FindBy(xpath = "//*[text()='Log in']")
    WebElement loginButton;
    @FindBy(xpath = "//input[@autocomplete='username']")
    WebElement userName;
    @FindBy(xpath = "//input[@id='util-login-password']")
    WebElement password;
    @FindBy(xpath = "//button[@class='-oneX-util-login-button -oneX-btn-primary -oneX-btn-fit-content']")
    WebElement loginButtonSecond;



    public LoginPage(WebDriver driver){PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(LoginPage.class);

    public void clickOnLogInButton(){click(loginButton);
        LOG.info("click on login button success");}
    public void typeUserName(String user){type(userName, user);
        LOG.info("type username success");}
    public void typePassword(String pass) {type(password, pass);
        LOG.info("type password success");}
    public void clickLoginButtonSecond(){click(loginButtonSecond);
        LOG.info("click login button success");}



}
