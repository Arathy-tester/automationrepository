package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{

	public static void main(String[] args) {
		WebElementCommands webelement= new WebElementCommands();
		webelement.initialiseBrowser();
		webelement.handlingWebElementCommands();
		//webelement.driverCloseAndQuit();

	}

	public void handlingWebElementCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagefield= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagefield.sendKeys("Arathy");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one' ]"));
		System.out.println(showmessagebutton.isDisplayed());
		System.out.println(showmessagebutton.isEnabled());
		showmessagebutton.click();
		
		//messagefield.clear();
		System.out.println(showmessagebutton.getCssValue("background-color"));
		System.out.println(messagefield.getTagName());
		WebElement yourmessage=driver.findElement(By.id("message-one"));
		System.out.println(yourmessage.getText());
	}
}
