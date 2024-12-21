Feature: salesforce account edit 

Scenario: edit account Janani s

Given launch the browser and load the url
When enter the username as 'dilip@testleaf.com'
And enter the password as 'leaf@2024'
Then Click the App Launcher Icon next to setup
And Click View All and Select Accounts from App launcher
And Search the account name as Janani s
And Click the dropdown icon and select Edit
And Set Type to Technology Partner
And Set Industry to HealthCare
And Enter the Billing address to 'Chennai'
And Enter the Shipping address to 'Velachery'
And Set Customer Priority to Low
And Set SLA to Silver
And Set Active to NO
And Enter a Unique Phone number "9123456789"
And Set Upsell Opportunity to NO
And Click Save
Then verify the phone number