package stepDefinition;

import pageObjects.LoginPage;
import cucumber.api.java.en.When;

/**
 * Implements the steps associated with the login page object.
 */
public class LoginSteps extends BaseSteps {

    private LoginPage loginPage;

    /**
     * Constructor of the login steps which initializes the driver.
     */
    public LoginSteps() {
        loginPage = new LoginPage(this.driver);
    }

    @When("^user enters username (.*)$")
    public void setUsername(String username) throws Throwable {
        loginPage.setUsernameFieldText(username);
    }

    @When("^user enters password (.*)$")
    public void setPassword(String password) throws Throwable {
        loginPage.setPasswordFieldText(password);
    }

    @When("^user press Submit button$")
    public void pressSubmitButton() throws Throwable {
        loginPage.clickSubmit();
    }

    @When("^user is authenticated as (.*) with password (.*) and has signed in$")
    public void authorize(String username, String password) throws Throwable {
        this.setUsername(username);
        this.setPassword(password);
        this.pressSubmitButton();
    }
}
