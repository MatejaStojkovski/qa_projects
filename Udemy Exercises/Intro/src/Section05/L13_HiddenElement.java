package Section05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L13_HiddenElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webrdriver.chrome.driver", "C:\\Users\\matej\\OneDrive\\Desktop\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/hiddenElements.html");
		
		
		System.out.println(		
				driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(2)")).isDisplayed());

		System.out.println(		
				driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(3)")).isDisplayed());

	}

}
 