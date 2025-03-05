package seleniumBasics;

public class HandlingNavigationCommands extends Base{

	public static void main(String[] args) {
		HandlingNavigationCommands navigate= new HandlingNavigationCommands();
		navigate.initialiseBrowser();
		navigate.handlingNavigationCommands();
		navigate.driverCloseAndQuit();
	}
	public void handlingNavigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");//navigate to another web page
		driver.navigate().back();//navigate back to previous page:Obsqura
		driver.navigate().forward();//navigate forward to next page:Amazon
		driver.navigate().refresh();//refresh the last loaded page:Amazon
	}
}
