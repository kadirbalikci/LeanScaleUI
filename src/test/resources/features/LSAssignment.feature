@LeanScaleSmoke
Feature: Lean Scale Assignment

  Background:
    Given the user is on the Lean Scale home page

  Scenario: Register with valid data
    Given the user navigates to the register page
    When User enters valid register information
    Then User should create an account successfully


  Scenario: Register with invalid data
    Given the user navigates to the register page
    When User enters invalid register information
    Then User should get an error message

  Scenario: Add an item to the cart as a guest
    Given the user makes a search the product with "MT07" stock number
    When User configures the attributes of the product and add to the cart
    Then User should the product in the cart section


  Scenario: Add an item to the cart as a registered user
    Given User logins with the valid credentials
    And the user makes a search the product with "MT07" stock number
    When User configures the attributes of the product and add to the cart
    Then User should the product in the cart section
    And Username should be displayed at the right top corner

  @wip
  Scenario: Register with valid data
    Given the user navigates to the register page
    When System generates random name, lastname and email register data
    Then User should create an account with the generated email successfully