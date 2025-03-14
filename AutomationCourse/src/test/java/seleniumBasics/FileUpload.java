package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base{

	public static void main(String[] args) {
		
		FileUpload fileupload=new FileUpload();
		fileupload.initialiseBrowser();
		//fileupload.verifyFileUploadUsingSendKeys();
		try {
			fileupload.FILEUPLOADUSINGROBOTCLASS();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fileupload.driverCloseAndQuit();

	}
	public void verifyFileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload");
		WebElement fileUpload=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		fileUpload.sendKeys("C:\\Users\\prade\\Downloads\\CJJPA6455P-2025.pdf");
		WebElement clickMe=driver.findElement(By.xpath("//input[@id='terms']"));
		clickMe.click();
		WebElement button=driver.findElement(By.xpath("//button[@id='submitbutton']"));
		button.click();
		
		
	}
	public void FILEUPLOADUSINGROBOTCLASS() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement choosepdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		choosepdf.click();
		StringSelection s = new StringSelection("C:\\Users\\prade\\Downloads\\CJJPA6455P-2025.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); 
		Robot robot = new Robot();
		robot.delay(2500);
		 robot.keyPress(KeyEvent.VK_ENTER);
	     
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_V);
	      
	      
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyRelease(KeyEvent.VK_V);
	      robot.keyPress(KeyEvent.VK_ENTER);
		
	}
}
