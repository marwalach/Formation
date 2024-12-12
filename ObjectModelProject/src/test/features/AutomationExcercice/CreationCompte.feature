@PageCréation
Feature: Creation Compte
  je veux créer un compte en tant que utilisateur

  @Création
  Scenario: Création compte Homme
    Given Saisir URL du site "https://automationexercise.com/"
    When clique sur Signup pour créer un compte
    And Saisir Name "Marwa"
    And Saisir Email "mlachiheb2@gmail.com"
    And Click Signup button
    And verification account
    And fill title
    And fill password "123456790"
    And fill date of birth "10" , "November" , "1990"
    And Select checkbox signup newsletter
    And Select checkbox Receive new offers
    And fill First name: "MARWA", Last name: "Othmane",Company: "Company", Adresse: "Bengardenne", Adresse2: "Ezzahra"
    And fill Again Country: "Canada", State: "Canada", City: "Canada", Zipcode: "4160", Mobile Number: " 25422502"
    And Click Create Account Button
    Then Verify that Account Created Visible ""
@Connection
  Scenario: Connection a un compte
  Given Saisir URL du site "https://automationexercise.com/"
    When clique sur Signup pour Connecter 
    And Saisir Mail "mlachiheb@gmail.com"
    And Saisir PW "123456790"
    And click Login
    Then Verify