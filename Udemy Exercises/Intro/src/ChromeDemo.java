import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 	
		System.setProperty("webrdriver.chrome.driver", "C:\\Users\\matej\\OneDrive\\Desktop\\drivers_v1\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk");
	}

}
