package stepdefinition;

import org.openqa.selenium.WebDriver;

import hooks.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageAcceuil;
public class ConnectionStepDef {
	//liaison mta3 driver b setup 

	public WebDriver driver= Setup.driver;
		//initialisation des Pages Object
   PageAcceuil Acceuil= new PageAcceuil(driver);

@When("clique sur Signup pour Connecter")
public void clique_sur_signup_pour_connecter() {
	Acceuil.Click_SignUp();
    
}

@When("Saisir Mail {string}")
public void saisir_mail(String string) {
	Acceuil.Saisir_mail(string);
    }

@When("Saisir PW {string}")
public void saisir_pw(String string) {
	Acceuil.Saisir_Pass(string);
    
}

@When("click Login")
public void click_login() {
	Acceuil.Click_Login();
   
}

@Then("Verify")
public void verify() {
   
}


}
