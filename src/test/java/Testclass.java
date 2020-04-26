import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bussinesslogic.PageLogic;

public class Testclass {
	
	@Test
	public void test() {
			System.setProperty("webdriver.chrome.driver", "F:\\Workspaces\\Wingiify\\Code\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ; 
		driver.get("https://www.facebook.com");
		/*PageLogic test = new PageLogic (driver);
		test.validateFunctionality();*/
	}

}
