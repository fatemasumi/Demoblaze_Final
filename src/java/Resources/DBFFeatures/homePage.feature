@homePageFeature
Feature: Validate demoblaze Homepage

  @home
  Scenario: verify demoblaze Homepage
    Given User launch "<URL>"
    Then Validate homapage is displayed

  @phones
  Scenario: verify phones under Categories feature is clickable
    Given User launch "<URL>"
    When Clicks on phones
    Then Validate phones is displayed

  @laptops
  Scenario: verify laptops under Categories feature is clickable
    Given User launch "<URL>"
    When Clicks on laptops
    Then Validate laptops is displayed

  @monitors
  Scenario: verify monitors under Categories feature is clickable
    Given User launch "<URL>"
    When Clicks on monitors
    Then Validate monitors is displayed

  @homeButton
  Scenario: Verify Home button on homepage header is clickable
    Given User launch "<URL>"
    When Clicks on Home button
    Then Validate homapage is displayed

  @cartButton
  Scenario: Verify Cart button on homepage header is clickable
    Given User launch "<URL>"
    When Clicks on Cart button
    Then Validate Cart button is Clickable"

  @contactButton
  Scenario: Verify contact button on homepage header is clickable
    Given User launch "<URL>"
    When Clicks on Contact button
    Then Validate contact button is Clickable"

  @aboutUsButton
  Scenario: Verify About us button on homepage header is clickable
    Given User launch "<URL>"
    When Clicks on About us button
    Then Validate About us button is Clickable

  @logInButton
  Scenario: Verify Log in button on homepage header is clickable
    Given User launch "<URL>"
    When Clicks on log in button
    Then Validate log in button is Clickable"

  @signUpButton
  Scenario: Verify Sign up button on homepage header is clickable
    Given User launch "<URL>"
    When Clicks on Sign up button
    Then Validate Sign up button is Clickable"
