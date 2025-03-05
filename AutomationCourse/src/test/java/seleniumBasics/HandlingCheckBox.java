package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckBox extends Base{

	public static void main(String[] args) {
		HandlingCheckBox handlingcheckbox= new HandlingCheckBox();
		handlingcheckbox.initialiseBrowser();
	
		//handlingcheckbox.driverCloseAndQuit();
		handlingcheckbox.handlingCheckBox();
		//handlingcheckbox.handlingradioButton();

	}
		public void handlingCheckBox()
		{
			driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			WebElement checkbox2=driver.findElement(By.xpath("//input[@value='option-1']"));
			//System.out.println(checkbox2.isSelected());
			checkbox2.click();
			System.out.println(checkbox2.isSelected());
		}
		public void handlingradioButton()
		{
			driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			WebElement checkbox3=driver.findElement(By.xpath("//form[@id='radio-buttons']"));
			checkbox3.click();
			
		}
}
