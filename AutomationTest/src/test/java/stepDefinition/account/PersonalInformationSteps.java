package stepDefinition.account;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AccountPage;
import pageObjects.account.PersonalInformationPage;
import stepDefinition.BaseSteps;
import stepDefinition.StepsHooks;

/**
 * Steps concerning the personal information of the user.
 */
public class PersonalInformationSteps extends BaseSteps {

    private static final String CONFIRMATION_MSG = StepsHooks.p.getProperty("CONFIRMATION_MSG");

    private PersonalInformationPage personalInformationPage;
    private AccountPage accountPage;

    /**
     * Constructor of the account steps which initializes the driver.
     */
    public PersonalInformationSteps() {
        accountPage = new AccountPage(this.driver);
        personalInformationPage = new PersonalInformationPage(this.driver);
    }

    @When("^user changes his first name$")
    public void changeFirstName() throws Throwable {
        personalInformationPage.updateFirstnameField(USERNAME_NEW);
    }

    @When("^user types his current password$")
    public void typeCurrentPassword() throws Throwable {
        personalInformationPage.setCurrentPassword(PASSWORD);
    }

    @When("^user press save in personal information menu$")
    public void pressSaveButton() throws Throwable {
        personalInformationPage.clickSaveButton();
    }

    @Then("^user can see a message to confirm the change$")
    public void updatedSuccessfully() throws Throwable {
        Assert.assertEquals(CONFIRMATION_MSG, personalInformationPage.getConfirmationMessage().getText());
        Assert.assertTrue(personalInformationPage.getConfirmationMessage().isDisplayed());
    }

    @Then("^user can see his name changed in the profile tab$")
    public void checkName() throws Throwable {
        Assert.assertEquals(USERNAME_NEW, accountPage.getCustomerAccountTabFirstName());
    }

}
