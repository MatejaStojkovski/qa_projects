package Section05;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L10_Assertion_pt2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webrdriver.chrome.driver", "C:\\Users\\matej\\OneDrive\\Desktop\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://teststore.automationtesting.co.uk/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
		
		driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
		Thread.sleep(3000);
		String total = driver.findElement(By.cssSelector(".product-total > .value")).getText();

		Assert.assertEquals("$26.12", total);
	}

}
 