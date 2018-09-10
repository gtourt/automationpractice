package stepDefinition.orderProcess;

import cucumber.api.java.en.When;
import enums.PurchaseStages;
import pageObjects.orderProcess.AddressPage;
import stepDefinition.BaseSteps;

/**
 * Implements the address step of the checkout process.
 */
public class AddressSteps extends BaseSteps {
    private AddressPage addressPage;

    /**
     * Constructor of Address Steps
     */
    public AddressSteps() {
        addressPage = new AddressPage(driver);
    }

    @When("^user is on addresses and proceeds$")
    public void isOnAddressesAndProcceed() throws Throwable {
        if (addressPage.isOnPurchaseStage(PurchaseStages.ADDRESSES.getValue())) {
            addressPage.proceedToCheckout();
        }
    }
}
