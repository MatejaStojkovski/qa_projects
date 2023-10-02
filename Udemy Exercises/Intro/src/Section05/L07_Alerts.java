package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L07_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webrdriver.chrome.driver", "C:\\Users\\matej\\OneDrive\\Desktop\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/popups.html");
		
		driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
		
		Thread.sleep(3000);
		
		//if we want to be clicked the alert 
		driver.switchTo().alert().accept();
		
		//if we want to be canceled 
		//driver.switchTo().alert().dismiss();
		
		
	}

}
 