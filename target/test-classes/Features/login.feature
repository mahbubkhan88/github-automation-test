Feature: Check the login feature to github.com website

Scenario: Check the login credentials works perfectly.
Given Browse the website
And Click on sign-in button
When User has provide the valid credentials
Then User shoul be able to login