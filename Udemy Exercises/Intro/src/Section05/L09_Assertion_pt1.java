package Section05;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L09_Assertion_pt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webrdriver.chrome.driver", "C:\\Users\\matej\\OneDrive\\Desktop\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk");

		String pageTitle = driver.getTitle();
		
		Assert.assertEquals("Homepage",pageTitle);
		
	}

}
 