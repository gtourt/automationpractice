package pageObjects;

import org.openqa.selenium.WebDriver;
import stepDefinition.StepsHooks;

/**
 * Implements the abstract class of BasePage
 */
public abstract class BasePage {

    private static final String WEBPAGE_URL = "WEBPAGE_URL";
    protected static final String SCROLL_TO_EOD = "window.scrollTo(0, document.body.scrollHeight)";
    protected WebDriver driver;

    /**
     * Base Constructor of the Base Page.
     */
    public BasePage() { }

    /**
     * Navigates to home page.
     */
    public void navigateToHomePage() {
        this.driver.get(StepsHooks.p.getProperty(WEBPAGE_URL));
    }

}
