Feature: Addition

  Rules for basic addition:
  - Only non-negative numbers
  - The operator has to be specified after both operands have been entered

  @basic
  @story:8018
  Scenario: Add two numbers
    Given I have entered 5 into the calculator
    And I have entered 8 into the calculator
    When I choose add
    Then the result should be 13
