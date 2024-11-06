package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;



public class Regitrationpage {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
}
@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")
WebElement Myacc;
@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
WebElement Register;
@FindBy(xpath= "//*[@id=\"input-firstname\"]")
WebElement fname;
@FindBy(xpath= "//*[@id=\"input-lastname\"]")
WebElement Lname;
@FindBy(xpath= "//*[@id=\"input-email\"]")
WebElement email;
@FindBy(xpath= "//*[@id=\"input-telephone\"]")
WebElement phone;
@FindBy(xpath= "//*[@id=\"input-password\"]")
WebElement pswd;

@FindBy(xpath= "//*[@id=\"input-confirm\"]")
WebElement conpswd;
@FindBy(xpath= "//*[@id=\"content\"]/form/div/div/input[1]")
WebElement checkbox;

@FindBy(xpath= "//*[@id=\"content\"]/form/div/div/input[2]")
WebElement Continue;

public Regitrationpage (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void Myaccount()
{
	Myacc.click(); 
}
public void Register()
{
	Register.click();
}
public void Setvalues()
{
	fname.sendKeys("sudha");
	Lname.sendKeys("mahesh");
	email.sendKeys("sudhaaah@gmail.com");
	phone.sendKeys("994601102");
	pswd.sendKeys("12345677");
	conpswd.sendKeys("12345677");
}
public void checkboxbutton()
{
	checkbox.click();
}
public void Continuebutton() throws InterruptedException
{
	Continue.click();
	
}









}
