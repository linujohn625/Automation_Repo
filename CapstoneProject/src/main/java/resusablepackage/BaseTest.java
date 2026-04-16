package resusablepackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public static  WebDriver driver;
	 @BeforeMethod
	    public void AppLaunch() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://qainterview.pythonanywhere.com/");
	    }
	    @AfterMethod
	    public void Appclose() {
	       driver.close();
	    }
}


