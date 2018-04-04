@smokeui
Feature: Validate order grid details on order page

  Scenario: Open workbench and click on orders link and validate order grid
    Given an account exists
    When user navigates to orders page
    Then user look for orders grid
    And user look for the order
    And user clicks on the order
    And user validates order details
