import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_3 {
	
	
@Test

public void testcase3()
{
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElementById("email").sendKeys("Hello");
	driver.findElementById("pass").sendKeys("Hello");
	driver.quit();
	
	
}
	
	


}




