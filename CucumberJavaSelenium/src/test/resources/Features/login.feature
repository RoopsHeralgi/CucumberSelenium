#Author
#Date
#Description

Feature: feature to test login functionality

Scenario Outline: Check login successful with valid credentials

Given User Launch the browser
And User open url "https://example.testproject.io/web/"
When user enters "<UserName>" and "<Password>"
And user clicks on login
Then user is navigated to the home page

Examples:
|UserName	|Password	|
|Roopa		|12345		|
|Shailesh	|12345		|