package stepDefinition.account;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AccountPage;
import pageObjects.HomePage;
import pageObjects.account.PersonalInformationPage;
import stepDefinition.BaseSteps;
import stepDefinition.HomeSteps;
import stepDefinition.StepsHooks;

/**
 * Steps concerning the personal information of the user.
 */
public class PersonalInformationSteps extends BaseSteps {

    private static final String CONFIRMATION_MSG = StepsHooks.p.getProperty("PI_CONFIRMATION_MSG");

    private PersonalInformationPage personalInformationPage;
    private HomePage homePage;

    /**
     * Constructor of the account steps which initializes the driver.
     */
    public PersonalInformationSteps() {
        homePage = new HomePage(this.driver);
        personalInformationPage = new PersonalInformationPage(this.driver);
    }

    @When("^user changes his first name to (.*)$")
    public void changeFirstName(String firstName) throws Throwable {
        personalInformationPage.updateFirstnameField(firstName);
    }

    @When("^user types his current password (.*)$")
    public void typeCurrentPassword(String password) throws Throwable {
        personalInformationPage.setCurrentPassword(password);
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
}
