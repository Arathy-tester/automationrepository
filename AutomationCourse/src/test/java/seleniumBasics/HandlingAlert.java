package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base {

	public static void main(String[] args) {
		HandlingAlert handlingAlert= new HandlingAlert();
		handlingAlert.initialiseBrowser();
		//handlingAlert.simpleAlertHandling();
		//handlingAlert.driverCloseAndQuit();
		//handlingAlert.handlingConfirmAlert();
		handlingAlert.promptAlert();
	}
	public void simpleAlertHandling()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme=driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme.click();
		Alert alertref=driver.switchTo().alert();
		alertref.accept();
		
	}
	public void handlingConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirm=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirm.click();
		Alert alertconfirm=driver.switchTo().alert();
		alertconfirm.accept();
		
	}
	public void promptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlert.click();
		Alert alertPrompt=driver.switchTo().alert();
		alertPrompt.sendKeys("arathy");
		alertPrompt.accept();
	}
}
