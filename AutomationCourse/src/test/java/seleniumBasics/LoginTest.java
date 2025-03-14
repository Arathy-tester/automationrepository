package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestngBase{

@Test(description="verify whether user is successfully login with valid credentials")
	public void verifyWetherUserCanLoginwithValidCredentials()
	{
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField();
		login.enterPasswordOnPasswordField();
		login.clickOnClick();
		
	}
@Test(description="verify whether user is successfully login with invalid username and valid password a credentials")	
	public void verifyWetherUserCanLoginwithInvalidUsernameandValidpasswordCredentials1()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("arathy");
		WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	
	}
@Test(description="verify whether user is successfully login with valid username and invalid password a credentials")
	public void verifyWetherUserCanLoginwithValidalidUsernameandInvalidpasswordCredentials1()
	{
	WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
	userName.sendKeys("standard_user");
	WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
	passWord.sendKeys("abc");
	WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();

	}
@Test(description="verify whether user is successfully login with invalid username and invalid password a credentials")
public void verifyWetherUserCanLoginwithInValidalidUsernameandInvalidpasswordCredentials1()
{
WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
userName.sendKeys("arathy");
WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
passWord.sendKeys("abc");
WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
login.click();

}
}
