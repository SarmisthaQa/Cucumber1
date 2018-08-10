  @Smoke
Feature: Login to webdriveruniversity website
  I want login to webdriveruniversity website with different users
  

  Scenario Outline: Login with user name and password
  Given User is on application home page
    And clicks on login section
    When enters username as "<username>"
    And enters password as "<pwd>"
    And clicks on login button
    Then user will get "<msg>" message
    
    Examples: 
      | username  | pwd 			 | msg  |
      | name1		  |     5			 | validation failed |
      | webdriver |webdriver123| validation succeeded    |
