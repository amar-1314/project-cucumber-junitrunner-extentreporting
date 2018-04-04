@desktop
Feature: Validate account addresses on my account page

  Scenario: Validate account addresses info on desktop
    Given user launches customer portal application on desktop
    When user logs in with user name "testcp623@fp.com" and password "test1234"
    Then user navigates to my account page
    And user validates account addresses header
      | accountAddressesHeader |
      | ACCOUNT ADDRESSES      |
    And user logs out