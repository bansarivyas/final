Feature: Login page

@Homelogin @SmokeTest
Scenario Outline: Login Page
Given I enter "<Url>" using "<Email>" "<Password>"
When I click on signin button
Then I am able to see welcome title