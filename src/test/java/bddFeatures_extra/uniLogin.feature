Feature: Login to webdriveruniversity website
  I want login to webdriveruniversity website with different users
  
  Background: 
   Given User is on application home page
    And clicks on login section

  @tag1
  Scenario: Login with valid user name and password
    When enters username as "sara"
    And enters password as "sara_pwd"
    Then user should be able to login

  @tag2
  Scenario: Login with invalid user name and password
    When enters username as "sara_invalid"
    And enters password as "sara_pwd_wrong"
    Then user should not be able to login
