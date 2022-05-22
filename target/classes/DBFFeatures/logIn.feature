@logInFeature
Feature: Validate login funtion

  @validCredential
  Scenario Outline: Verify user can login with valid credentials
    Given Launch "<URL>"
    When I click login button
    And User enters  "<username>" and "<password>"
    And click login
    Then Verify login successfull

    Examples: 
      | username        | password |
      | fatemaAktersumi |   123456 |
      | fatemai  				|   123456 |

  @invalidCredential
  Scenario Outline: Verify user cannot login with invalid credentials
    Given Launch "<URL>"
    When I click login button
    And User enters  "<username>" and "<password>"
    And click login
    Then Verify login is not successfull

    Examples: 
    	| username  | password |
      |           | 123456 |
      |           |        |
      | pakhirdim |        |
