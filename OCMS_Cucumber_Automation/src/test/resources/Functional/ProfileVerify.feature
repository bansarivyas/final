Feature: Login page

@Homelogin @SmokeTest
Scenario Outline: Login Page
   Given Learner login to site by "<email>" and "<password>"
   Then  Learner click on profile
   Then Learner verify all modules
   
Examples: 
| email                  | password |
| testdata22@gmail.com   | Test@123 |   

