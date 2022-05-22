@signUpFeature
Feature: Validate sign-up funtion

  @validCredentialSignUp
  Scenario Outline: Verify user can sign-up with valid credentials
    Given Launch "<URL>"
    When I click sign-up button
    And User types  "<userName>" and "<passWord>"
    And click sign-up
    Then Verify sign-up successfull

    Examples: 
      | userName | passWord |
      | fatemmmmm  |   123456 |

  @invalidCredentialSignUp
  Scenario Outline: Verify user cannot sign-up with invalid credentials
    Given Launch "<URL>"
    When I click sign-up button
    And User types  "<userName>" and "<passWord>"
    And click sign-up
    Then Verify sign-up is not successfull

    Examples: 
      | userName  | passWord |
      |           |   123456 |
      |           |          |
      | pakhirdim |          |
