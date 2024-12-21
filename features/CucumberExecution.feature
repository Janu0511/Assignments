Feature: salesforce acc name change

Scenario: verify acc name is updated

Given load the url
When enter the username as dilip@testleaf.com
And enter the password as leaf@2024
And click on login button
Then click on the toggle button 
When click view all
And click sales 
And click on account tab
And click on new button
When enter acc name 
And select ownership as public
Then verify acc name