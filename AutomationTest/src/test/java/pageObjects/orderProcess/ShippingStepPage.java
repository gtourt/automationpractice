package pageObjects.orderProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Implements the shipping page of the checkout process.
 */
public class ShippingStepPage extends BasketPage {

    /**
     * Constructor of the shipping step page.
     * @param driver
     */
    public ShippingStepPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "cgv")
    private WebElement termsCheckBox;

    @Override
    public void proceedToCheckout() {
        WebElement element = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.name("processCarrier")));
        element.click();
    }

    /**
     * Clicks the checkbox where the user agrees to the terms.
     */
    public void checkTermsCheckbox() {
        termsCheckBox.click();
    }
}
