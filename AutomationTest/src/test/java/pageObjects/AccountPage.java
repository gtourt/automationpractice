package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Implements the POM for the Account Page.
 */
public class AccountPage extends BasePage {

    /**
     * Constructor of account page object. Driver initializes
     * and home page is initialized to page
     * object factory.
     * @param driver : The Web driver chosen.
     */
    public AccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "MY PERSONAL INFORMATION")
    private WebElement personalInformation;

    @FindBy(how = How.XPATH, using = "//a[@title='Orders']")
    private WebElement myOrdersPage;

    @FindBy(how = How.CSS, using = ".info-account")
    private WebElement accountInformationText;

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement pageHeading;

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
     * Navigate to personal information page.
     */
    public void navigateToPersonalInformation() {
        personalInformation.click();
    }

    /**
     * Navigate to the account orders page.
     */
    public void navigateToAccountOrders() {
        myOrdersPage.click();
    }

    /**
     * Navigates to account page
     */
    public void navigateToAccountPage() {
        customerAccountTab.click();
    }
}
