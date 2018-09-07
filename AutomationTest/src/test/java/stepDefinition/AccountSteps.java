package stepDefinition;

import PageObjects.AccountPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Implements the steps asociated with the first page when logged in.
 */
public class AccountSteps {

    private static final String ACCOUNT_EXP_TEXT = StepsHooks.p.getProperty("ACCOUNT_EXP_TEXT");
    private static final String PAGE_HEADING = StepsHooks.p.getProperty("PAGE_HEADING");
    private static final String CONFIRMATION_MSG = StepsHooks.p.getProperty("CONFIRMATION_MSG");
    private static final String USERNAME_NEW = StepsHooks.p.getProperty("user.username.new");
    private static final String PASSWORD = StepsHooks.p.getProperty("user.password");

    private final WebDriver driver = StepsHooks.driver;
    private AccountPage accountPage;

    /**
     * Constructor of the account steps which initializes the driver.
     */
    public AccountSteps() {
        accountPage = new AccountPage(driver);
    }

    @Then("^user is navigated to the account page$")
    public void assert_success_message() throws Throwable {
        Assert.assertEquals(ACCOUNT_EXP_TEXT, accountPage.getAccountInfoText());
        Assert.assertEquals(PAGE_HEADING, accountPage.getPageHeadingText());
    }

    @When("^user goes to change the personal information$")
    public void navigateToPersonalInformationTab() throws Throwable {
        accountPage.goToPersonalInformation();
    }

    @When("^user changes his first name$")
    public void changeFirstName() throws Throwable {
        accountPage.updateFirstnameField(USERNAME_NEW);
    }

    @When("^user types his current password$")
    public void typeCurrentPassword() throws Throwable {
        accountPage.setCurrentPassword(PASSWORD);
    }

    @When("^user press save in personal information menu$")
    public void pressSaveButton() throws Throwable {
        accountPage.clickSaveButton();
    }

    @Then("^user can see a message to confirm the change$")
    public void updatedSuccessfully() throws Throwable {
        Assert.assertEquals(CONFIRMATION_MSG, accountPage.getConfirmationMessage().getText());
        Assert.assertTrue(accountPage.getConfirmationMessage().isDisplayed());
    }

    @Then("^user can see his name changed in the profile tab$")
    public void checkName() throws Throwable {
        Assert.assertEquals(USERNAME_NEW, accountPage.getCustomerAccountTabFirstName());
    }

}
