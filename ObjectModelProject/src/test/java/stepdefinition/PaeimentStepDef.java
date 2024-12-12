package stepdefinition;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageAcceuil;
import pageObject.PageAjoutPanier;


public class PaeimentStepDef {
	//liaison mta3 driver b setup 
		public WebDriver driver= Setup.driver;				
		//initialisation des Pages Object
		
		PageAcceuil Acceuil= new PageAcceuil(driver);
		PageAjoutPanier Panier= new PageAjoutPanier(driver);


@When("choisir un article")
public void choisir_un_article() {
	Panier.click_ADDTOCART();
   
}

@When("clique sur Regarder Panier")
public void clique_sur_regarder_panier() {
	Panier.click_VIEWCART();
    
}

@When("clique sur check")
public void clique_sur_check() {
	Panier.click_Checkout();
    
}

@When("clique sur place order")
public void clique_sur_place_order() {
	Panier.click_PlaceOrder();
}

@When("Remplir Name of card {string}")
public void remplir_name_of_card(String string) {
	Panier.Saisir_CardName(string);
}
@When("Remplir Card Number {string}")
public void remplir_card_number(String string) {
	Panier.Saisir_CardNumber(string);   
}

@When("Remplir CVV: {string}, Expiration : {string} , at annee {string}")
public void remplir_cvv_expiration_at_annee(String string, String string2, String string3) {
	Panier.Saisir_CVC(string);
	Panier.Saisir_Expiration(string2);
	Panier.Saisir_Year(string3);
}

@When("cliquer sur payer")
public void cliquer_sur_payer() {
	Panier.click_Submit();
   
}

@Then("verifier ue le paiement est fait {string}")
public void verifier_ue_le_paiement_est_fait(String string) {
	Assert.assertEquals(string, Panier.ResultMessage.getText());
}

}
