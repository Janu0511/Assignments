#Feature describes the functionality of the application
Feature: Create Account - LeafTaps

#Given launch and load url - pre and post condtion

#Scenario describes the behaviour of the testcase
Scenario Outline: creating a new account in leaftaps application

#When represents the test condition
When Crmsfa link should be clicked

#And represents the combination of multiple steps
And Account tab should be clicked
And Create account button should be clicked
And Account name should be entered as <UserName>
And Submit button should be clicked

#Then represents the expected result
Then Check account is created

Examples:
|UserName|
|'Demo user1'|
|'Demo user2'|