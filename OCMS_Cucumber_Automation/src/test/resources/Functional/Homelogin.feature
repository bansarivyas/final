Feature: Login page

@Homelogin @SmokeTest
Scenario Outline: Login Page
Given Learner login to site by using "<email>" and "<password>"
Then Learner able to see welcome title

Examples: 
| email                  | password |
| testdata22@gmail.com   | Test@123 |
