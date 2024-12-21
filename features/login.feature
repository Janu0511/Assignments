Feature: LeafTap Login Functionality

#static parameterisation//common steps for all scenario
#Background:
#Given Launch the browser and load url

Scenario: Check with possitive data

When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on login button
Then Verify login is Successful

Scenario: Check with negative data
When Enter the username as 'Demo'
And Enter the password as 'crmsfa'
And Click on login button
Then Verify login is Successful