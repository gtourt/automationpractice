package pageObjects;

import org.openqa.selenium.WebDriver;
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

    /**
     * Navigates to home page.
     */
    public void navigateToHomePage() {
        this.driver.get(StepsHooks.p.getProperty("webpage"));
    }

}
