package pageObjects.orderProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Summary Step of the basket checkout process.
 */
public class SummaryStepPage extends BasketPage {

    private static final String checkoutXpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]";

    /**
     * Constructor of the SummaryStepPage.
     * @param driver
     */
    public SummaryStepPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    public void proceedToCheckout() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement element = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutXpath)));
        element.click();
    }
}
