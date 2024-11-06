package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Loginpage;
import utilities.Excelutilities;

public class LoginTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	@Test
	public void logintest() throws InterruptedException
	{
		Loginpage obj= new Loginpage(driver);
		String X1="C:\\Users\\siyas\\Downloads\\demotutoriyal.xlsx";
				String sheet="sheet1";
	
	
	 int rowCount = Excelutilities.getRowCount(X1, sheet);

     for (int i=1;i<=rowCount;i++)

     {

                 String UserName=Excelutilities.getCellValue(X1, sheet, i, 0);
                    System.out.println("username---"+UserName);
                 String Pwd=Excelutilities.getCellValue(X1, sheet, i, 1);
                  System.out.println("password---"+Pwd);
                 
                 obj.Entervalues(UserName, Pwd);
                 
                 driver.navigate().refresh();
                 driver.navigate().refresh();
                 obj.loginbutton(); 
                 
                  
                driver.navigate().refresh();
                driver.navigate().refresh();
                 Thread.sleep(1000);
	
     }
	
     System.out.println("login test case passed");
	}
	

	
	
}
