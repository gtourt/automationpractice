package stepDefinition;

import pageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Implements the steps associated with the home page object.
 */
public class HomeSteps extends BaseSteps{

    private HomePage homePage;

    /**
     * Constructor of the home steps which initializes the driver.
     */
    public HomeSteps() {
        homePage = new HomePage(this.driver);
    }

    @Given("^user navigates to homepage$")
    public void userNavigatesToHomePage() throws Throwable {
        homePage.navigateToHomePage();
    }

    @When("^user press Sign In$")
    public void userPressSignIn() throws Throwable {
        homePage.navigateToLoginPage();
    }
}
