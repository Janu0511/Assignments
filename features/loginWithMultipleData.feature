Feature: Login with multiple data for LeafTap Application

#dynamic parameterisation
Scenario Outline: Login with multiple data
Given Launch the browser and load url
When Enter the username as <userName>
And Enter the password as <passWord>
And Click on login button
Then Verify login is Successful

Examples:
|userName|passWord|
|'Democsr'|'crmsfa'|
|'Democsr2'|'crmsfa'|
|'Demosalesmanager'|'crmsfa'|