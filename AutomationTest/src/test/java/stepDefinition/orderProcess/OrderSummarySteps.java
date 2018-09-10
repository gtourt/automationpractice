package stepDefinition.orderProcess;

import cucumber.api.java.en.When;
import enums.PurchaseStages;
import pageObjects.orderProcess.OrderSummaryPage;
import stepDefinition.BaseSteps;

/**
 * Implements the order summary step of the checkout process.
 */
public class OrderSummarySteps extends BaseSteps {

    private OrderSummaryPage orderSummaryPage;

    /**
     * Constructor of the order summary steps.
     */
    public OrderSummarySteps() {
        orderSummaryPage = new OrderSummaryPage(driver);
    }

    @When("^user is on order summary and confirms$")
    public void isOnOrderSummaryAndConfirms() {
        if (orderSummaryPage.isOnPurchaseStage(PurchaseStages.ORDER_SUMMARY.getValue())) {
            orderSummaryPage.clickConfirmButton();
        }
    }
}
