package stepDefinition.orderProcess;

import cucumber.api.java.en.When;
import enums.PurchaseStages;
import pageObjects.orderProcess.PaymentPage;
import stepDefinition.BaseSteps;

/**
 * Implements the payment steps.
 * Payment steps of the checkout process.
 */
public class PaymentSteps extends BaseSteps {

    private PaymentPage paymentPage;

    /**
     * Constructor of PaymentSteps
     */
    public PaymentSteps() {
        paymentPage = new PaymentPage(driver);
    }

    @When("^user is on payment method and picks pay (.*)$")
    public void isOnPaymentMethodAndPicks(String method) {
        if(paymentPage.isOnPurchaseStage(PurchaseStages.PAYMENT_METHOD.getValue())) {
            paymentPage.pickPaymentMethod(method);
        }
    }
}
