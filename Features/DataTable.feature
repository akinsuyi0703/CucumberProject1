Feature: Test the login functionality of MyStore using Data 
Table
  
  Scenario: Test the valid login using DataTable
  
   Stage 1 example go to LoginSteps
  
  Given user is on signinPage
  When  click on signin button
  And   user land on login page
  Then  user enters credentials using DataTable
     |admin@xyz.com|admin@123|
  And   click on login button
  Then  user should land on home page

 