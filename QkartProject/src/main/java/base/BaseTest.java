package base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 public WebDriver driver;
	    public Properties prop;

	   @BeforeMethod
	    public void setUp() throws Exception {
	        // Load properties
	        prop = new Properties();
	        FileInputStream fis = new FileInputStream("config.properties");
	        prop.load(fis);

	        // Setup Chrome browser
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(
	                Integer.parseInt(prop.getProperty("implicitWait", "10"))));

	        // Navigate to URL from properties
	        driver.get(prop.getProperty("url"));
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
