package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.PropertiesReader;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class StepsHooks {

    public static Properties p;
    public static WebDriver driver;

    /**
     * Initializes and start the chrome driver maximized
     * and adds the driver to the System path before the execution
     * of each feature.
     * @throws Throwable
     */
    @Before
    public void setUp() throws Throwable {

        p = new PropertiesReader().getProperties();
//        // Get the chrome driver absolute file path
//        String driverName;
//        String osFlag = p.getProperty("OS_FLAG");
//        if (osFlag.equals("LINUX")) {
//            driverName = p.getProperty("DRIVER_FILE_NAME_LINUX");
//        } else if (osFlag.equals("MAC")) {
//            driverName = p.getProperty("DRIVER_FILE_NAME_MAC");
//        } else {
//            driverName = p.getProperty("DRIVER_FILE_NAME_WIN");
//        }
//        URL url = getClass().getClassLoader().getResource(driverName);
//        File file = new File(url.getFile());
//        // Set the file path to the system path
//        System.setProperty(p.getProperty("PATH_VAR_NAME"), file.getAbsolutePath());

        WebDriverManager.chromedriver().setup();

        // Create Append Chrome Options with chrome maximized
        ChromeOptions options = new ChromeOptions();
        options.addArguments(p.getProperty("CHROME_MAXIMIZED"));

        // Open the driver and set implicit wait to 10 seconds
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
