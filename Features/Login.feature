Feature: Test the login functionality of My Store
  
  Scenario: Test the valid login
  
  //Stage 1 parametize without example keyword
  
  Given user is on signinPage
  When  click on signin button
  And   user land on login page
  Then  user enters "admin@xyz.com" and "admin@123"
  And   click on login button
  Then  user should land on home page
