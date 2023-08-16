Feature: Test login Functionality 

Scenario Outline: Check Login is successful with valid credentials

Given chromebrowser is open
And user is on demo login page
When user enters <UserName> and <Password>
And user clicks on login
Then user is navigated to the home page

Examples:
|UserName	|Password	|
|Roopa		|12345		|
|Shailesh	|12345		|