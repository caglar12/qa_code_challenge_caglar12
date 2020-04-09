
Feature: Draft Shipments
@draft
  Scenario:	Save a shipment draft
     Given 	user opens login page
       And  user enter email and password
       And  user performs a search with the following information: Madrid -> Madrid. One parcel, 1 kg, 10 cm x 10 cm x 10 cm.
      When 	user selects the first service of the list
       And 	user clicks save button
      Then  it will appear in the shipment list
