Feature: Add support for network pictures

  Scenario: User wants to view a new bike image
    Given A downloadable URL and button
    When User taps download button
    Then After a network delay, provide an image