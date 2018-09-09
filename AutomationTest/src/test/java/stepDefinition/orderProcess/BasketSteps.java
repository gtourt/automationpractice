package stepDefinition.orderProcess;

import pageObjects.orderProcess.BasketPage;
import cucumber.api.java.en.When;
import stepDefinition.BaseSteps;

/**
 * Implements the steps of the basket.
 */
public class BasketSteps extends BaseSteps {

    private BasketPage basketPage;

    /**
     * Constructor of BasketSteps
     */
    public BasketSteps() {
        basketPage = new BasketPage(this.driver);
    }

    @When("^user proceeds to checkout")
    public void proceedToCheckout() throws Throwable {
        basketPage.proceedToCheckout();
    }
}
