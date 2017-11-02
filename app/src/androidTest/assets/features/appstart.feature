Feature: Loads a bike image catalogue on start

  Scenario: User opens app
    Given I wait for manual attachment of the debugger
    Given A bike image
    When The app launches
    Then A bike image should be rendered