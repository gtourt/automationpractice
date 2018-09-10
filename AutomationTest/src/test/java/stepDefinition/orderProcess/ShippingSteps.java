package stepDefinition.orderProcess;

import cucumber.api.java.en.When;
import enums.PurchaseStages;
import pageObjects.orderProcess.ShippingPage;
import stepDefinition.BaseSteps;

/**
 * Implements the shipping step of the checkout process.
 */
public class ShippingSteps extends BaseSteps {
    private ShippingPage shippingPage;

    /**
     * Constructor of Shipping Steps
     */
    public ShippingSteps() {
        shippingPage = new ShippingPage(driver);
    }

    @When("^user agrees to terms in shipping page$")
    public void agreeToTerms() throws Throwable {
        shippingPage.checkTermsCheckbox();
    }

    @When("^user is on shipping and agrees to terms and proceeds$")
    public void isOnShippingAndProceed() throws Throwable {
        if (shippingPage.isOnPurchaseStage(PurchaseStages.SHIPPING.getValue())) {
            this.agreeToTerms();
            shippingPage.proceedToCheckout();
        }
    }
}
