package Section05;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L11_Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webrdriver.chrome.driver", "C:\\Users\\matej\\OneDrive\\Desktop\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/popups.html");

		driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
		//getting the window handle id of the main window
		String MainWindow = driver.getWindowHandle();
		//using a set to store all the open window handle id's
		Set<String> handles = driver.getWindowHandles();
		//crating an iterator object to parse through each value in the set 
		Iterator <String> iterate = handles.iterator();
		//while loop checks to see if there is a next value in the set 
		while(iterate.hasNext()) {
			//child  variable stores the value of the next window handle id 
			String child = iterate.next();
			
			//! checks to make sure the Main window id is not the same as the child window
			
			if(!MainWindow.equalsIgnoreCase(child)) {
				Thread.sleep(3000);
				//switches focus to the child window
				driver.switchTo().window(child);
				//close it 
				driver.close();
			}
		}
		Thread.sleep(3000);
		//brings focus back to the main window 
		driver.switchTo().window(MainWindow);
		// clicks the triger button, proving focus was returned to the main window 
		driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
	}

}
 