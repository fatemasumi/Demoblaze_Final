@cartFeature
Feature: Validate Cart page

 @productPicture
  Scenario: Validate product Picture on Cart page
    Given Launch "<URL>"
    When Click on Galaxy S6
    When Click on add to cart button & Accept pop-up
    When Click on cart button
    Then Verify product picture is displayed

  @productTitle
  Scenario: Validate product title on Cart page
    Given Launch "<URL>"
    When Click on Galaxy S6
    When Click on add to cart button & Accept pop-up
    When Click on cart button
    Then Verify product title is displayed

  @productPrice
  Scenario: Validate product price on Cart page
    Given Launch "<URL>"
    When Click on Galaxy S6
    When Click on add to cart button & Accept pop-up   
    When Click on cart button
    Then Verify product  price is displayed

  @getInTouch
  Scenario Outline: Validate get in touch displayed  on Cart page
    Given Launch "<URL>"
    When Click on cart button
    Then Verify get in touch is displayed on the bottom of the cart page

  @aboutUs
  Scenario: Validate About us is displayed on Cart page
    Given Launch "<URL>"
    When Click on cart button
    Then Verify get in About us is displayed on the bottom of the cart page

  @placeOrder
  Scenario: validate Place Order button on Cart page
    Given Launch "<URL>"
    When Click on Galaxy S6
    When Click on add to cart button & Accept pop-up
    When Click on cart button
    Then verify Place order button displayed on cart page

  @placeOrderClicks
  Scenario: validate Place Order button on Cart page is clickable
    Given Launch "<URL>"
    When Click on Galaxy S6
    When Click on add to cart button & Accept pop-up
    When Click on cart button
    When Click on Place Order button
    Then Verify Place Order form displayed
