@desktop
Feature: Validate account info on my account page

  @testrun
  Scenario: Validate account info on desktop
    Given user launches customer portal application on desktop
    When user logs in with user name "testcp623@fp.com" and password "test1234"
    Then user navigates to my account page
    And user validates account info section with
      | accountInfoHeader | nameLabel | emailLabel | primaryPhoneLabel | secondaryPhoneLabel | name          | email            | primaryPhone | secondaryPhone |
      | ACCOUNT INFO      | Name      | Email      | Primary Phone     | Secondary Phone     | Jayme Rodgers | testcp623@fp.com | 557-894-9240 | 848-596-5874   |
    And user logs out

  @testrun
  Scenario: Edit account info and validate
    Given user launches customer portal application on desktop
    When user logs in with user name "testcp623@fp.com" and password "test1234"
    Then user navigates to my account page
    And user click on edit account info icon
    And user edits primary phone number with "557-894-9239"
    And user clicks on save button
#    And user validates primary phone "557-894-9240"
    And user validates account info section
    And user logs out

