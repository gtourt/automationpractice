package stepDefinition;

import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Implements the parent class for each ChildSteps class.
 */
public abstract class BaseSteps {

    protected static final String USERNAME_NEW = StepsHooks.p.getProperty("user.username.new");
    protected static final String PASSWORD = StepsHooks.p.getProperty("user.password");
    protected static final String EMAIL = StepsHooks.p.getProperty("user.email");
    protected final WebDriver driver = StepsHooks.driver;
}
