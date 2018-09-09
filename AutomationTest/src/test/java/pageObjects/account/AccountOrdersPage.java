package pageObjects.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePage;

/**
 * The account orders POM.
 */
public class AccountOrdersPage extends BasePage {

    /**
     * Constructor of the account orders page
     * @param driver : The web driver
     */
    public AccountOrdersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = ".info-title")
    private WebElement orderInformationText;

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement pageHeading;

    @FindBy(how = How.CLASS_NAME, using = "first_item")
    private WebElement firstItem;

    /**
     * Gets the account information text.
     * @return String : The text string.
     */
    public String getOrderInfoText() {
        return orderInformationText.getText();
    }

    /**
     * Gets the Text of the element with class page heading.
     * @return String : the text string.
     */
    public String getPageHeadingText() {
        return pageHeading.getText();
    }

    /**
     * Gets the date of the last order to confirm that the order is placed
     * and listed.
     */
    public String getLastOrdersDate() {
        return firstItem.findElement(By.xpath("//td[@class='history_date bold']")).getText();
    }
}
