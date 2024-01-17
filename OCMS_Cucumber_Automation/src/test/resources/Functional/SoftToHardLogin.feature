Feature: accessing soft login URL with already hard login

@SoftloginForHardLoginUser @SmokeTest
  Scenario Outline: Hard Login user should override the SoftLogin User
    Given Learner login to website by "<Uname>" and "<Pword>"
    When Learner hit Soft login "<Url>" user redirects to an activity
    Then Learner  "<Hard_LoggedIn_User>" override the Soft Login user


Examples: 
| Uname                        | Pword     | Url                                    | Hard_LoggedIn_User           |
| tanaya.jadhav+4@extentia.com | Admin@123 | https://test.clinicaloptions.com/events/targeted-therapeutics-in-cll-and-mcl-applying-emerging-btk-inhibitor-therapy-data-to-practice/emerging-btk-inhibitor-therapy/10532-11284?token=C5B9804E-5E5C-4DBC-B211-B7361442CC78 | tanaya.jadhav+4@extentia.com |
  