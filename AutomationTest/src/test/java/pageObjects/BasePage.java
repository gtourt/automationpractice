package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import stepDefinition.StepsHooks;

/**
 * Implements the abstract class of BasePage
 */
public abstract class BasePage {

    protected WebDriver driver;

    /**
     * Base Constructor of the Base Page.
     */
    public BasePage() { }

    @FindBy(how = How.CSS, using = "a[title='View my customer account']")
    protected WebElement customerAccountTab;

    @FindBy(how = How.LINK_TEXT, using = "T-SHIRTS")
    protected WebElement tshirtsTab;

    /**
     * Navigates to the t-shirts tab by clicking the T-shirts button.
     */
    public void navigateToTShirtsPage() {
        tshirtsTab.click();
    }

    /**
     * Navigates to home page.
     */
    public void navigateToHomePage() {
        this.driver.get(StepsHooks.p.getProperty("webpage"));
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
