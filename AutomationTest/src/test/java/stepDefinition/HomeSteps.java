package stepDefinition;

import cucumber.api.java.en.Then;
import enums.TabNames;
import org.junit.Assert;
import pageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Implements the steps associated with the home page object.
 */
public class HomeSteps extends BaseSteps{

    protected HomePage homePage;

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

    @When("^user navigates to his account page$")
    public void navigateToAccountPage() throws Throwable {
        homePage.navigateToAccountPage();
    }

    @When("^user navigates to the (.*) section$")
    public void navigateToProductType(String productType) throws Throwable {
        if (productType.equals(TabNames.TSHIRTS.getValue())) {
            homePage.navigateToTShirtsPage();
        }
    }

    @Then("^user can see his name (.*) in the profile tab$")
    public void checkName(String username) throws Throwable {
        Assert.assertEquals(username, homePage.getCustomerAccountTabFirstName());
    }
}
