package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Implements the POM for the Account Page.
 */
public class AccountPage {

    /**
     * Constructor of account page object. Driver initializes
     * and home page is initialized to page object factory.
     * @param driver : The Web driver chosen.
     */
    public AccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = ".info-account")
    private WebElement accountExplanationText;

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement pageHeading;

    public String getAccountExpText() {
        return accountExplanationText.getText();
    }

    public String getPageHeading() {
        return pageHeading.getText();
    }
}
