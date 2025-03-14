package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{

	public static void main(String[] args) {
		HandlingFrames handlingFrames= new HandlingFrames();
		handlingFrames.initialiseBrowser();
		handlingFrames.handlingFrames();
		//handlingFrames.driverCloseAndQuit();

	}
	public void handlingFrames()
	{
	driver.navigate().to("https://demoqa.com/frames");
	List<WebElement>iFrames=driver.findElements(By.tagName("iframe"));
	System.out.println((iFrames.size()));
	WebElement firstframe=driver.findElement(By.id("frame1"));
	driver.switchTo().frame(firstframe);
	WebElement frameText=driver.findElement(By.id("sampleHeading"));
	System.out.println(frameText.getText());
	driver.switchTo().defaultContent();
	System.out.println(driver.getTitle());
	
	}
}
