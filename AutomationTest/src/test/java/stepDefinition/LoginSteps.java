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
