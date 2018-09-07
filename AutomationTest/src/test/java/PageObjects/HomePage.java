package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Implements the POM for the Home Page.
 */
public class HomePage {

    private WebDriver driver;
    private String HOME_PAGE = "http://automationpractice.com";

    /**
     * Constructor of home page object. Driver initializes
     * and home page is initialized to page object factory.
     * @param driver : The Web driver chosen.
     */
    public HomePage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    private WebElement signInButton;

    /**
     * Navigates to home page.
     */
    public void navigateToHomePage() {
        this.driver.get(HOME_PAGE);
    }

    /**
     * Navigates to Login Page clicking the Sign in button.
     */
    public void navigateToLoginPage() {
        this.signInButton.click();
    }
}
