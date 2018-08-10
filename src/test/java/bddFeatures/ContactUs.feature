
Feature: Contact us with data table example

  Scenario: Contact us
    Given User is on application home page to view contact us
    And User clicks on Contact us link
    When enters firstname as "firstname"
    And enters lastname as "lastname"
    And enters email as "lastname@asd.cv"
    And enters comments as 
    |comment1|comment2|
    And clicks on submit button
    Then "Thank You for your Message!" should be displayed
