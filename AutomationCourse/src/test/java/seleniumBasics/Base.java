package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;//object of Webdriver

	public static void main(String[] args) {
		
		Base base=new Base();
		base.initialiseBrowser();//call the method to initialise the browser by using base object
		base.driverCloseAndQuit();//method for quit or close the browser
	}
	public void initialiseBrowser()
	{
		driver=new ChromeDriver();//for chrome launch
		//driver.get("https://selenium.qabible.in");//give the needy browser page
		driver.manage().window().maximize();
		//driver=new FirefoxDriver();
		//driver.get("https://selenium.qabible.in");//give the needy browser page
		//driver.manage().window().maximize();
		//driver=new EdgeDriver();
		//driver.get("https://selenium.qabible.in");//give the needy browser page
		//driver.manage().window().maximize();//maximise the screen
	}
	public void driverCloseAndQuit()
	{
		driver.quit();//quit driver
	}
	
}
