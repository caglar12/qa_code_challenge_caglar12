@register
Feature: Register

  Scenario:	Register a user
    Given user opens registration page
    When  user is in registration page
    Then  user should be able to see the registration form with required fields
    And   user fills the form


  Scenario:	Log in for a registered user
    Given   user opens login page
    When 	user enter email and password
    Then 	user should be in dashboard page
