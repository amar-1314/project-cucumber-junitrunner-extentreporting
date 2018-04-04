@testLead
Feature: Create lead

  Scenario: Launch workbench and create lead
    Given user on workbench sales screen
    When user clicks on new lead link
    Then user creates lead with
      | leadSource                 | firstName | lastName | phone  | email  | subId | propertyType | companyName | address1              | address2 | zipcode | city  | state | country |
      | Nationwide Group (Inbound) | John      | Smith    | Unique | Unique |       | Residential  |             | 25700 Spring Race Ter | Apt E    | 20105   | Aldie | VA    | US      |
    And user clicks on save lead
    And user confirm TCPA permission
    And user gets leadId

