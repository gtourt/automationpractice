package stepDefinition;

import pageObjects.orderProcess.AddressStepPage;
import pageObjects.orderProcess.BasketPage;
import pageObjects.orderProcess.OrderSummaryStepPage;
import pageObjects.orderProcess.PaymentStepPage;
import pageObjects.orderProcess.ShippingStepPage;
import pageObjects.orderProcess.SummaryStepPage;
import cucumber.api.java.en.When;
import enums.PurchaseStages;

public class BasketSteps extends BaseSteps {

    private BasketPage basketPage;
    private ShippingStepPage shippingStepPage;
    private SummaryStepPage summaryStepPage;
    private AddressStepPage addressStepPage;
    private PaymentStepPage paymentStepPage;
    private OrderSummaryStepPage orderSummaryStepPage;

    public BasketSteps() {
        basketPage = new BasketPage(this.driver);
        shippingStepPage = new ShippingStepPage(driver);
        summaryStepPage = new SummaryStepPage(driver);
        addressStepPage = new AddressStepPage(driver);
        paymentStepPage = new PaymentStepPage(driver);
        orderSummaryStepPage = new OrderSummaryStepPage(driver);
    }

    @When("^user proceeds to checkout")
    public void proceedToCheckout() throws Throwable {
        basketPage.proceedToCheckout();
    }

    @When("^user is on summary and proceeds")
    public void isOnSummaryAndProcceed() throws Throwable {
        if (basketPage.isOnPurchaseStage(PurchaseStages.SUMMARY.getValue())) {
            summaryStepPage.proceedToCheckout();
        }
    }

    @When("^user is on addresses and proceeds")
    public void isOnAddressesAndProcceed() throws Throwable {
        if (basketPage.isOnPurchaseStage(PurchaseStages.ADDRESSES.getValue())) {
            addressStepPage.proceedToCheckout();
        }
    }

    @When("^user agrees to terms in shipping page$")
    public void agreeToTerms() throws Throwable {
        shippingStepPage.checkTermsCheckbox();
    }

    @When("^user is on shipping and agrees to terms and proceeds")
    public void isOnShippingAndProceed() throws Throwable {
        if (basketPage.isOnPurchaseStage(PurchaseStages.SHIPPING.getValue())) {
            this.agreeToTerms();
            shippingStepPage.proceedToCheckout();
        }
    }

    @When("^user is on payment method and picks pay (.*)$")
    public void isOnPaymentMethodAndPicks(String method) {
        if(basketPage.isOnPurchaseStage(PurchaseStages.PAYMENT_METHOD.getValue())) {
            paymentStepPage.pickPaymentMethod(method);
        }
    }

    @When("^user is on order summary and confirms")
    public void isOnOrderSummaryAndConfirms() {
        if (basketPage.isOnPurchaseStage(PurchaseStages.ORDER_SUMMARY.getValue())) {
            orderSummaryStepPage.clickConfirmButton();
        }
    }
}
