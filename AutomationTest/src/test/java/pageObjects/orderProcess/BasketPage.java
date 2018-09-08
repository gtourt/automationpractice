package pageObjects.orderProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasePage;

/**
 * Parent class for the checkout process of the basket.
 */
public class BasketPage extends BasePage {

    private final static String checkoutButtonXpath = "//*[@title='Proceed to checkout']";

    /**
     * Private constructor for the class to be inherited.
     */
    protected BasketPage() { }

    /**
     * Constructor of the BasketPage which initializes the driver and the POM in
     * the page object factory.
     * @param driver : The web driver
     */
    public BasketPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement cartTitle;

    @FindBy(how = How.XPATH, using = "/a[@title='Back to orders']")
    private WebElement backToOrdersButton;

    /**
     * Proceed to checkout in the popup window when the user adds a product to the basket.
     */
    public void proceedToCheckout() {
        WebElement element = new WebDriverWait(driver, 5)
            .until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutButtonXpath)));
        element.click();
    }

    /**
     * Checks in which stage of the checkout is the current step.
     * @param stageName : the name of the stage
     * @return : True or false if the stage found or not.
     */
    public boolean isOnPurchaseStage(String stageName) {
        String text = cartTitle.getText().split("\n")[0];
        if (text.equalsIgnoreCase(stageName)) {
            return true;
        } else {
            return false;
        }
    }
}
