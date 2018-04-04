@createinitial
Feature: Create quote

  Background: Create lead
    Given user on workbenck sales screen
    When user clicks on new lead link
    Then user creates lead
      | leadSource             | firstName | lastName | phone | email | subId | propertyType | address1 | address2 | zipCode | city | state |
      | Organic: Untagged DNIS | fake      | fake     | fake  | fake  |       | Residential  | fake     | fake     | fake    | fake | fake  |
    And user clicks on save lead
    And user confirm TCPA permission
    And user gets leadId

  Scenario: Create quote
    Given user on quote screen
    When user key in quote values
    Then user save quote
    And user gets quoteid
