package stepDefinition;

import PageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Implements the steps associated with the home page object.
 */
public class HomeSteps {

    private final WebDriver driver = StepsHooks.driver;
    private HomePage homePage;

    public HomeSteps() {
        homePage = new HomePage(driver);
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
