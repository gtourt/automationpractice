package stepDefinition;

import PageObjects.AccountPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Implements the steps asociated with the first page when logged in.
 */
public class AccountSteps {

    private static final String ACCOUNT_EXP_TEXT = "Welcome to your account. " +
        "Here you can manage all of your personal information and orders.";
    private static final String PAGE_HEADING = "MY ACCOUNT";


    private final WebDriver driver = StepsHooks.driver;
    private AccountPage accountPage;

    public AccountSteps() {
        accountPage = new AccountPage(driver);
    }

    @Then("^user is navigated to the account page")
    public void assert_success_message() throws Throwable {
        Assert.assertEquals(ACCOUNT_EXP_TEXT, accountPage.getAccountExpText());
        Assert.assertEquals(PAGE_HEADING, accountPage.getPageHeading());
    }
}
