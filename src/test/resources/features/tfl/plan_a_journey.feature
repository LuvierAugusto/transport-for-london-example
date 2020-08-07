Feature: Plan a journey

  Plan a journey between two stations in London

  Scenario: A direct trip between two stations on the same line
    Given George is at Canary Wharf Station
    When he wants to travel to London Waterloo Station
    Then the fastest route should be the Jubilee line to Waterloo