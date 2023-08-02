Feature: Test Web Tours

Background: User is on the Login page
Given User is on the login page

@valid
Scenario Outline: To test WebTours Login page with two valid data
When Enter the username "<username>"
And Enter the password "<password>"
And Click on login button
Then I should see the homepage "Web Tours"
    Examples:
    | username | password  |
    | Divya    | Divya@123 |
    | Div      | Div@123   |
    
@invalid
Scenario: To test WebTours Login page with invalid data
When Enter the "abc"
And Enter the "123"
And Click on login button
Then I should see the homepage "Web Tours"