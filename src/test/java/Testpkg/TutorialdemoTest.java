package Testpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import pagepkg.Homepage;
import pagepkg.Loginpage;
import pagepkg.Productpage;

public class TutorialdemoTest {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	@Test(priority=2)
	public void logintest() throws InterruptedException
	{
		Loginpage log=new Loginpage(driver);
		log.Entervalues("saritha@gmail.com", "123456");
		log.loginbutton();
		Thread.sleep(4000);
	}
	@Test(priority=3)
	public void title()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Qafox.com";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("non matched");
		}
	}
	@Test(priority=4)
	public void homepagetest() throws InterruptedException
	{
         Homepage home =new Homepage(driver);
         home.currencyy();
         home.dollar();
         
        home.Entervalues();
        
        home.searchbuttton();
         Thread.sleep(2000);
     
         home.desktop();
         home.showdesktop();
        Thread.sleep(2000);
        home.laptops();
        home.showlaptops();
        Thread.sleep(2000);
         home.components();
        home.cmonitors();
        Thread.sleep(2000);
         home.tablets();
         home.software();
         home.PDAs();
         home.cameras();
         home.M3player();
        home.showM3player();
         Thread.sleep(4000);
         
	}
	@Test(priority=5)
	public void ProductpageTest() throws InterruptedException
	{
		Productpage product= new Productpage(driver);
		product.desktop();
		product.showdesktop();
		//Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)"," ");
		Thread.sleep(2000);
		product.Applecart();
		Thread.sleep(2000);
		product.smallradiobutton();
		product.Applecheckbox();
		product.textfield();
		
		product.selectdropdownn();
	 
		product.Textarea();
		//Thread.sleep(4000);
		
		System.out.println("Successfully navigate to next pages");
		
		
	}

	@Test(priority=6)
	public void Fileupload() throws AWTException
	{
		driver.findElement(By.xpath("//*[@id=\"button-upload222\"]")).click();
	
		
		fileUpload("C:\\Users\\siyas\\Downloads\\The Blue Eye Technology.pdf");
		
		
	}
	public void fileUpload(String p) throws AWTException
	{
		StringSelection strSelection = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
		
		
		Robot robot= new Robot();
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	//Alert a	=driver.switchTo().alert();
	//String alerttext=a.getText();
	//System.out.println(alerttext);
  // a.accept();
			
	}
	@Test(priority=7)
public void addtocart()
{
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		
				
}
	@Test(priority=1)
	public void Screenshot() throws IOException
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./Screenshot/pagescreenshot.png"));
		
}
}