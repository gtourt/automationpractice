package pageObjects.orderProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Implements the order summary "stage" page of
 * the basket checkout process.
 */
public class OrderSummaryStepPage extends BasketPage {

    /**
     * Constructor of the order summary page.
     * @param driver
     */
    public OrderSummaryStepPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private List<WebElement> confirmButtons;

    /**
     * Clicks the Confirm button to complete the payment process.
     */
    public void clickConfirmButton() {
        for (WebElement element : confirmButtons) {
            if (element.findElement(By.tagName("span")).getText().equals("I confirm my order")) {
                element.click();
                break;
            }
        }
    }
}
