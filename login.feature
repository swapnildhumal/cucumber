Feature:
test orange hrm
Scenario:
to test login functionality
Given i should be in the login page
When enter the username "Admin"
And enter the password "admin123"
And click on the login button
Then i should see the username as "orange HRM"