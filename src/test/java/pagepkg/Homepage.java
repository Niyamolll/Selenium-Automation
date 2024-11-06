package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;



public class Homepage  {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
}
	@FindBy(xpath="//*[@id=\"form-currency\"]/div/button/i")
	WebElement currency;
	@FindBy(xpath="//*[@id=\"form-currency\"]/div/ul/li[3]/button")
	WebElement Dollar;
	@FindBy(xpath="//*[@id=\"search\"]/input")
	WebElement search;
	@FindBy(xpath="//*[@id=\"search\"]/span/button/i")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
	WebElement Desktop;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a")
	WebElement showdesktop ;
	
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
	WebElement laptops;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
	WebElement showlaptops;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[3]/a")
	WebElement components;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[2]/a")
	WebElement monitors;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[4]/a")
	WebElement tablets;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[5]/a")
	WebElement software;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[6]/a")
	WebElement PDAs;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[7]/a")
	WebElement cameras;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[8]/a")
	WebElement M3player;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[8]/div/a")
	WebElement showM3player;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void currencyy()
	{
		currency.click();
	}
	public void dollar()
	{
		Dollar.click();
	}
	
	
	
	
	public void Entervalues()
	{
	search.sendKeys("Canon EOS 5D");
	}
public void searchbuttton()	
{
	searchbutton.click();
}





public void desktop()
{
Desktop.click();
}
public void showdesktop()
{
	showdesktop.click();
}



public void laptops()
{
	laptops.click();
}
public void showlaptops()
{
	showlaptops.click();
}
public void components()
{
	components.click();
}
public void cmonitors()
{
	monitors.click();
}


public void tablets()
{
	tablets.click();
}



public void software()
{
	software.click();
}



public void PDAs()
{
	PDAs.click();
}



public void cameras()
{
	cameras.click();
}
public void M3player()
{
	M3player.click();
}

public void showM3player()
{
	 showM3player.click();
}





}
