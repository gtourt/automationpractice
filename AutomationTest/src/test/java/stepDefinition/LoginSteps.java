package stepDefinition;

import PageObjects.LoginPage;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Implements the steps associated with the login page object.
 */
public class LoginSteps {

    private final WebDriver driver = StepsHooks.driver;
    private LoginPage loginPage;
    private static final String EMAIL = StepsHooks.p.getProperty("user.email");
    private static final String PASSWORD = StepsHooks.p.getProperty("user.password");

    /**
     * Constructor of the login steps which initializes the driver.
     */
    public LoginSteps() {
        loginPage = new LoginPage(driver);
    }

    @When("^user enters Username$")
    public void setUsername() throws Throwable {
        loginPage.setUsernameFieldText(EMAIL);
    }

    @When("^user enters Password$")
    public void setPassword() throws Throwable {
        loginPage.setPasswordFieldText(PASSWORD);
    }

    @When("^user press Submit button$")
    public void pressSubmitButton() throws Throwable {
        loginPage.clickSubmit();
    }

    @When("^user is authenticated and has signed in")
    public void authorize() throws Throwable {
        this.setUsername();
        this.setPassword();
        this.pressSubmitButton();
    }

}
