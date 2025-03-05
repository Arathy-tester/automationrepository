package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public static void main(String[] args) {
		TableHandling tableHandling= new TableHandling();
		tableHandling.initialiseBrowser();
		//tableHandling.driverCloseAndQuit();
		tableHandling.tablehandle();
	}
	public void tablehandle()
	{
	driver.navigate().to("https://money.rediff.com/indices/nse");
	WebElement tablehandle=driver.findElement(By.xpath("//a[@id='showMoreLess']"));
	tablehandle.click();
	WebElement fulltable=driver.findElement(By.xpath("//table[@id='dataTable']"));
	System.out.println(fulltable.getText());
	WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
	System.out.println((tablerow.getText()));
	
	}
}


