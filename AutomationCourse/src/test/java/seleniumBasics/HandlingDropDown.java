package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base{

	public static void main(String[] args) {
		HandlingDropDown drop= new HandlingDropDown();
		drop.initialiseBrowser();
		drop.handingDropDown();
		//drop.driverCloseAndQuit();

	}
	public void handingDropDown()
	{
	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement dropdown1=driver.findElement(By.id("dropdowm-menu-1"));
	Select select= new Select(dropdown1);
	//select.selectByIndex(2);
	//select.selectByVisibleText("C#");
	select.selectByValue("sql");
	}
}

