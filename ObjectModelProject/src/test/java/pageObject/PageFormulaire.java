package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageFormulaire {
	WebDriver driver;
	//Création du constructeur
	
	public PageFormulaire(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//identification des éléments

	
	@FindBy(how = How.ID, using= "id_gender1")
	public static WebElement bt_title;
	
	@FindBy(how = How.ID, using= "password")
	public static WebElement Password;
	
	@FindBy(how = How.NAME, using= "days")
	public static WebElement Day;
	@FindBy(how = How.NAME, using= "months")
	public static WebElement Month;
	@FindBy(how = How.NAME, using= "years")
	public static WebElement Year;
	
	@FindBy(how = How.ID, using= "newsletter")
	public static WebElement Newsletter;
	
	@FindBy(how = How.ID, using= "optin")
	public static WebElement Option;
	
	@FindBy(how = How.ID, using= "first_name")
	public static WebElement First_name;
	
	@FindBy(how = How.ID, using= "last_name")
	public static WebElement last_name;
	
	@FindBy(how = How.ID, using= "company")
	public static WebElement Company;
	
	@FindBy(how = How.ID, using= "address1")
	public static WebElement Address1;
	
	@FindBy(how = How.ID, using= "address2")
	public static WebElement Address2;
	
	@FindBy(how = How.ID, using= "country")
	public static WebElement Country;
	
	@FindBy(how = How.ID, using= "state")
	public static WebElement State;
	
	@FindBy(how = How.ID, using= "city")
	public static WebElement City;
	
	@FindBy(how = How.ID, using= "zipcode")
	public static WebElement Zipcode;
	
	@FindBy(how = How.ID, using= "mobile_number")
	public static WebElement Mobile_number;
	
	@FindBy(how = How.XPATH, using= "//button[@data-qa='create-account']")
	public static WebElement bt_CreateAccount;
	
	@FindBy(how = How.XPATH, using= "//body/section/div/div/div/div/h2/b[1]")
	public static WebElement Message_afficher;
	
	
	public void click_bt_title()
	{
		bt_title.click();
	}
	
	public void click_bt_Newsletter()
	{
		Newsletter.click();
	}
	public void click_Option()
	{
		Option.click();
	}
	public void click_bt_CreateAccount()
	{
		bt_CreateAccount.click();
	}
	
	public void Saisir_Password(String string)
	{
		Password.sendKeys(string);
	}
	public void Saisir_First_Name(String string)
	{
		First_name.sendKeys(string);
	}
	public void Saisir_Last_Name(String string)
	{
		last_name.sendKeys(string);
	}
	public void Saisir_Company(String string)
	{
		Company.sendKeys(string);
	}
	
	public void Saisir_Address1(String string)
	{
		Address1.sendKeys(string);
	}
	public void Saisir_Address2(String string)
	{
		Address2.sendKeys(string);
	}
		public void Saisir_State(String string)
	{
		State.sendKeys(string);
	}
	public void Saisir_City(String string)
	{
		City.sendKeys(string);
	}
	public void Saisir_Zipcode(String string)
	{
		Zipcode.sendKeys(string);
	}
	public void Saisir_Mobile_Number(String string)
	{
		Mobile_number.sendKeys(string);
	}



	public void Saisir_Country(String string)
	{
		Select Country_List = new Select(Country);
		Country_List.selectByVisibleText(string);
	}
	public void Saisir_Day(String string)
	{
		Select Day_List = new Select(Day);
		Day_List.selectByVisibleText(string);
	}
	public void Saisir_Month(String string)
	{
		Select Month_List = new Select(Month);
		Month_List.selectByVisibleText(string);
	}
	public void Saisir_Year(String string)
	{
		Select Year_List = new Select(Year);
		Year_List.selectByVisibleText(string);
	}

public String Resultat_obtenue()
{
String t;
t= Message_afficher.getText();
return t;
}

}
