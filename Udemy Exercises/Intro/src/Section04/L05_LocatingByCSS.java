package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L05_LocatingByCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 	
		System.setProperty("webrdriver.chrome.driver", "C:\\Users\\matej\\OneDrive\\Desktop\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/buttons.html");
		
		driver.findElement(By.cssSelector("button#btn_one")).click();
	}

}