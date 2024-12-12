package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageAcceuil {
	WebDriver driver;
	//Création du constructeur
	public PageAcceuil(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//identification des éléments

	
	@FindBy(how = How.XPATH, using= "//a[normalize-space()='Signup / Login']")
	public static WebElement bt_signup1;
	
	@FindBy(how = How.NAME, using= "name")
	public static WebElement Name;
	
	@FindBy(how = How.XPATH, using= "//input[@data-qa='signup-email']")
	public static WebElement Email;
	
	@FindBy(how = How.XPATH, using= "//button[@data-qa='signup-button']")
	public static WebElement bt_signup2;
	
	
	
	

	//Création des méthodes
	public void saisir_URL(String URL) {
      driver.get(URL);
	}

	
	public void Click_SignUp() {
		
		bt_signup1.click();
	}
	
	public void Saisir_Name(String Text) 
	{
		Name.sendKeys(Text);
		
	}
	public void Saisir_Email(String Text) 
	{
		Email.sendKeys(Text);
		//ecrire(Email, Text);
		
	}
	
	
	public void Click_SignUp2()
	{
		bt_signup2.click();	
	}
	
	public void ecrire (WebElement element, String text)
	{
		element.sendKeys(text);
	}
	
	//connection 
	
		@FindBy(how = How.XPATH, using= "//input[@data-qa='login-email']")
		public static WebElement Mail;
		@FindBy(how = How.XPATH, using= "//input[@placeholder='Password']")
		public static WebElement Pass;
		@FindBy(how = How.XPATH, using= "//button[@data-qa='login-button']")
		public static WebElement Login;
			
		public void Saisir_mail(String Text) 
		{
			Mail.sendKeys(Text);			
		}
		public void Saisir_Pass(String Text) 
		{
			Pass.sendKeys(Text);			
		}
		public void Click_Login()
		{
			Login.click();	
		}




}
