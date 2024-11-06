package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;



public class Loginpage{
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
}
@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
WebElement Myacc;
@FindBy(xpath="//*[@id=\"input-email\"]")
WebElement username;
@FindBy(xpath="//*[@id=\"input-password\"]")
WebElement pswdlogin;
@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
WebElement loginbutton;

public Loginpage (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void dropdown()
{
	Select dropdown=new Select(Myacc);
	dropdown.selectByVisibleText("Login");
}
public void Entervalues(String username1,String password)
{
	username.sendKeys(username1);
	pswdlogin.sendKeys(password);
	
}
public void loginbutton()
{
	loginbutton.click();
	
}



}
