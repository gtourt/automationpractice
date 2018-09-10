package stepDefinition.account;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageObjects.account.AccountOrdersPage;
import stepDefinition.BaseSteps;
import stepDefinition.StepsHooks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Steps concerning the account orders of the user.
 */
public class AccountOrdersSteps extends BaseSteps {

    private static final String TITLE = StepsHooks.p.getProperty("ORDERS_TITLE");
    private static final String EXP_INFO_TEXT = StepsHooks.p.getProperty("ORDERS_INFO");

    private AccountOrdersPage accountOrdersPage;

    /**
     * Constructor of account steps which initializes the driver.
     */
    public AccountOrdersSteps() {
        accountOrdersPage = new AccountOrdersPage(this.driver);
    }

    @Then("^orders page is displayed$")
    public void accountOrdersPageDisplayed() {
        Assert.assertEquals(EXP_INFO_TEXT, accountOrdersPage.getOrderInfoText());
        Assert.assertEquals(TITLE, accountOrdersPage.getPageHeadingText());
    }

    @Then("^the order with the current date exist$")
    public void assertOrderPlaced() {
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Assert.assertEquals(date, accountOrdersPage.getLastOrdersDate());
    }


}
