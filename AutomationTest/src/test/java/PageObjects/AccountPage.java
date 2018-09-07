package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Implements the POM for the Account Page.
 */
public class AccountPage {

    private WebDriver driver;

    /**
     * Constructor of account page object. Driver initializes
     * and home page is initialized to page object factory.
     * @param driver : The Web driver chosen.
     */
    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "MY PERSONAL INFORMATION")
    private WebElement personalInformation;

    @FindBy(how = How.CSS, using = ".info-account")
    private WebElement accountInformationText;

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement pageHeading;

    @FindBy(how = How.ID, using = "firstname")
    private WebElement firstnameField;

    @FindBy(how = How.NAME, using = "submitIdentity")
    private WebElement saveButton;

    @FindBy(how = How.ID, using = "old_passwd")
    private WebElement currentPassword;

    @FindBy(how = How.CLASS_NAME, using = "alert-success")
    private WebElement confirmationMessage;

    @FindBy(how = How.CSS, using = "a[title='View my customer account']")
    private WebElement customerAccountTab;

    private WebElement innerCustomerAccountTab;

    /**
     * Gets the account information text.
     * @return String : The text string.
     */
    public String getAccountInfoText() {
        return accountInformationText.getText();
    }

    /**
     * Gets the Text of the element with class page heading.
     * @return String : the text string.
     */
    public String getPageHeadingText() {
        return pageHeading.getText();
    }

    /**
     * Clicks the tab which redirects the user to his personal
     * information.
     */
    public void goToPersonalInformation() {
        personalInformation.click();
    }

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

    /**
     * Gets the first name only from the account tab
     * @return String - first name of the account tab.
     */
    public String getCustomerAccountTabFirstName() {
        innerCustomerAccountTab = customerAccountTab.findElement(By.tagName("span"));
        return innerCustomerAccountTab.getText().split(" ")[0];
    }
}
