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

    public LoginSteps() {
        loginPage = new LoginPage(driver);
    }

    @When("^user enters Username$")
    public void setUsername() throws Throwable {
        loginPage.setUsernameFieldText("someone@example.com");
    }

    @When("^user enters Password$")
    public void setPassword() throws Throwable {
        loginPage.setPasswordFieldText("Password123");
    }

    @When("^user press Submit button$")
    public void pressSubmitButton() throws Throwable {
        loginPage.clickSubmit();
    }

    @When("^user is authorised$")
    public void authorize() throws Throwable {
        this.setUsername();
        this.setPassword();
        this.pressSubmitButton();
    }

}
