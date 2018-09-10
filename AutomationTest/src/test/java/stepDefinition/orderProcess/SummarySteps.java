package stepDefinition.orderProcess;

import cucumber.api.java.en.When;
import enums.PurchaseStages;
import pageObjects.orderProcess.SummaryPage;
import stepDefinition.BaseSteps;

/**
 * Implements the product summary step of the checkout process.
 */
public class SummarySteps extends BaseSteps {
    private SummaryPage summaryPage;

    /**
     * Constructor of the summary steps.
     */
    public SummarySteps() {
        summaryPage = new SummaryPage(this.driver);
    }

    @When("^user is on summary and proceeds")
    public void isOnSummaryAndProcceed() throws Throwable {
        if (summaryPage.isOnPurchaseStage(PurchaseStages.SUMMARY.getValue())) {
            summaryPage.proceedToCheckout();
        }
    }
}
