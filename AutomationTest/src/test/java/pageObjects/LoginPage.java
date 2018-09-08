package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Implements the POM for the Login Page.
 */
public class LoginPage extends BasePage {

    /**
     * Constructor of login page object. Driver initializes
     * and home page is initialized to page object factory.
     * @param driver : The Web driver chosen.
     */
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "email")
    private WebElement usernameField;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement submit;

    /**
     * Clears the old text if exist and send the new one.
     * @param username : The username to login with.
     */
    public void setUsernameFieldText(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    /**
     * Clears the old text if exist and send the new one.
     * @param password : The current password to login with.
     */
    public void setPasswordFieldText(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    /**
     * Clicks the submit button to login.
     */
    public void clickSubmit() {
        submit.click();
    }
}
