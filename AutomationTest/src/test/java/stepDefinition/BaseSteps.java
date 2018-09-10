package stepDefinition;

import org.openqa.selenium.WebDriver;

/**
 * Implements the parent class for each ChildSteps class.
 */
public abstract class BaseSteps {

    protected final WebDriver driver = StepsHooks.driver;
}
