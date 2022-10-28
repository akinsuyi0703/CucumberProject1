Feature: Test the login functionality of My Store
  
  /*Scenario: Test the valid login
  
   Stage 1 parametize without example keyword
  
  Given user is on signinPage
  When  click on signin button
  And   user land on login page
  Then  user enters the "admin@xyz.com" and "admin@123"
  And   click on login button
  Then  user should land on home page*/

  //stage 2 parametize with example keyword
  Scenario Outline: Test the valid login
    Given user is on signinPage
    When click on signin button
    And user land on login page
    Then user enters the <username> and <password>
    And click on login button
    Then user should land on home page

    Examples: 
      | username      | password  |
      | admin@xyz.com | admin@123 |
      | dewy@bky.com  | dewy@123  |
