#encoding:iso-8859-1

@login
Feature: log in with the adimin profile

  Scenario: Input username and password and click on login button
    Given I am on the login screen and see the login
    When I input the username"Admin"
    And  I input the userpassword"admin123"
    And I click the button Login
    Then I go to the main screen and see the name "Dashboard"
