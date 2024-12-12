@AjoutPanier
Feature: Validation Panier
  I want to do an Achat

  Background: authentification
    Given Saisir URL du site "https://automationexercise.com/"
    When clique sur Signup pour Connecter
    And Saisir Mail "mlachiheb@gmail.com"
    And Saisir PW "123456790"
    And click Login
    Then Verify

  @Achat
  Scenario: Achat et validation
    When choisir un article
    And clique sur Regarder Panier
    And clique sur check
    And clique sur place order
    And Remplir Name of card "Master card"
    And Remplir Card Number "1235789"
    And Remplir CVV: "126", Expiration : "12" , at annee "2028"
    And cliquer sur payer
    Then verifier ue le paiement est fait "ORDER PLACED!"
