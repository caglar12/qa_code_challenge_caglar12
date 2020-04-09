@search
Feature: Search

  Scenario:	Search services
    Given   user opens login page
      And   user enter email and password
     When 	user performs a search with the following information: Madrid -> Madrid. One parcel, 1 kg, 10 cm x 10 cm x 10 cm.
     Then 	user selects the first service of the list
