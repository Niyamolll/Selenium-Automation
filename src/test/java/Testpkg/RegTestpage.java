package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Regitrationpage;

public class RegTestpage {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}
@Test
public void Registrationtest() throws InterruptedException
{
   Regitrationpage ob=new  Regitrationpage(driver);
	ob.Myaccount();
	ob.Register();
	ob.Setvalues();
	ob.checkboxbutton();
	ob.Continuebutton();
	Thread.sleep(4000);
	
}
}