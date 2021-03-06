package pageObjects.orderProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Implements the address stage of the payment process.
 */
public class AddressPage extends BasketPage {

    /**
     * Constructor of address page.
     * @param driver : The web driver
     */
    public AddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    public void proceedToCheckout() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript(SCROLL_TO_EOD);
        WebElement element = new WebDriverWait(driver, 5)
            .until(ExpectedConditions.elementToBeClickable(By.name("processAddress")));
        element.click();
    }
}
