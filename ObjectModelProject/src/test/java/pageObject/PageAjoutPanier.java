package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageAjoutPanier {

	
	WebDriver driver;
	//Création du constructeur
	public PageAjoutPanier(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//identification des éléments

	
	@FindBy(how = How.XPATH, using= "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
	public static WebElement bt_ADDTOCART;
	
	@FindBy(how = How.XPATH, using= "//a[@href='/view_cart']//u")
	public static WebElement bt_VIEWCART;
	
	@FindBy(how = How.XPATH, using= "//body/section/div/section/div/div/div/a[1]")
	public static WebElement bt_CheckOut;
	@FindBy(how = How.XPATH, using= "//a[normalize-space()='Place Order']")
	public static WebElement bt_PlaceOrder;
	
	@FindBy(how = How.NAME, using= "name_on_card")
	public static WebElement CardName;
	
	@FindBy(how = How.NAME, using= "card_number")
	public static WebElement CardNumber;
	@FindBy(how = How.NAME, using= "cvc")
	public static WebElement CVC;
	@FindBy(how = How.NAME, using= "expiry_month")
	public static WebElement Expiration;
	@FindBy(how = How.NAME, using= "expiry_year")
	public static WebElement Year;
	
	@FindBy(how = How.ID, using= "submit")
	public static WebElement bt_submit;
		
	@FindBy(how = How.XPATH, using= "//h2[@data-qa='order-placed']//b")
	public static WebElement ResultMessage;
	
	
	public void click_ADDTOCART()
	{
		bt_ADDTOCART.click();
	}
	
	public void click_VIEWCART()
	{
		bt_VIEWCART.click();
	}
	
	
	public void click_Checkout()
	{
		bt_CheckOut.click();
	}
	
	
	public void click_PlaceOrder()
	{
		bt_PlaceOrder.click();
	}
	
	
	public void click_Submit()
	{
		bt_submit.click();
	}
	
	
	public void Saisir_CardName(String string)
	{
           CardName.sendKeys(string);
	}
	public void Saisir_CardNumber(String string)
	{
           CardNumber.sendKeys(string);
	}
	public void Saisir_CVC(String string)
	{
           CVC.sendKeys(string);
	}
	public void Saisir_Expiration(String string)
	{
           Expiration.sendKeys(string);
	}
	public void Saisir_Year(String string)
	{
           Year.sendKeys(string);
	}
	
	
	
	
}
