Feature: ATra
  Dropdown options

  Background:
    Given I navigate to AutoTrader
    And I enter postcode

    @ATT

  Scenario: MIN
    And I select the dropdown options min
    When I select search min
    Then I see the results min

  Scenario: MAX
    And I select the dropdown options max
    When I select search max
    Then I see the results max