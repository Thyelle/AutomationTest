#encoding:iso-8859-1
@register
Feature: Successful Candidate Creation

  @aces_register
  Scenario: Access the candidate registration screen
    Given I am on the system dashboard and I click on the recruitment side menu
    When When I click on add on the recruitment screen
    Then the system redirects the user to the registration screen

  @register_successfully
  Scenario: User admin perform a new candidate registration
    Given that I am on the registration screen
    When I fill in all the fields correctly
    And click the Save button
    Then the system displays the success message and the new candidate on the screen


    
