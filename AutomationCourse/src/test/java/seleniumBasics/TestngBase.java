package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
public class TestngBase {
public WebDriver driver;
	
	@BeforeMethod
	public void initialiseBrowser()
	{
		driver=new ChromeDriver();//for chrome launch
		driver.get("https://www.saucedemo.com/v1/");//give the needy browser page
		driver.manage().window().maximize();
		//driver=new FirefoxDriver();
		//driver.get("https://selenium.qabible.in");//give the needy browser page
		//driver.manage().window().maximize();
		//driver=new EdgeDriver();
		//driver.get("https://selenium.qabible.in");//give the needy browser page
		//driver.manage().window().maximize();//maximise the screen
	}
	
	@AfterMethod
	public void driverCloseAndQuit()
	{
		//driver.quit();//quit driver
	}

}
