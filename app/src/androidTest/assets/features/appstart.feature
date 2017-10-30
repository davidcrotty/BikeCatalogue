Feature: Loads a bike image catalogue on start

  Scenario: User opens app
    Given A bike image
    When The app launches
    Then A bike image should be rendered