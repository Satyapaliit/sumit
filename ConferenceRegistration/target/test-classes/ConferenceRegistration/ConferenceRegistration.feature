#Author:Satyapal Kumar


Feature: Validating the Conference Registration Page


Scenario: Validate the Title of the ConferenceRegistration Page
Given The User is on the Conference Registration Page
Then Check the Title of the Conference Registration Page 




Scenario: First Name Empty
Given The User is on the Conference Registration Page
When user leaves the First Name Empty
And Clicks on the Next
Then Display the Error Message

Scenario: Last Name Empty
Given The User is on the Conference Registration Page
When user leaves the Last Name Empty
And Clicks on the Next
Then Display the Error Message


Scenario: Invalid Email 
Given The User is on the Conference Registration Page
When user leaves the Invalid Email
And Clicks on the Next
Then Display the Error Message


Scenario: Phone Empty
Given The User is on the Conference Registration Page
When user leaves the Phone Empty
And Clicks on the Next
Then Display the Error Message



Scenario: Invalid Mobile Number  
Given The User is on the Conference Registration Page
When User Mobile Number is Invalid
And Clicks on the Next
Then Display the Error Message


Scenario: Number of Persons Not Selected
Given The User is on the Conference Registration Page
When user Does not select the Number of Persons
And Clicks on the Next
Then Display the Error Message


Scenario: Building Empty
Given The User is on the Conference Registration Page
When user leaves Building Name Empty
And Clicks on the Next
Then Display the Error Message


Scenario: Area Name Empty
Given The User is on the Conference Registration Page
When user leaves Area Name Empty
And Clicks on the Next
Then Display the Error Message



Scenario: City Not Selected
Given The User is on the Conference Registration Page
When user Does not select the City
And Clicks on the Next
Then Display the Error Message


Scenario: State Not Selected
Given The User is on the Conference Registration Page
When user Does not select the State
And Clicks on the Next
Then Display the Error Message

Scenario: Membership Status Not Selected
Given The User is on the Conference Registration Page
When user Does not select the Membership Status
And Clicks on the Next
Then Display the Error Message


Scenario: Successful Registration
Given The User is on the Conference Registration Page
When User enters all valid data
And Clicks on the Next
Then Navigate to the payment Page


Scenario: Validate the Title of the PaymentDetails Page
Given The User is on the Payment Details Page
Then Check the Title of the PaymentDetails Page 

Scenario: cardHolder Name Empty
Given The User is on the Payment Details Page
When user leaves the Card Holder Name Empty
And Clicks on the Next
Then Display the Error Message

Scenario: Debit Card Number Empty
Given The User is on the Payment Details Page
When user leaves the Debit Card Number Empty
And Clicks on the Next
Then Display the Error Message

Scenario: Debit Card CVV Number Empty
Given The User is on the Payment Details Page
When user leaves the Debit Card CVV Number Empty
And Clicks on the Next
Then Display the Error Message

Scenario: Debit Card Month Empty
Given The User is on the Payment Details Page
When user leaves the Debit Card Month Empty
And Clicks on the Next
Then Display the Error Message

Scenario: Debit Card Year Empty
Given The User is on the Payment Details Page
When user leaves the Debit Card Year Empty
And Clicks on Make Payment Button
Then Display Error Message


Scenario: Successfull payment
Given The User is on the Payment Details Page
When user enters all valid  payment details
And Clicks on Make Payment Button
Then show successfull 






