Feature: headers
  @links

  Scenario Outline: Click on header links
    Given I navigate to BBC
    When I click on <headers>
    Then I see the <headers> page
    Examples:
    |headers|
    |Home   |
    |News   |
    |Sport  |
    |Weather|
    |Iplayer|
    |Sounds |
    |CBBC   |
