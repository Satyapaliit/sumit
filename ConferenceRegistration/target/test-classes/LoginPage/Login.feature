#Author: Satyapal Kumar

Feature: Test for validation

 @satyapal
Scenario: User enters valid data
Given user is on the Login Page
When User enters the valid data 
And Clicks on the Submit button
Then Navigate to Welcome Page

  
Scenario: User enters invalid UserName
  Given user is on the Login Page
  When User enters the invalid UserName
  And Clicks on the Submit button
  Then Display Alert message

Scenario: User enters invalid Password
  Given user is on the Login Page
  When User enters the invalid Password
  And Clicks on the Submit button
  Then Display Alert message
  
  @satyapal
Scenario: User enters invalid Data
  Given user is on the Login Page
  When User enters the invalid Data
  |capgemini|123|
  |capgem|12|
  And Clicks on the Submit button
  Then Display Alert message
  
    