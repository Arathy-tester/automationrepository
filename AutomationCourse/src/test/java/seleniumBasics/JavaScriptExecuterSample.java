package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuterSample extends Base {

	public static void main(String[] args) {
		JavaScriptExecuterSample javaScriptExecuterSample= new JavaScriptExecuterSample();
		javaScriptExecuterSample.initialiseBrowser();
		javaScriptExecuterSample.javaScriptExecuterSample();
		//javaScriptExecuterSample.driverCloseAndQuit();
		// TODO Auto-generated method stub

	}
	public void javaScriptExecuterSample()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver; //because of interface, no object is created only class name
		js.executeScript("arguments[0].click();", showMessageButton);
		//js.executeScript("window.scrollBy(0,350)", "");
		//js.executeScript("window.scrollBy(0,-350)", "");
		js.executeScript("window.scrollBy(0,350)", "");

	}
}
