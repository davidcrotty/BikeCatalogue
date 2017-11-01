Feature: Loads a catalogue of bike images

  Scenario: User initiates catalogue and wishes to view bikes
    Given A load button on screen
    When User taps load button
    Then Bike data should be displayed