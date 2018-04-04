@demotest
Feature: Verify user able to login to application

  Scenario: Login and logout
    Given user on customer portal login page.
    When user logs in with user name "testcp@623@fp.com" and password "test1234".
    Then user logs out.


