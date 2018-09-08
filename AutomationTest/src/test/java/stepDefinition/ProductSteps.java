package stepDefinition;

import pageObjects.ProductPage;
import cucumber.api.java.en.When;
import enums.TabNames;

/**
 * Implements the steps associated with the product page.
 */
public class ProductSteps extends BaseSteps {

    private ProductPage productPage;

    /**
     * Constructor of the product steps which initializes the driver
     * in the POM.
     */
    public ProductSteps() {
        productPage = new ProductPage(this.driver);
    }

    @When("^user navigates to the (.*) section$")
    public void navigateToProductType(String productType) throws Throwable {
        if (productType.equals(TabNames.TSHIRTS.getValue())) {
            productPage.navigateToTShirtsPage();
        }
    }

    @When("^user picks the (.*) product of the list$")
    public void pickProduct(String productName) throws Throwable {
        productPage.addProductToCart(productName);
    }
}
