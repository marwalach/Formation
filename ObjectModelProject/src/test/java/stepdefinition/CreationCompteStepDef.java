package stepdefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageAcceuil;
import pageObject.PageFormulaire;

public class CreationCompteStepDef {
	//liaison mta3 driver b setup 
	// w marbout zada bil les pages objects 
	public WebDriver driver= Setup.driver;

			
	//initialisation des Pages Object
	
	PageAcceuil Acceuil= new PageAcceuil(driver);
	PageFormulaire Formulaire = new PageFormulaire(driver);
	
	@Given("Saisir URL du site {string}")
	public void saisir_url_du_site(String string) {
       Acceuil.saisir_URL(string);
	}

	@When("clique sur Signup pour créer un compte")
	public void clique_sur_signup_pour_créer_un_compte() {
		Acceuil.Click_SignUp();
	    
	}

	@When("Saisir Name {string}")
	public void saisir_name(String string) {
		Acceuil.Saisir_Name(string);
	  
	}

	@When("Saisir Email {string}")
	public void saisir_email(String string) {
		Acceuil.Saisir_Email(string);
	}

	@When("Click Signup button")
	public void click_signup_button() {
		Acceuil.Click_SignUp2();
	    
	}

	@When("verification account")
	public void verification_account() {
	    
	}

	@When("fill title")
	public void fill_title() {
	    Formulaire.click_bt_title();
	}

	@When("fill password {string}")
	public void fill_password(String string) {
		Formulaire.Saisir_Password(string);
	}

	@When("fill date of birth {string} , {string} , {string}")
	public void fill_date_of_birth(String string1, String string2, String string3) {
		Formulaire.Saisir_Day(string1);
		Formulaire.Saisir_Month(string2);
		Formulaire.Saisir_Year(string3);
	    
	}

	@When("Select checkbox signup newsletter")
	public void select_checkbox_signup_newsletter() {
		Formulaire.click_bt_Newsletter();
	    
	}

	@When("Select checkbox Receive new offers")
	public void select_checkbox_receive_new_offers() {
		Formulaire.click_Option();
	    
	}

	@When("fill First name: {string}, Last name: {string},Company: {string}, Adresse: {string}, Adresse2: {string}")
	public void fill_first_name_last_name_company_adresse_adresse(String string, String string2, String string3, String string4, String string5) {
		Formulaire.Saisir_First_Name(string);
		Formulaire.Saisir_Last_Name(string2);
		Formulaire.Saisir_Company(string3);
		Formulaire.Saisir_Address1(string4);
		Formulaire.Saisir_Address2(string5);
		
		
	}

	@When("fill Again Country: {string}, State: {string}, City: {string}, Zipcode: {string}, Mobile Number: {string}")
	public void fill_again_country_state_city_zipcode_mobile_number(String string, String string2, String string3, String string4, String string5) {
		Formulaire.Saisir_Country(string);
		Formulaire.Saisir_State(string2);
		Formulaire.Saisir_City(string3);
		Formulaire.Saisir_Zipcode(string4);
		Formulaire.Saisir_Mobile_Number(string5);
	}

	@When("Click Create Account Button")
	public void click_create_account_button() {
		Formulaire.click_bt_CreateAccount();
	  
	}
// l'assert dima tetkhdam fil step def et non plus fil object model
	@Then("Verify that Account Created Visible {string}")
	public void verify_that_account_created_visible(String string) {
		//Assert.assertEquals(Formulaire.Resultat_obtenue(), string);
	   
	}


}
