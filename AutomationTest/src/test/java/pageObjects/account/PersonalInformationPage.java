package pageObjects.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePage;

/**
 * The Personal Information POM
 */
public class PersonalInformationPage extends BasePage {

    /**
     * Constructor of Personal Information Page.
     * @param driver : The Web driver
     */
    public PersonalInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "firstname")
    private WebElement firstnameField;

    @FindBy(how = How.NAME, using = "submitIdentity")
    private WebElement saveButton;

    @FindBy(how = How.ID, using = "old_passwd")
    private WebElement currentPassword;

    @FindBy(how = How.CLASS_NAME, using = "alert-success")
    private WebElement confirmationMessage;

    /**
     * Clears the field from the previous text and sends the updated
     * first name.
     * @param firstname : String which represents the first name to be updated.
     */
    public void updateFirstnameField(String firstname) {
        firstnameField.clear();
        firstnameField.sendKeys(firstname);
    }

    /**
     * Clicks save button.
     */
    public void clickSaveButton() {
        saveButton.click();
    }

    /**
     * Sets the current password of the user to update information.
     * @param pwd : String - current password.
     */
    public void setCurrentPassword(String pwd) {
        currentPassword.clear();
        currentPassword.sendKeys(pwd);
    }

    /**
     * Gets the confirmation message when the profile is updated.
     * @return WebElement : the confirmation web element.
     */
    public WebElement getConfirmationMessage() {
        return confirmationMessage;
    }

}
