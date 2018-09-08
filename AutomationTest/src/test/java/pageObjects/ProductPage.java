package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Implements the POM for the product Page.
 */
public class ProductPage extends BasePage {

    /**
     * Constructor of product page object. Driver initializes and
     * home page is initialized to page object factory.
     * @param driver : The Web driver chosen.
     */
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CLASS_NAME, using = "product_img_link")
    private List<WebElement> productList;

    /**
     * Adds the product with 'productName' to cart.
     * @param productName : The name of the product to add to cart.
     */
    public void addProductToCart(String productName) {

        for (WebElement product : productList) {
            if (product.getAttribute("title").equals(productName)) {
                Actions action = new Actions(driver);
                action.moveToElement(product).perform();
                break;
            }
        }
        driver.findElement(By.xpath("//a[@title='Add to cart']")).click();
    }
}
