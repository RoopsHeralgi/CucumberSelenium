Feature: feature to test Google search functionality

Scenario: Validate google search is working

Given: browser is open
And user is on google search page
When user enters a text in search box
And clicks enter
Then user is redirected to search results