package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.StepsHooks;

/**
 * Implements the POM for the Home Page.
 */
public class HomePage extends BasePage {

    /**
     * Constructor of home page object. Driver initializes
     * and home page is initialized to page object factory.
     * @param driver : The Web driver chosen.
     */
    public HomePage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    private WebElement signInButton;

    @FindBy(how = How.CSS, using = "a[title='View my customer account']")
    private WebElement customerAccountTab;

    @FindBy(how = How.LINK_TEXT, using = "T-SHIRTS")
    private WebElement tshirtsTab;

    /**
     * Navigates to Login Page clicking the Sign in button.
     */
    public void navigateToLoginPage() {
        this.signInButton.click();
    }

    /**
     * Navigates to account page
     */
    public void navigateToAccountPage() {
        customerAccountTab.click();
    }

    /**
     * Navigates to the t-shirts tab by clicking the T-shirts button.
     */
    public void navigateToTShirtsPage() {
        tshirtsTab.click();
    }

    /**
     * Gets the first name only from the account tab
     * @return String - first name of the account tab.
     */
    public String getCustomerAccountTabFirstName() {
        WebElement innerCustomerAccountTab = customerAccountTab.findElement(By.tagName("span"));
        return innerCustomerAccountTab.getText().split(" ")[0];
    }
}
