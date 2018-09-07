package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class StepsHooks {

    private static final String PATH_VAR_NAME = "webdriver.chrome.driver";
    private static final String DRIVER_FILE_NAME = "chromedriver";
    private static final String CHROME_MAXIMIZED = "start-maximized";
    public static WebDriver driver;

    /**
     * Initializes and start the chrome driver maximized
     * and adds the driver to the System path before the execution
     * of each feature.
     * @throws Throwable
     */
    @Before
    public void setUp() throws Throwable {
        // Get file to get the absolute path of it.
        // Set the absolute path of the file to the system path.
        File file = new File(getClass().getClassLoader().getResource(DRIVER_FILE_NAME).getFile());
        System.setProperty(PATH_VAR_NAME, file.getAbsolutePath());

        ChromeOptions options = new ChromeOptions();
        options.addArguments(CHROME_MAXIMIZED);

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * After the execution of each feature tearDown.
     */
    @After
    public void tearDown() {
        driver.quit();
    }
}
