package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{

	public static void main(String[] args)  {
		HandlingActions handlingactions=new HandlingActions();
		handlingactions.initialiseBrowser();
		//handlingactions.verifymousehover();
		//handlingactions.verifydraganddrop();
		try {
			handlingactions.verifyKeyBoardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//handlingactions.verifyrightclick();
		//handlingactions.driverCloseAndQuit();
		
	}
	public void verifyrightclick()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmessage=driver.findElement(By.id("button-one"));
		Actions action=new Actions(driver);
		action.contextClick(showmessage).build().perform();
	}
	public void verifymousehover()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement mousehover=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));//xpath by using text
		Actions action=new Actions(driver);
		action.moveToElement(mousehover).build().perform();
	}
	public void verifydraganddrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drag,drop).build().perform();
	}
	public void verifyKeyBoardActions() throws AWTException
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		
	}
	
}
