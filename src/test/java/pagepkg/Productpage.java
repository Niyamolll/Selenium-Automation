package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;



public class Productpage extends Homepage {
public Productpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
}

//addtocart laptops
@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[1]")
WebElement Apple;
@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[2]")
WebElement Applewish;
@FindBy(xpath="//*[@id=\"input-option218\"]/div/label/input")
WebElement smallradiobutton ;
@FindBy(xpath="//*[@id=\"input-option223\"]/div[1]/label/input")
WebElement Applecheckbox ;
@FindBy(xpath="//*[@id=\"input-option208\"]")
WebElement textfield ;
@FindBy(xpath="//*[@id=\"input-option217\"]")
WebElement selectdropdown;
@FindBy(xpath="//*[@id=\"input-option209\"]")
WebElement Textarea ;
@FindBy(xpath="//*[@id=\"button-upload222\"]")
WebElement Fileupload ;
@FindBy(xpath="//*[@id=\"product\"]/div[7]/div/span/button/i")
WebElement Datepicker ;
@FindBy(xpath="//*[@id=\"product\"]/div[8]/div/span/button/i")
WebElement Timepicker;
@FindBy(xpath="//*[@id=\"product\"]/div[9]/div/span/button/i")
WebElement DateandTime ;
@FindBy(xpath="//*[@id=\"input-quantity\"]")
WebElement Quantity ;
@FindBy(xpath="//*[@id=\"button-cart\"]")
WebElement Addtocart;


public void Applecart()
{
	Apple.click();

}
public void AppleoWishlist()
{
	Applewish.click();
	

}

public void smallradiobutton()
{
	smallradiobutton.click();
}

public void Applecheckbox()
{
	Applecheckbox.click();
}
public void textfield()
{
	textfield.clear();
	textfield.sendKeys("niyasabu");
}

public void selectdropdownn()
{
	 Select dropdown=new Select(selectdropdown);  
	  dropdown.selectByValue("3");
}
public void Textarea()
{
Textarea.sendKeys("Canon EOS 5Dddd");
}

public void Datepicker()
{
	Datepicker.click();
}
public void Timepicker()
{
	Timepicker.click();
}
public void DateandTime()
{
	 DateandTime.click();
}
public void Quantity()
{
	Quantity.click();
}
public void Addtocart()
{
	Addtocart.click();
}





}




