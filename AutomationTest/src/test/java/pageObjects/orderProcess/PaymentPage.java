package pageObjects.orderProcess;

import enums.PaymentMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Implements the payment step page of the payout process.
 */
public class PaymentPage extends BasketPage {

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[@title='Pay by bank wire']")
    private WebElement bankWire;

    @FindBy(how = How.XPATH, using = "//a[@title='Pay by check.']")
    private WebElement check;

    /**
     * Picks the payment method provided.
     * @param method : The payment method to use.
     */
    public void pickPaymentMethod(String method) {
        if (method.equalsIgnoreCase(PaymentMethods.BANK_WIRE.getValue())) {
            bankWire.click();
        } else {
            check.click();
        }
    }



}
