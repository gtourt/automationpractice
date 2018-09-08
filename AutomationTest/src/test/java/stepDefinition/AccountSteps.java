package stepDefinition;

import pageObjects.AccountPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Implements the steps asociated with the first page when logged in.
 */
public class AccountSteps extends BaseSteps {

    private static final String ACCOUNT_EXP_TEXT = StepsHooks.p.getProperty("ACCOUNT_EXP_TEXT");
    private static final String PAGE_HEADING = StepsHooks.p.getProperty("PAGE_HEADING");

    private AccountPage accountPage;

    /**
     * Constructor of the account steps which initializes the driver.
     */
    public AccountSteps() {
        accountPage = new AccountPage(this.driver);
    }

    @Then("^user is navigated to the account page$")
    public void assert_success_message() throws Throwable {
        Assert.assertEquals(ACCOUNT_EXP_TEXT, accountPage.getAccountInfoText());
        Assert.assertEquals(PAGE_HEADING, accountPage.getPageHeadingText());
    }

    @When("^user navigates to his account page$")
    public void navigateToAccountPage() throws Throwable {
        accountPage.navigateToAccountPage();
    }

    @When("^user navigates to his personal information$")
    public void navigateToPersonalInformationTab() throws Throwable {
        accountPage.navigateToPersonalInformation();
    }

    @When("^user navigates to his orders$")
    public void navigateToMyOrders() {
        accountPage.navigateToAccountOrders();
    }

}
