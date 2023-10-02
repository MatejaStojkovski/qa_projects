package Section08;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class L06_Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webrdriver.gecko.driver", "C:\\Users\\matej\\OneDrive\\Desktop\\drivers_v1\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/iframes.html");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(".toggle")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector(".toggle")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector(".ytp-button.ytp-large-play-button.ytp-large-play-button-red-bg")).click();
		
	}

}
 